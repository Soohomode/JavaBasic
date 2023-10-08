// 유수호

import java.util.Random;
import java.util.Scanner;

public class Mini_04 {
    public static void main(String[] args) {

        System.out.println("[주민등록번호 계산]");

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        int year = sc.nextInt();

        System.out.print("출생월을 입력해 주세요.(mm):");
        int month = sc.nextInt();

        System.out.print("출생일을 입력해 주세요.(dd):");
        int day = sc.nextInt();

        System.out.print("성별을 입력해 주세요.(m/f):");
        char gender = sc.next().charAt(0);

        int genderN = (gender == 'm') ? 1 : 2;

        if (gender == 'm') {
            genderN = (rd.nextInt(5) * 2) + 1;
        } else if (gender == 'f') {
            genderN = (rd.nextInt(4) * 2) + 2;
        } else {
            System.out.println("올바른 성별을 입력하세요.");
            return;
        }

        // 주민등록번호 뒷6자리
        int randomBack = rd.nextInt(500000) * 2 + 1;

        // 주민등록 번호 생성
        System.out.printf("%02d%02d%02d-%d%06d", year % 100, month, day, genderN, randomBack);
    }
}