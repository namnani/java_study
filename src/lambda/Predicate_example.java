package lambda;

import java.util.function.Predicate;

public class Predicate_example {
    public static void main(String[] args) {
        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i % 2 == 0;
        Predicate<Integer> notP = p.negate();

        // 100 <= i && (i < 200 || i%2 == 0)
        Predicate<Integer> all = notP.and(q.or(r));
        System.out.println(all.test(150));

        String str1 = "Nani";
        Predicate<String> sp = Predicate.isEqual(str1);
        System.out.println(sp.test("Nani"));

        System.out.println(Predicate.isEqual(str1).test("Nani"));

        // Compile Error
        // System.out.println((str)->{Predicate.isEqual(str1);}.test("Nani"));
    }
}
