// Java 프로그래밍 - 추상 클래스

// 추상 클래스 Person

abstract class Person {
    abstract void printInfo();
}


// 추상 클래스 상속
class Student extends Person { // 추상 클래스를 상속 했기에, 꼭 안에 추상클래스를 입력해야한다
    public void printInfo() {
        System.out.println("Student.printInfo");
    }

    public void printAi() {
        System.out.println("애📱");
    }
}


public class Main {

    public static void main(String[] args) {

//        추상 클래스의 사용
//        Person p1 = new Person(); 기능 구현이 되어있지 않은 추상 클래스의 객체를 만드는건 불가능
        Student s1 = new Student();
        s1.printInfo();
        s1.printAi();

        // 또 다른 사용방법
        Person p2 = new Person() { // 익명 클래스
            @Override
            void printInfo() {
                System.out.println("Main.printInfo");
            }
        };
        p2.printInfo();
    }

}
