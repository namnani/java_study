package lambda;

import java.util.function.Predicate;

public class Lambda_Predicate {
    public static void main(String[] args) {
        Predicate<String> isEmptyStr = s -> s.length() == 0;
        String s = "";

        if (isEmptyStr.test(s)) {
            System.out.println("This is an empty String");
        }
    }
}
