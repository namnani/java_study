package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectionExampleWithFields {
    private double d;
    public static final int i = 37;
    String s = "testing";

    public static void main(String[] args) {
        try {
            Class cls = Class.forName("reflection.ReflectionExampleWithFields");
            Field [] fieldList = cls.getDeclaredFields();
            for(int i = 0; i<fieldList.length; i++){
                Field field = fieldList[i];
                System.out.println("name = " + field.getName());
                System.out.println("decl class = " + field.getDeclaringClass());
                System.out.println("type = " + field.getType());
                int mod = field.getModifiers();
                System.out.println("modifiers = " + Modifier.toString(mod));
                System.out.println("-------");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
