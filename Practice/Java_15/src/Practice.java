// Practice
// 로또 번호 만들기

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Practice {
    public static void main(String[] args) {

        // set을 이용해서
        HashSet set = new HashSet();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int)(Math.random() * 45) + 1; // 0 ~ 44인데 +1을 해줌으로서 1 ~ 45가 나옴
            set.add(num);
        }

        LinkedList list = new LinkedList(set); // 정렬하기 위해
        Collections.sort(list);
        System.out.println("로또 번호 : " + list);

    }
}
