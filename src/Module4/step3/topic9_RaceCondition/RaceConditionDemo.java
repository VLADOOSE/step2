package Module4.step3.topic9_RaceCondition;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class RaceConditionDemo {
    private static int count = 0;
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for(int i = 0; i < 1000; i++) {
                count++;
            }
        };
        List<Thread> threads = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            threads.add(new Thread(task, "Thread " + i));
        }
        for(Thread t: threads){
            t.start();
        }
        for(Thread t: threads){
            t.join();
        }
        System.out.println(count);
    }
}
