// Java 프로그래밍 - 입출력_2

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
//      1. 파일 쓰기
//      FileWriter
        FileWriter fw = new FileWriter("./memo.txt"); // 현재폴더에 txt 파일 만듬
        String memo = "헤드 라인\n";
        fw.write(memo);

        memo = "1월 1일 날씨 맑음\n";
        fw.write(memo);

        fw.close(); // 파일 쓰기가 완료되면 꼭 닫아줘야함

//      PrintWriter
        PrintWriter pw = new PrintWriter("./memo.txt");
        memo = "헤드 라인";
        pw.println(memo); // pw는 \n으로 줄바꿈이 아니라 println이 따로 있다

        memo = "1월 1일 날씨 맑음";
        pw.println(memo);

        pw.close();

//      파일 이어 쓰기
        FileWriter fw2 = new FileWriter("./memo.txt", true);

        memo = "1월 2일 날씨 완전 맑음\n";
        fw2.write(memo);

        fw2.close();

        PrintWriter pw2 = new PrintWriter(new FileWriter("./memo.txt", true));
        // PrintWriter는 안에 FileWriter를 넣어야 한다
        memo = "1월 3일 날씨 또 맑음!";
        pw2.println(memo);
        pw2.close();

//      2. 파일 입력
        BufferedReader br = new BufferedReader(new FileReader("./memo.txt"));

        while (true) {
            String line = br.readLine();

            if (line == null) {
                break;
            }
            System.out.println(line);
        }
        br.close();
    }
}
