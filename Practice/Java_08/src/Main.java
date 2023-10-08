// Java 프로그래밍 - 상속

class Person {
    String name;
    int age;
    public int a1;
    private int a2;

    Person() {}
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Person.printInfo");
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
}

// Student 클래스 - Person 상속, 접근제어자 확인
class Student extends Person { // Person을 상속해서 Student를 만든것임
    Student() {
        a1 = 1;
//        a2 = 1; // 접근제어자가 private이기 때문에 상속을 받았지만 다른 클래스이기 때문에 접근이 안됨
    }
}

// Student 클래스 - Person 상속, super 사용, 오버라이딩
class Student2 extends Person {
    String name; // 부모 클래스(Person)에도 같은 변수이름 name이 있지만, 자식클래스 에서 만들어봄
    int stdId;

    Student2(String name, int age, int stdId) {
        this.name = name; // 부모 클래스의 name이 아니라 자식(Student2)의 name을 가리킴
        //super.name = name; // 부모 클래스의 name을 가리킴 super!!
        //super(name, age); // super();
        this.age = age; // 부모 클래스의 상속받은것을 가리킴
        this.stdId = stdId; // 부모클래스엔 없는 변수이기에 자식의 stdId를 가리킴
    }

    // 오버라이딩
    public void printInfo() {
        System.out.println("Student2.printInfo");
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("stuId: " + stdId);
    }


}


public class Main {

    public static void main(String[] args) {

//      Test code
//      1. 상속
        System.out.println("=============");
        Student s1 = new Student();
        s1.name = "a";
        s1.age = 25;
        s1.printInfo();


//      2. super, super(), 오버라이딩
        System.out.println("=============");
        Student2 s2 = new Student2("b",32, 1);
        s2.printInfo();

    }
}
