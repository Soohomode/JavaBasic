import java.util.Scanner;

public class GgamJjak_01 {

    public static void displayMenu() {

        String[] menuList = {
                "<<<<[메뉴선택]>>>>"
                , "1. 회원 관리"
                , "2. 과목 관리"
                , "3. 수강 관리"
                , "4. 결제 관리"
                , "5. 종료"
        };

//        for (int i = 0; i < menuList.length; i++) {
//            System.out.println(menuList[i]);
//        }

        for (String menu : menuList) {
            System.out.println(menu);
        }

    }

    public static void selectMenu(int check) {
        switch (check) {
            case 1:
                System.out.println("회원 관리 메뉴를 선택했습니다.");
                break;

            case 2:
                System.out.println("과목 관리 메뉴를 선택했습니다.");
                break;

            case 3:
                System.out.println("수강 관리 메뉴를 선택했습니다.");
                break;

            case 4:
                System.out.println("결제 관리 메뉴를 선택했습니다.");
                break;

            case 5:
                System.out.println("프로그램을 종료합니다.");
                break;

            default:
                System.out.println("입력값이 정확하지 않습니다.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int check = 0;

        do {
            displayMenu();

            System.out.print("입력 : ");

            check = sc.nextInt();

            selectMenu(check);

        } while (check != 5); // check가 5가 되면 false가되기때문에 반복문 종료
        ;
    }
}
