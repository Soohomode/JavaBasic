
public class Practice1 {
    public static void solution(int num) {
        int numReverse = 0; // 거꾸로된 결과를 저장할 변수
        boolean isMinus = false;

        if (num < 0) {
            isMinus = true;
            num *= -1; // -1을 곱함으로 음수로 만듬
        }

        while (num > 0) {
            int r = num % 10; // 맨뒷자리를 때서 r에 저장 12345 -> 5
            num /= 10; // 10으로 나눠서 맨뒷자리를 땜 12345 -> 1234
            numReverse = numReverse * 10 + r; // 5 그다음 반복 54 ~ 543 ~ 5432 ~ 54321
        }

        System.out.println(isMinus ? numReverse * -1 : numReverse);

    }

    public static void main(String[] args) {
        // Test code
        solution(12345);
        solution(-12345);
        solution(100);
        solution(0);
    }
}
