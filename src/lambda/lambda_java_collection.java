package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class lambda_java_collection {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa", "abc", "bbb", "ccc");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);

        List<String> list2 = Arrays.asList("aaa", "abc", "bbb", "ccc");
        Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
        System.out.println(list2);
    }
}

// ccc bbb abc aaa
