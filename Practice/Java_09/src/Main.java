// Java 프로그래밍 - 다형성

class Person {
    public void print() {
        System.out.println("Person.print");
    }
}

class Student extends Person {
    public void print() {
        System.out.println("Student.print");
    }

    public void print2() {
        System.out.println("Student.print2");
    }
}

class CollegeStudent extends Person {
    public void print() {
        System.out.println("CollegeStudent.print");
    }
}


public class Main {

    public static void main(String[] args) {

//      1. 다형성
        System.out.println("== 다형성 ==");
        Person p1 = new Person();
        Student s1 = new Student();

        Person p2 = new Student(); // 부모가 자식을 가리킴 (다형성)
//        Student s2 = new Person(); // 자식이 부모를 가리키면 안됨

        p1.print();
        s1.print();
        s1.print2();
        p2.print();
//      p2.print2(); 접근 불가 위에 보면 Person(부모)클래스에는 print() 메서드만 있고, print2()는 없다.
//                   오버라이딩 되지 않는다 ! (출력 x)

        Person p3 = new CollegeStudent(); // 다형성
//      CollegeStudent c1 = new Student(); 같은 부모에게 상속받았더라도 자식끼리는 상속 다형성 X
        p3.print();


//      2. 타입 변환
        System.out.println("== 타입 변환 ==");
        Person pp1 = null;
        Student ss1 = null;

        Person pp2 = new Person();
        Student ss2 = new Student();
        Person pp3 = new Student(); // 다형성 , 업캐스팅(자식 클래스의 객체가 부모 클래스의 타입으로 형변환된것)

        pp1 = pp2; // 같은 타입이 같은 타입을 가리키니까 ok
        pp1 = ss2; // 다형성이니 ok

        ss1 = ss2; // 같은 타입이 같은 타입을 가리키니까 ok
//      ss1 = pp2; // 자식이 부모를 가리킬수 없으니 X
        ss1 = (Student) pp3; // 형변환하면 ok 다운캐스팅
                             // (위에 업캐스팅돼서 타입이 Person(부모)이지만 원래 타입으로 형변환 하여 사용가능)

        CollegeStudent cc1;
        CollegeStudent cc2 = new CollegeStudent();
//      ss1 = (Student) cc2; // 같은 부모를 둔 자식끼리는 형변환 안됨 (다운캐스팅 불가)
//      cc1 = (CollegeStudent) ss2; 위와 같은 경우

//      3. instanceof (해당 객체가 인스턴스가 맞는지 체크해주는 기능)
        System.out.println("== instanceof ==");
        Person pe1 = new Person();
        Student st1 = new Student();
        Person pe2 = new Student();
        Person pe3 = new CollegeStudent();

        System.out.println(pe1 instanceof Person); // true
        System.out.println(pe1 instanceof Student); // false (pe1이 Student의 인스턴스냐 (아니다))

        System.out.println(st1 instanceof Student); // t
        System.out.println(st1 instanceof Person); // t st1은 Person 의 자식 true

        System.out.println(pe2 instanceof Person); // t
        System.out.println(pe2 instanceof Student); // t

        System.out.println(pe3 instanceof Person); // t
        System.out.println(pe3 instanceof CollegeStudent); // t

        if (pe1 instanceof Student) {
            Student stu1 = (Student) pe1;
        }

        if (st1 instanceof Person) {
            Person per1 = (Person) st1;
        }


    }
}
