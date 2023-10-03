// Java 프로그래밍 - 조건문

public class Main2 {
    public static void main(String[] args) {

//      1. 조건문 - if
        System.out.println("== if ==");

        int waterTemperature = 100;

        if (waterTemperature >= 100) {
            System.out.println("물이 끓습니다요!");
        } else {
            System.out.println("물을 끓이는 중입니다요!");
        }

        // 점수에 따라 grade를 매기는 if문 만들기
        int score = 80;
        char grade = 0;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("grade = " + grade);

//      2. 조건문 - switch
        System.out.println("== switch ==");

        String fruit = "blueberry";

        switch (fruit) {
            case "apple":
                System.out.println(fruit + "은 5000원 입니다.");
                break;
            case "blueberry":
                System.out.println(fruit + "은 10000원 입니다.");
                break;
            default:
                System.out.println("해당 과일이 없습니다.");
                break;
        }


//      Q1. number의 값이 홀수인지 짝수인지 판단하는 코드를 작성하세요.
        System.out.println("Q1. 문제");

        int number = 5;

        if (number % 2 == 0) {
            System.out.println("짝수 입니다!");
        } else {
            System.out.println("홀수 입니다!");
        }


//      Q2. 아래 주석은 위의 실습에서 진행한 score에 따라 grade를 출력하는 코드이다.
//        이를 switch 조건문 기반으로 바꿔보세요.
        System.out.println("Q2. 문제");
//        int score = 90;
//        char grade = 0;
//        if (score >= 90) {
//            grade = 'A';
//        } else if (score >= 80) {
//            grade = 'B';
//        } else if (score >= 70) {
//            grade = 'C';
//        } else {
//            grade = 'F';
//        }
//        System.out.println("grade = " + grade);


        // 10을 나누는 이유는 int형이기 때문에 소수점은 날아가고, score가 95점이면 나누기 10을 했을때 9.5
        // 의 0.5가 날아가서, 9가 되어 95도 스위치 문에서 A를 받을수 있다. 그렇기 ,때문에 case 값도 10을 나눈다
        // 아니면 일일히 91,92,93... 다 A로 처리해야 할것이다.
        score = 95;
        grade = 0;

        switch (score / 10) {
            case 10:
                grade = 'S';
                break;
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'F';
                break;
        }
        System.out.println("grade = " + grade);
    }
}

