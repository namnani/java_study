package reflection;

import java.lang.reflect.Constructor;

public class ReflectionExampleWithConstructors {
    public ReflectionExampleWithConstructors() {

    }

    public ReflectionExampleWithConstructors(int i, double d) {

    }

    public static void main(String[] args) {
        try {
            Class cls = Class.forName("reflection.ReflectionExampleWithConstructors");

            Constructor ctorList[] = cls.getDeclaredConstructors();
            for (int i = 0; i < ctorList.length; i++) {
                Constructor ct = ctorList[i];
                System.out.println("name = " + ct.getName());
                System.out.println("decl class = " + ct.getDeclaringClass());
                Class pvec[] = ct.getParameterTypes();

                for (int j = 0; j < pvec.length; j++)
                    System.out.println("param #" + j + " " + pvec[j]);

                Class evec[] = ct.getExceptionTypes();

                for (int j = 0; j < evec.length; j++)
                    System.out.println("exc #" + j + " " + evec[j]);

                System.out.println("-----");
            }
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        }
    }
}
