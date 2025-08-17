package Module4.step1.topic3_Queue.task2_Deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        for(int i = 1; i <= 10; i++){
            deque.add(i);
        }
        System.out.println(deque);
        deque.addFirst(0);
        deque.addLast(11);
        System.out.println(deque);
        deque.pollFirst();
        System.out.println(deque);
        deque.pollLast();
        for(int i : deque){
            System.out.println(i);
        }
    }
}
