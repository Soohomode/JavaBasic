// Java 프로그래밍 - 컬렉션 프레임워크

import java.util.*;

public class Main {

    public static void main(String[] args) {

//      1. List
//        1-1. ArrayList
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println("list1 = " + list1);
        list1.remove(Integer.valueOf(2));
        System.out.println("list1 = " + list1);
        list1.add(0, 10);
        System.out.println("list1 = " + list1);
        System.out.println("list1.size() = " + list1.size());
        System.out.println("list1.contains(1) = " + list1.contains(1));
        System.out.println("list1.indexOf(10) = " + list1.indexOf(10));

//      1-2. LinkedList
        System.out.println("== LinkedList ==");
        LinkedList list2 = new LinkedList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println("list2 = " + list2);

        //ArrayList 와 다른점 (LinkedList 에서 사용가능한것)
        list2.addFirst(10);
        list2.addLast(20);
        System.out.println("list2 = " + list2);
        list2.remove(Integer.valueOf(1));
        System.out.println("list2 = " + list2);
        list2.removeFirst();
        list2.removeLast();
        System.out.println("list2 = " + list2);
        System.out.println(list2.size());

//      2. Set
//      2-1. HashSet
        System.out.println("== HashSet ==");
        HashSet set1 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("set1 = " + set1); // [1, 2, 3]
        set1.remove(1); // 인덱스가 아니라 값으로 인식해서 바로 지울수있음
        System.out.println("set1 = " + set1); // [2, 3]
        set1.add(2);
        set1.add(3);
        System.out.println("set1 = " + set1); // [2, 3] 중복된값은 add 되지 않는다
        System.out.println(set1.size());
        System.out.println(set1.contains(2)); // 데이터가 있는지 없는지 true, false

//      2-2. TreeSet
        System.out.println("== TreeSet ==");
        TreeSet set2 = new TreeSet();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        System.out.println("set2 = " + set2);
        set2.remove(2); // 인덱스 x 값으로 o
        System.out.println("set2 = " + set2);
        set2.clear(); // 모든데이터를 지우는것
        System.out.println("set2 = " + set2);
        set2.add(10);
        set2.add(5);
        set2.add(15);
        set2.add(15); // set은 중복된값이 add 되지 않는다
        System.out.println("set2 = " + set2);

        System.out.println(set2.first());
        System.out.println(set2.last());
        System.out.println(set2.lower(10)); // 입력한 값보다 작은 값을 출력
        System.out.println(set2.higher(10)); // 입력한 값보다 큰 값을 출력

//      3. Map
//      3-1. HashMap
        System.out.println("== HashMap ==");
        HashMap map1 = new HashMap();
        map1.put(1, "kiwi"); // map은 키와 데이터가 쌍으로 들어감
        map1.put(2, "apple");
        map1.put(3, "mango");
        System.out.println("map1 = " + map1);
        
        map1.remove(2); // 해당 키 값을 넣어 remove
        System.out.println("map1 = " + map1);
        System.out.println("map1.get(1) = " + map1.get(1)); // 출력할때도 키 값


//      3-2. TreeMap
        System.out.println("== TreeMap ==");
        TreeMap map2 = new TreeMap();
        map2.put(10, "keijo");
        map2.put(5, "fukukawa");
        map2.put(15, "shikyo");
        System.out.println("map2 = " + map2);

        System.out.println(map2.firstEntry()); // 첫번째 데이터
        System.out.println(map2.firstKey()); // 첫번째 키값
        System.out.println(map2.lastEntry()); // 마지막 데이터
        System.out.println(map2.lastKey()); // 마지막 키값
        System.out.println(map2.lowerEntry(10)); // 키값 보다 낮은 것 출력
        System.out.println(map2.higherEntry(10)); // 키값 보다 높은 것 출력

    }
}
