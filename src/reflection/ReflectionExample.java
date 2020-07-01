package reflection;

import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        try{
            Class c = Class.forName("java.util.Stack");
            Method m[] = c.getDeclaredMethods();
            for(int i = 0; i<m.length; i++){
                System.out.println(m[i].toString());
            }

            System.out.println();
            c = java.util.Stack.class;
            m = c.getDeclaredMethods();
            for(Method mi : m) {
                System.out.println(mi);
            }

            System.out.println();
            c = Integer.class;
            for(Method mi : c.getDeclaredMethods()) {
                System.out.println(mi);
            }


        } catch (Throwable e) {
            System.err.println(e);
        }
    }
}
