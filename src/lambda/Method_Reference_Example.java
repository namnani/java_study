package lambda;

import java.util.function.Function;

public class Method_Reference_Example {
    public static void main(String[] args) {
        Function<String, Integer> f = (String s) -> Integer.parseInt(s);
        System.out.println(f.apply("123"));

        Function<String, Integer> f2 = Integer::parseInt;
        System.out.println(f2.apply("456"));
    }
}
