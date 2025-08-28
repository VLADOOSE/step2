package Module4.step3.topic7_ThreadLocal;

import java.util.ArrayList;
import java.util.List;

public class ThreadLocalDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadLocal<Integer> threadCounter = ThreadLocal.withInitial(() -> 0);
        Runnable task = () -> {
            for(int i = 0; i < 100; i++) {
                threadCounter.set(threadCounter.get() + 1);
            }
            System.out.println(Thread.currentThread().getName() + " - " + threadCounter.get());
            threadCounter.remove();
        };

        List<Thread> threads = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            threads.add(new Thread(task, "Thread " + i));
        }
        for(Thread thread : threads){
            thread.start();
        }
        for(Thread thread : threads){
            thread.join();
        }
    }
}
