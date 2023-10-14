public class Practice3 {
    public static String solution(char[] str, char[] find, char[] to) {
        int idx = 0; // 인덱스 변수
        String replaceStr = ""; // 최종 변경된 데이터를 담을 변수
        char[] replaceBucket = str.clone(); // 임시로 사용할 배열변수

        do {
            idx = findIndex(replaceBucket, find);

            if (idx != -1) { // -1이 아니면
                for (int i = 0; i < idx; i++) {
                    replaceStr += replaceBucket[i];
                }

                for (int i = 0; i < to.length; i++) {
                    replaceStr += to[i];
                }

                for (int i = idx + find.length; i < replaceBucket.length; i++) {
                    replaceStr += replaceBucket[i];
                }

                replaceBucket = replaceStr.toCharArray();
                replaceStr = ""; // Java 라는 단어가 하나만 있지 않고 뒤에도 있기때매 더 반복문 돌리기위해서

            }

        } while (idx != -1); // -1이란것은 findIndex에서 매칭되는 문자를 찾지못했을때 -1을 반환(매칭되는게 없을때 까지 반복돌림)

        replaceStr = new String(replaceBucket); // char를 String으로 변환해서 넣음
        return replaceStr;
    }

    public static int findIndex(char[] str, char[] find) { // 문자열에서 해당 위치 찾는 함수
        int idx = -1;
        boolean isMatch = false; // 찾은게 있는지 체크하는 변수

        for (int i = 0; i < str.length; i++) {
            if (str[i] == find[0] && str.length - i >= find.length) { // 첫글자가 같은지 확인, 또 찾으려는 글자 수보다 크거나 같은지
                isMatch = true;
                for (int j = 1; j < find.length; j++) { // 1부터 시작한 이유는 위에 if문에서 확인을 했기 때문 (첫글자는 같다)
                    if (str[i + j] != find[j]) { // 한글자라도 다를경우 체크
                        isMatch = false;
                        break;
                    }
                }
            }
            if (isMatch) {
                idx = i; // 찾은 위치에 저장
                break;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        // Test code
        String str = "Hello Java, Nice to meet you! Java is fun!";
        String find = "Java";
        String to = "자바";

        // 기존 String replace
        System.out.println(str.replace(find, to));

        // 자체 구현 replace
        char[] strExArr = str.toCharArray();
        char[] findArr = find.toCharArray();
        char[] toArr = to.toCharArray();
        System.out.println(solution(strExArr, findArr, toArr));

        strExArr = "POP".toCharArray();
        findArr = "P".toCharArray();
        toArr = "W".toCharArray();
        System.out.println(solution(strExArr, findArr, toArr));
    }
}
