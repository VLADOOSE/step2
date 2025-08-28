package Module4.step3.topic5_ExecutorServiceDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        try {
            ExecutorService executorService = Executors.newFixedThreadPool(3);
            for(int i = 1; i <= 5; i++){
                int taskNumber = i;
                executorService.submit(() -> {
                    System.out.println("Task №" + taskNumber + " is running as " + Thread.currentThread().getName());
                });
            }
            executorService.shutdown();
            executorService.awaitTermination(5, TimeUnit.SECONDS);


        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
