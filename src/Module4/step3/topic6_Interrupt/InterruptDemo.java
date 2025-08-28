package Module4.step3.topic6_Interrupt;

import java.util.concurrent.atomic.AtomicBoolean;

public class InterruptDemo {
    public static void main(String[] args) throws InterruptedException {
        AtomicBoolean isInterupted = new AtomicBoolean(false);
        Runnable task = () -> {
            try {
                while(!isInterupted.get()) {
                    System.out.println("Работаю...");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };
        Thread thread = new Thread(task);
        thread.start();
        Thread.sleep(3000);
        thread.interrupt();
    }
}
