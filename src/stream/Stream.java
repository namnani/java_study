package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        System.out.println(list);

        list.stream().forEach(System.out::println);

        System.out.println();
        list.stream().map(i -> i * 2).forEach(System.out::println);

        System.out.println();
        list.stream().limit(3).forEach(System.out::println);

        System.out.println();
        list.stream().skip(2).forEach(System.out::println);

        System.out.println();
        list.stream().filter(i -> i < 2).forEach(System.out::println);

        System.out.println();
        Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(6,5,4)).stream().flatMap(i -> i.stream()).forEach(System.out::println);

        System.out.println();
        System.out.println(list.stream().reduce((a,b)->a-b).get());

        System.out.println();
        System.out.println(list.stream().collect(Collectors.toList()));
    }
}
