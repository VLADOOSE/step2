package Module4.step3.topic1_MyThread;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread " + this.getName() + " says: Hello from thread!");
    }
}
