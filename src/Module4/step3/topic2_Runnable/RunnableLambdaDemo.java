package Module4.step3.topic2_Runnable;

import static java.lang.Thread.currentThread;

public class RunnableLambdaDemo {
    public static void main(String[] args) {
        try {
            final Runnable task = () -> System.out.println("Task " + currentThread().getId() + " is running");
            final Thread thread = new Thread(task);
            thread.start();
            thread.join();
            final Runnable task1 = () -> System.out.println("Task " + currentThread().getId() + " is running");
            final Thread thread1 = new Thread(task1);
            thread1.start();
            thread1.join();
        }catch(InterruptedException e) {
            System.out.println("Прервано");
        }
    }
}
