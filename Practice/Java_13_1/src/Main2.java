// Java 프로그래밍 - 입출력_1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main2 {

    public static void referInputStream() throws IOException {
//      System.in
        System.out.println("== System.in ==");
        System.out.print("입력 : ");
        int a = System.in.read() - '0'; // char 값을 받아오는 명령어
        /* in.read()는 캐릭터값을 하나 받아올수있고, 숫자값을 받아오면 문자로 인식(아스키코드)
        - '0' 으로 아스키코드값 만큼 빼서 숫자로 변환해준다 */
        System.out.println("a = " + a);
        System.in.read(new byte[System.in.available()]); // 입력하고 엔터키를 누르게되면

//      바로 위의 명령문을 입력하지 않으면 밑에 입력이 불가하다

//      InputStreamReader
        System.out.println("== InputStreamReader ==");
        InputStreamReader reader = new InputStreamReader(System.in);
        char[] c = new char[3];
        System.out.println("입력 : ");
        reader.read(c);
        System.out.println(c);

//      BufferedReader
        System.out.println("== BufferedReader ==");

    }

    public static void main(String[] args) throws IOException {

//      1. 입력
//      1-1. 다른 입력 방식 참고
//        referInputStream();

//      1-2. Scanner
        System.out.println("== Scanner ==");




//      참고) 정수, 문자열 변환


//      2. 출력
        System.out.println("== 출력 ==");




        // 서식문자


    }
}
