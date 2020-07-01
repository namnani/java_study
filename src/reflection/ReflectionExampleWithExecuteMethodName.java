package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExampleWithExecuteMethodName {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        try{
            Class cls = Class.forName("reflection.ReflectionExampleWithExecuteMethodName");
            Class partypes[] = new Class[2];
            partypes[0] = Integer.TYPE;
            partypes[1] = Integer.TYPE;
            Method method = cls.getMethod("add", partypes);
            ReflectionExampleWithExecuteMethodName obj = new ReflectionExampleWithExecuteMethodName();
            Object argList[] = new Object[2];
            argList[0] = new Integer(37);
            argList[1] = new Integer(47);
            Object retobj = method.invoke(obj, argList);
            Integer retval = (Integer) retobj;
            System.out.println(retval.intValue());
            System.out.println(retval);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
