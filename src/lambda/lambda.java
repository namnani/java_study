package lambda;

public class lambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World.");
            }
        }).start();

        /*
        람다식 사용 방법.
        1. ( parameters ) -> { expression body }
        2. () -> { expression body }
         */

        new Thread(()-> {
            System.out.println("Hello World.");
        }).start();

        new Thread(()-> System.out.println("Hello World")).start();
    }
}
