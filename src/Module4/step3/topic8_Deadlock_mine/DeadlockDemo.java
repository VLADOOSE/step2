package Module4.step3.topic8_Deadlock_mine;

public class DeadlockDemo {
    public static void main(String[] args) throws InterruptedException {
        Object lock1 = new Object();
        Object lock2 = new Object();
        Runnable task = () -> {
            try{
                synchronized (lock1){
                    System.out.println("Поток " + Thread.currentThread().getName() + " занял lock1" );
                    Thread.sleep(2000);
                    synchronized (lock2){
                        System.out.println("Поток " + Thread.currentThread().getName() + " занял lock2");
                        Thread.sleep(2000);
                    }
                    System.out.println("Поток " + Thread.currentThread().getName() + " освободил lock2");
                }
                System.out.println("Поток " + Thread.currentThread().getName() + " освободил lock1");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        };
        Runnable task1 = () -> {
            try{
                synchronized (lock2){
                    System.out.println("Поток " + Thread.currentThread().getName() + " занял lock2" );
                    Thread.sleep(2000);
                    synchronized (lock1){
                        System.out.println("Поток " + Thread.currentThread().getName() + " занял lock1");
                        Thread.sleep(2000);
                    }
                    System.out.println("Поток " + Thread.currentThread().getName() + " освободил lock1");

                }
                System.out.println("Поток " + Thread.currentThread().getName() + " освободил lock2");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task1);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        }
    }

