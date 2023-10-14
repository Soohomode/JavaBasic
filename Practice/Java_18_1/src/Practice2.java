import java.util.Scanner;

public class Practice2 {
    public static void solution() {

        Scanner sc = new Scanner(System.in);
        System.out.print("알파벳 입력 : ");
        char input = sc.nextLine().charAt(0); // 값하나 가져옴
        int output = 0; // 출력값을 저장하기위한 변수

        int step = (int)'a' - (int)'A'; // 아스키 코드 값의 사이값 구해서 저장 32

        if (input >= 'a' && input <= 'z') { // 소문자를 받았을경우 if
            output = (int)input - step;
            System.out.println("대문자 변환 : " + (char)output);
        } else if (input >= 'A' && input <= 'Z') { // 대문자를 받았을경우 if
            output = (int)input + step;
            System.out.println("소문자 변환 : " + (char)output);
        } else {
            System.out.println("입력하신 값이 알파벳이 아닙니다.");
        }
    }

    public static void reference() {
        int a = (int)'a';
        System.out.println("a = " + a);
        int z = (int)'z';
        System.out.println("z = " + z);
        int A = (int)'A';
        System.out.println("A = " + A);
        int Z = (int)'Z';
        System.out.println("Z = " + Z);
        int etc = (int)'%';
        System.out.println("etc = " + etc);
    }

    public static void main(String[] args) {
//        reference();    // 아스키 코드 참고
        solution();
    }
}
