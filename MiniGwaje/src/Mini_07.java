/* 유수호
 *  로또 당첨 프로그램
 * */

import java.util.Arrays;
import java.util.Scanner;

public class Mini_07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("[로또 당첨 프로그램]\n");

        System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10):");
        int 로또개수 = sc.nextInt();

        int[][] 로또번호 = new int[로또개수][6];
        char[] 로또이름 = new char[로또개수];

        for (int i = 0; i < 로또개수; i++) {
            로또번호[i] = 생성된로또번호();
            로또이름[i] = (char) ('A' + i);
        }

        // 당첨번호 생성
        int[] 당첨번호 = 생성된로또번호();

        // 생성된 로또번호 출력
        for (int i = 0; i < 로또개수; i++) {
            System.out.printf("%s\t", 로또이름[i]);
            for (int j = 0; j < 6; j++) {
                System.out.printf("%02d", 로또번호[i][j]);
                if (j < 5) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        // 당첨번호 출력
        System.out.println("\n[로또 발표]");
        System.out.print("\t");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%02d", 당첨번호[i]);
            if (i < 5) {
                System.out.print(", ");
            }
        }
        System.out.println();


        // 로또 비교 및 당첨 확인
        System.out.println("\n[내 로또 결과]");
        for (int i = 0; i < 로또개수; i++) {
            int 일치개수 = 0;
            System.out.printf("%s\t", 로또이름[i]);
            for (int j = 0; j < 6; j++) {
                System.out.printf("%02d", 로또번호[i][j]);
                if (로또번호[i][j] == 당첨번호[j]) {
                    일치개수++;
                }
                if (j < 5) {
                    System.out.print(", ");
                }
            }
            System.out.printf(" => %d개 일치\n", 일치개수);
        }
        System.out.println("");
    }

    // 로또 번호 생성 메서드
    public static int[] 생성된로또번호() {
        int[] 번호 = new int[6];
        int idx = 0;

        while (idx < 6) {
            int 랜덤숫자 = (int) (Math.random() * 45) + 1;
            boolean 중복 = false;

            for (int i = 0; i < idx; i++) {
                if (번호[i] == 랜덤숫자) {
                    중복 = true;
                    break;
                }
            }

            if (!중복) {
                번호[idx] = 랜덤숫자;
                idx++;
            }
        }

        Arrays.sort(번호); // 번호 정렬
        return 번호;
    }
}
