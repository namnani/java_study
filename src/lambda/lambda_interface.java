package lambda;

public class lambda_interface {
    public static void main(String[] args) {
        Nani nani = (a, b) -> {
            return a + b;
        };
        System.out.println(nani.add(3, 4));

        System.out.println(nani.subtract(5,4));
    }
}

@FunctionalInterface
interface Nani {
    int add(int a, int b);

    default int subtract(int a, int b) {
        return a - b;
    }
}
