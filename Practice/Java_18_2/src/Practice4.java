
public class Practice4 {
    public static String solution(int[] keyLog) {
        final int BACK_SPACE = 8;
        final int SHIFT = 16;
        final int CAPS_LOCK = 20;
        final int SPACE_BAR = 32;
        final int KEY_LEFT = 37;
        final int KEY_RIGHT = 39;
        final int INSERT = 155;
        final int DELETE = 127;

        StringBuffer sb = new StringBuffer();

        int step = (int)('a' - 'A'); // 대소문자 (아스키 코드값)

        int curSor = 0; // 커서
        int cmdIdx = 0; // 커맨드인덱스 (인덱스값 0부터 하나씩 커맨드를 읽기위해)
        boolean isShift = false; // shift키 눌렀는지
        boolean isCapsLock = false; // capslock키 눌렀는지
        boolean isInsert = false; // insert키 눌렀는지

        while (cmdIdx != keyLog.length) { // 커맨드 0부터 끝까지 읽기위해 반복문을 돌림
            int cur = keyLog[cmdIdx]; // 커맨드를 cur 변수에 저장

            if (cur == BACK_SPACE) {
                if (curSor == 0) {
                    cmdIdx++;
                    continue;
                }
                sb.delete(curSor - 1, curSor); // -1부터 현재꺼 까지 지운다는 의미
                curSor = Math.max(0, curSor -1); // 커서를 좌측으로 한칸 이동한다는 의미
            } else if (cur == SHIFT) {
                isShift = true;
            } else if (cur == CAPS_LOCK) {
                isCapsLock = !isCapsLock; // 캡스락키의 특성으로 껏다 켰다 기능을 만듬 (켜져있음 꺼지게, 꺼져있음 켜지게)
            } else if (cur == SPACE_BAR) {
                // 공백 문자 넣기
                inputData(sb, ' ', curSor, isInsert); // 호출
                curSor += 1;
            } else if (cur == KEY_LEFT) { // 커서를 왼쪽으로
                curSor = Math.max(0, curSor -1);
            } else if (cur == KEY_RIGHT) {
                curSor = Math.min(sb.length(), curSor + 1);
            } else if (cur == INSERT) {
                isInsert = !isInsert;
            } else if (cur == DELETE) { // 자리에 해당하는 값을 지우는것
                if (curSor == sb.length()) { // 문자열 가장 끝에 커서가있을때는 지울게 없다
                    cmdIdx++;
                    continue;
                }
                sb.delete(curSor, curSor + 1); // 커서의 좌측이 아니라, 커서 위치의 문자를 지움
            } else if (cur >= 97 && cur <= 122) { // 알파벳이 들어왔을때
                int data = cur;

                if (isCapsLock && isShift) { // 둘다 누르면 소문자
                    data = cur; // 변화없음
                } else if (isCapsLock || isShift) { // 둘 중 하나 켜지면 대문자
                    data -= step;
                }
                // 데이터 입력 (알파벳부분)
                inputData(sb, (char)data, curSor, isInsert); //호출
                isShift = false; // 한번 눌러서 켜지는게 아니라서 shift키 특성 생각해바
                curSor += 1;
            } else if (cur >= 48 && cur <= 57) { // 48부터 57까지 (숫자가 들어왔을때)
                //특수문자 shift + 숫자 누르면 특수문자
                if (isShift) {
                    char[] specialKey = {')', '!', '@', '#', '$', '%', '^', '&', '*', '('}; // 0 ~ 9
                    inputData(sb, specialKey[cur - '0'], curSor, isInsert); // 호출
                } else { // 그냥 숫자가 들어가게
                    inputData(sb, (char)cur, curSor, isInsert);
                }
                // 데이터 입력 (숫자부분)

                isShift = false; // 한번 눌러서 켜지는게 아니라서 shift키 특성 생각해바
                curSor += 1;
            }
            cmdIdx++;
        }

        return sb.toString(); // stringbuffer를 string으로 변환해서 리턴
    }

    public static void inputData(StringBuffer sb, char data, int curSor, boolean isInsert) {
        if (isInsert == false) {
            sb.insert(curSor, data); // 커서위치에다가 데이터를 넣어줌
        } else {
            sb.setCharAt(curSor, data); // 해당위치 값만 바꿔줌
        }
    }

    public static void main(String[] args) {
        // Test code
        int[] keyLog = {16, 106, 101, 108, 108, 111, 37, 37, 37, 37, 37, 155, 16, 104};
        System.out.println(solution(keyLog));

        keyLog = new int[]{20, 104, 16, 105, 32, 20, 16, 106, 97, 118, 97};
        System.out.println(solution(keyLog));

        keyLog = new int[]{49, 51, 8, 50, 51, 53, 55, 37, 37, 127, 127, 52, 53};
        System.out.println(solution(keyLog));

        keyLog = new int[]{20, 97, 98, 16, 99, 16, 100, 16, 49, 16, 50, 16, 51};
        System.out.println(solution(keyLog));
    }
}
