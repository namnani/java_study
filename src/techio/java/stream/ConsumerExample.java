package techio.java.stream;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s + " World!");
        consumer.accept("Hello");

        BiConsumer<String, String> biConsumer = (t, u) -> {
            System.out.println(t + " " + u);
        };
        biConsumer.accept("Hello", "World!");

        DoubleConsumer doubleConsumer = d -> System.out.println("num : " + d);
        doubleConsumer.accept(10);

        ObjIntConsumer<String> objIntConsumer = (t, u) -> System.out.println(t + u);
        objIntConsumer.accept("num : ", 10);
    }
}
