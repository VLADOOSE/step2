package Module4.step3.topic1_MyThread;

public class ThreadExtendDemo {
    public static void main(String[] args) {
        try {
            Thread thread1 = new MyThread();
            Thread thread2 = new MyThread();
            Thread thread3 = new MyThread();

            thread1.start();
            thread1.join();

            thread2.start();
            thread2.join();

            thread3.start();
            thread3.join();

        }catch(InterruptedException e){
            System.out.println("потоки прервались");
        }finally {
            System.out.println("Все потоки завершились");
        }
    }
}
