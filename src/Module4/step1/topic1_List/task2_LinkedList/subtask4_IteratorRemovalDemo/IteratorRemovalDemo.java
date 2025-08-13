package Module4.step1.topic1_List.task2_LinkedList.subtask4_IteratorRemovalDemo;

import Module4.step1.topic1_List.task2_LinkedList.subtask1_LinkedListDemo.LinkedListDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorRemovalDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(10);
        Iterator<Integer> it = linkedList.iterator();
        while(it.hasNext()){
            int n = it.next();
            if(n % 2 == 0){
                it.remove();
            }
        }
        System.out.println(linkedList);
    }
}
