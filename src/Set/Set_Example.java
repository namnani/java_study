package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Java에서 Set은 순서를 보장하지 않는다는 것이,
반드시 순서가 어긋날 수 있다는게 아님.
운이 좋으면, 순서가 맞을 수도 있고,
운이 없으면, 순서가 안맞을 수도 있는 것임.
(이유 : 자료구조에 넣을 때 HashCode에 의해서 정렬해서 집어넣다보니까.)
 */
public class Set_Example {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 11; i++)
            set.add(String.valueOf(i));

        System.out.println(set);

        set.add(String.valueOf(11));
        System.out.println(set);

//        Iterator ite = set.iterator();
//        while(ite.hasNext()){
//            System.out.println(ite.next());
//        }
    }
}
