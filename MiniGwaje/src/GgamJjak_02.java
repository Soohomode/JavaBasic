public class GgamJjak_02 {

    // 자바 => 클래스로 되어 있습니다.
    // 클래스 ==> 속성과 메서드
    public static void main(String[] args) {

        String filePath = "/Users/sooho/ZEROBASE/StudyData/part-01-java/Part 01. Java code/MiniGwaje/src/textsample.txt";

        FileUtils fileUtils = new FileUtils();

        String fileText = fileUtils.getLoadText(filePath);
        fileText = fileText.toLowerCase(); // 다 소문자로 변경

        int[] alphCnt = {
//              a,b,c,d,e,f,g,h,i,j ...
                0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0
        };

        int totalCount = 0;

        for (int i = 0; i < fileText.length(); i++) {
            char c1 = fileText.charAt(i);

            if (c1 == 'a') {
                alphCnt[0]++;
            } else if (c1 == 'b') {
                alphCnt[1]++;
            } else if (c1 == 'c') {
                alphCnt[2]++;
            } else if (c1 == 'd') {
                alphCnt[3]++;
            } else if (c1 == 'e') {
                alphCnt[4]++;
            } else if (c1 == 'f') {
                alphCnt[5]++;
            } else if (c1 == 'g') {
                alphCnt[6]++;
            } else if (c1 == 'h') {
                alphCnt[7]++;
            } else if (c1 == 'i') {
                alphCnt[8]++;
            } else if (c1 == 'j') {
                alphCnt[9]++;
            } else if (c1 == 'k') {
                alphCnt[10]++;
            } else if (c1 == 'l') {
                alphCnt[11]++;
            } else if (c1 == 'm') {
                alphCnt[12]++;
            } else if (c1 == 'n') {
                alphCnt[13]++;
            } else if (c1 == 'o') {
                alphCnt[14]++;
            } else if (c1 == 'p') {
                alphCnt[15]++;
            } else if (c1 == 'q') {
                alphCnt[16]++;
            } else if (c1 == 'r') {
                alphCnt[17]++;
            } else if (c1 == 's') {
                alphCnt[18]++;
            } else if (c1 == 't') {
                alphCnt[19]++;
            } else if (c1 == 'u') {
                alphCnt[20]++;
            } else if (c1 == 'v') {
                alphCnt[21]++;
            } else if (c1 == 'w') {
                alphCnt[22]++;
            } else if (c1 == 'x') {
                alphCnt[23]++;
            } else if (c1 == 'y') {
                alphCnt[24]++;
            } else if (c1 == 'z') {
                alphCnt[25]++;
            }
        }

        for (int i = 0; i < alphCnt.length; i++) {
            totalCount += alphCnt[i];
        }

        for (int i = 0; i < alphCnt.length; i++) {
            double rate = (double) alphCnt[i] / totalCount * 100;

            String format = String.format("%c = %6d, \t %.2f%%", i + 65, alphCnt[i], rate);
            System.out.println(format);
        }
    }
}
