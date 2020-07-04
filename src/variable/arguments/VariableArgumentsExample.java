package variable.arguments;

public class VariableArgumentsExample {
    static void fun(int ...a)
    {
        System.out.println("Number of arguments : " + a.length);

        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        fun(100);
        fun(1, 2, 3, 4);
        fun();
    }
}
