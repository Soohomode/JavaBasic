import java.util.ArrayList;

public class Practice3 {
    public static String solution(String input, String cmd) {
        // 문자열이 빈번하게 변한다면 StringBuffer가 좋다
        StringBuffer sb = new StringBuffer(input);
        ArrayList<String> cmdArr = new ArrayList<>();

        for (String s: cmd.split(" ")) {
            cmdArr.add(s);
        }

        int curSor = sb.length(); // 커서의 위치를 잡는다
        int cmdIdx = 0; // 커맨드에 사용할 인덱스 만듬

        while (cmdIdx != cmdArr.size()) { // 가장 끝에 있는 커맨드까지 실행하기 위해
            String cur = cmdArr.get(cmdIdx);

            if (cur.equals("L")) {
                curSor = Math.max(0, curSor - 1); // 커서가 0보다 왼쪽으로 갈순없으니까
            } else if (cur.equals("D")) {
                curSor = Math.min(sb.length(), curSor + 1);
                // 오른쪽으로 가지만 length로 인해 가장 min 한 곳으로(문자열 끝으로)
            } else if (cur.equals("B")) {
                if (curSor == 0) {
                    cmdIdx++;
                    continue;
                }
                sb.delete(curSor - 1, curSor); // 좌측의 한 데이터 지움
                curSor = Math.max(0, curSor - 1); // 커서의 위치를 좌측으로 옮김
            } else if (cur.equals("P")) {
                String s = cmdArr.get(++cmdIdx);
                sb.insert(curSor, s); // curSor위치에다가 s(위에 추출한 문자열)를 넣어줌
                curSor += 1;
            }

            cmdIdx++;

        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // test code
        System.out.println(solution("aba", "L B"));
        System.out.println(solution("abcd", "P x L P y"));
        System.out.println(solution("abc", "L L L P x L B P y"));
        System.out.println(solution("a", "B B L L D D P a P b P c"));
    }
}
