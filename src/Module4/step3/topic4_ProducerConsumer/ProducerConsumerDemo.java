package Module4.step3.topic4_ProducerConsumer;

import java.util.*;

public class ProducerConsumerDemo {
    public static void main(String[] args) throws InterruptedException {
        Random rnd = new Random();
        Queue<Integer> list = new LinkedList<>();
        Runnable Producer = () -> {
            try {
                while(true){
                    synchronized (list){
                        while(list.size() == 5){
                            list.wait();
                        }
                        list.add(rnd.nextInt(1, 50));
                        System.out.println(list);
                        list.notifyAll();
                    }
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };
        Runnable Consumer = () ->  {
            try {
                while (true){
                    synchronized (list){
                        while (list.isEmpty()){
                            list.wait();
                        }
                        System.out.println(list.poll());
                        list.notifyAll();
                    }
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };
        new Thread(Producer).start();
        new Thread(Consumer).start();
//Подсматривал в чатГПТ, многопоточка нелёгкая :(
    }
}
