// 유수호

import java.time.LocalDate;
import java.util.Scanner;

public class Mini_05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
        int year = sc.nextInt();
        System.out.print("달력의 월을 입력해 주세요.(mm):");
        int month = sc.nextInt();

        System.out.println();

        int date = 1; // 일
        int day;      // 요일
        LocalDate firstDate = LocalDate.of(year, month, date); // 해당월의 1일
        day = firstDate.getDayOfWeek().getValue();

        // 달력 출력
        System.out.printf("[%d년 %02d월]\n", year, month);
        System.out.println("일\t월\t화\t수\t목\t금\t토\t");

        // 1일 전까지의 공백 생성
        for (int i = 0; i < day % 7; i++) {
            System.out.print("\t");
        }

        // 달력 일 출력
        for (int i = 1; i <= firstDate.lengthOfMonth(); i++) {
            System.out.printf("%02d\t", date++);
            day++;

            if (day % 7 == 0) { // 다음 주로 줄 바꿈
                System.out.println();
            }
        }
    }
}
