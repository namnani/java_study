package toby.reactive.streams;

import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SuppressWarnings("deprecation")
public class Ob {
    // Iterable <---> Observable (duality)
    // Pull           Push

    /*
    public static void main(String[] args) {
        Iterable<Integer> iterable = () ->
                new Iterator() {
                    int i = 0;
                    final static int MAX = 10;

                    public boolean hasNext() {
                        return i < MAX;
                    }

                    public Integer next() {
                        return ++i;
                    }
                };

        for (Integer integer : iterable) {
            System.out.println(integer);
        }

        for (Iterator<Integer> iterator = iterable.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }
     */

    static class IntObservable extends Observable implements Runnable {

        @Override
        public void run() {
            for(int i = 1; i<=10; i++) {
                setChanged();
                notifyObservers(i); // push
//                int i = it.next(); // pull
            }
        }
    }

    // DATA method(void) <-> method(DATA)

    public static void main(String[] args) {
//        Observable // Sourcce -> Event/Data -> Observer

        Observer observer = new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println(Thread.currentThread().getName() + " " + arg);
            }
        };

        IntObservable intObservable = new IntObservable();
        intObservable.addObserver(observer);

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(intObservable);

        System.out.println(Thread.currentThread().getName() + "    EXIT");
        executorService.shutdown();
//        intObservable.run();
    }
}
