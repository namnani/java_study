package reflection;

import java.lang.reflect.Field;

public class ReflectionExampleWithChangingField {
    public double d;

    public static void main(String[] args) {
        try {
            Class cls = Class.forName("reflection.ReflectionExampleWithChangingField");
            Field fld = cls.getField("d");
            ReflectionExampleWithChangingField f2obj = new ReflectionExampleWithChangingField();
            System.out.println("d = " + f2obj.d);
            fld.setDouble(f2obj, 12.34);
            System.out.println("d = " + f2obj.d);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
