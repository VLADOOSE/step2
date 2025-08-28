package Module4.step3.topic3_Counter;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.currentThread;

public class CounterDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        final Runnable task = () -> {for(int i = 0; i < 50; i++) {counter.increment();}};
        final Thread thread = new Thread(task);
        List<Thread> list = new ArrayList<>(List.of(
                new Thread(task),
                new Thread(task),
                new Thread(task),
                new Thread(task),
                new Thread(task)
        ));
        for(Thread t : list) {
            t.start();
        }
        for(Thread t : list) {
            t.join();
        }

        System.out.println(counter.getCount());
    }
}
