package lambda;

import java.util.function.Function;
import java.util.function.Supplier;

public class Method_Reference_Example {
    public static void main(String[] args) {
        Function<String, Integer> f = (String s) -> Integer.parseInt(s);
        System.out.println(f.apply("123"));
        Function<String, Integer> f2 = Integer::parseInt;
        System.out.println(f2.apply("456"));

        Supplier<MyClass> s = () -> new MyClass();
        System.out.println(s.get());
        Supplier<MyClass> s2 = MyClass::new;
        System.out.println(s2.get());

        Function<Integer, int[]> f3 = x -> new int[x];
        Function<Integer, int[]> f4 = int[]::new;

        System.out.println(f3.apply(2).length);
        System.out.println(f4.apply(3).length);
    }
}

class MyClass {
    public MyClass() {
        System.out.println("new myclass object");
    }
}
