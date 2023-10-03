// Java 프로그래밍 - 변수와 자료형_4

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {

//      1. 자료형 - 리스트
        System.out.println("== 리스트 ==");
        ArrayList l1 = new ArrayList();

//      1-1. add
        l1.add(1);
        l1.add("hello");
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add("world!");
        System.out.println("l1 = " + l1);

        l1.add(0, 1); // 넣을 인덱스 위치 번호, 넣을 값
        System.out.println("l1 = " + l1);

//      1-2. get // index번호로 안에 있는 데이터를 꺼내오는 메서드
        System.out.println(l1.get(0));
        System.out.println(l1.get(3));

//      1-3. size // 배열 크기를 알려주는 메서드
        System.out.println(l1.size());

//      1-4. remove 배열 안에 데이터 삭제
        System.out.println(l1.remove(0)); // index 번호로 삭제 하는 방법
        System.out.println("l1 = " + l1); // [1, hello, 2, 3, 4, world!]

        System.out.println(l1.remove(Integer.valueOf(2))); // 2라는 값을 찾아서 삭제 하는 방법
        System.out.println("l1 = " + l1); // l1 = [1, hello, 3, 4, world!]

//      1-5. clear // list 에 있는 데이터를 모두 삭제해주는 메서드

        l1.clear(); // l1 = []
        System.out.println("l1 = " + l1);

//      1-6. sort // 내림차순 오름차순 정렬
        ArrayList l2 = new ArrayList();
        l2.add(5);
        l2.add(3);
        l2.add(4);
        System.out.println("l2 = " + l2);

        l2.sort(Comparator.naturalOrder()); // 오름차순
        System.out.println("l2 = " + l2); // [3, 4, 5]
        l2.sort(Comparator.reverseOrder()); // 내림차순
        System.out.println("l2 = " + l2); // [5, 4, 3]

//      1-7. contains // 입력한 데이터가 리스트에 있는지 확인하는 메서드
        System.out.println(l2.contains(1)); // false
        System.out.println(l2.contains(3)); // true

//      2. Maps // 쌍을 이뤄서 저장하는 자료형
        System.out.println("== Maps ==");
        HashMap map = new HashMap();

//      2-1. put
        map.put("kiwi", 9000);
        map.put("apple", 10000);
        map.put("mango", 12000);
        System.out.println("map = " + map);

//      2-2. get
        System.out.println(map.get("mandarine"));// null
        System.out.println(map.get("kiwi")); // 9000

//      2-3. size
        System.out.println(map.size()); // 3개 들어있으니 3

//      2-4. remove
        System.out.println(map.remove("kiwi")); // remove 됐지만 출력에는 키 값이 나옴
        System.out.println(map.remove("mandarine"));
        System.out.println("map = " + map); // kiwi가 사라짐


//      2-5. containsKey // map 안에 입력한 키 값이 있는지 확인
        System.out.println(map.containsKey("apple")); // true
        System.out.println(map.containsKey("kiwi")); // false 이유는 위에서 remove로 지웠기 때문

//      3. Generics // 자료형을 제한해주는 기능
        ArrayList l3 = new ArrayList();
        l3.add(1); // 숫자도 들어가고
        l3.add("hello"); // 문자열도 들어가고
        System.out.println("l3 = " + l3);
        // 위의 l3는 제네릭스를 사용하지 않은것.

        ArrayList<String> l4 = new ArrayList<String>();
//        l4.add(1); // String만 가능하게
//        l4.add(1); int 자료형은 안들어감
        l4.add("hello");
        System.out.println("l4 = " + l4);

        HashMap map1 = new HashMap();
        map1.put(123, "id");
        map1.put("apple", 10000);
        System.out.println("map1 = " + map1);
         // Generics를 쓰지않은

        HashMap<String, Integer> map2 = new HashMap<>();
//        map2.put(123, "id"); String, Integer 순으로 정했기 때문에 오류
        map2.put("apple", 10000);
        map2.put("sooho", 99999);
        System.out.println("map2 = " + map2);
        // Generics를 쓴

    }

}
