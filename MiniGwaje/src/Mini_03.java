// 유수호

import java.util.Objects;
import java.util.Scanner;

public class Mini_03 {
    public static void main(String[] args) {

        System.out.println("[입장권 계산]");

        Scanner scAge = new Scanner(System.in);
        System.out.print("나이를 입력해 주세요.(숫자): ");
        int age = scAge.nextInt();

        Scanner scTime = new Scanner(System.in);
        System.out.print("입장시간을 입력해 주세요.(숫자입력): ");
        int time = scTime.nextInt();

        Scanner scYugong = new Scanner(System.in);
        System.out.print("국가유공자 여부를 입력해 주세요.(y/n): ");
        String yugong = scYugong.nextLine();

        Scanner scBokji = new Scanner(System.in);
        System.out.print("복지카드 여부를 입력해 주세요.(y/n): ");
        String bokji = scBokji.nextLine();

        int totalPay = 10000; // 기본 입장료

        if (age < 3) { // 나이 할인
            totalPay = 0;
        } else if (age < 13 && totalPay > 4000) {
            totalPay = 4000;
        }

        if (time >= 17 && totalPay > 4000) { // 시간 할인
            totalPay = 4000;
        }

        if (Objects.equals(yugong, "y") && totalPay > 8000) { // 유공자 할인
            totalPay = 8000;
        }

        if (Objects.equals(bokji, "y") && totalPay > 8000) { // 복지카드 할인
            totalPay = 8000;
        }

        System.out.printf("입장료: %d원", totalPay);
    }
}
