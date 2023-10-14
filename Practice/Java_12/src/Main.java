// Java 프로그래밍 - 내부 클래스

// 내부 클래스 구조
class Outer { // 외부클래스
    public void print() {
        System.out.println("Outer.print");
    }

    class Inner { // 내부클래스
        public void innerPrint() {
            Outer.this.print(); // 내부는 외부에 접근 가능 안에서 밖으로 !
        }
    }

    static class InnerStaticClass { // 정적클래스
        void innerPrint() {
//          Outer.this.print(); // 정적내부클래스는 외부 접근이 불가능
        }
    }
}

// 추상클래스
abstract class Person {
    public abstract void printInfo();
}

class Student extends Person { // 추상클래스를 상속받은
    public void printInfo() {
        System.out.println("Student.printInfo");
    }
}


public class Main {

    public static void main(String[] args) {

//      외부 클래스 사용
        Outer o1 = new Outer();

//      내부 클래스 - 인스턴스
        Outer.Inner i1 = new Outer().new Inner(); // 내부클래스는 외부부터 객체() 생성

//      내부 클래스 - 정적
        Outer.InnerStaticClass is1 = new Outer.InnerStaticClass(); // 외부객체() 없어도됨

//      익명 클래스 - 일회용, 이름 없음, 선언과 동시에 객체 생성
        Person p1 = new Person() {
            @Override
            public void printInfo() {
                System.out.println("Main.printInfo");
            }
        };
    }

}
