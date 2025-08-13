package Module4.step1.topic1_List.task2_LinkedList.subtask2_StackLinkedList;

import java.util.LinkedList;
import Module4.step1.topic1_List.task2_LinkedList.subtask1_LinkedListDemo.LinkedListDemo;


public class StackLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);
        linkedList.push(5);
        LinkedListDemo.printList(linkedList);
        System.out.println(linkedList.pop() + "\n" + linkedList.pop() + "\n");
        LinkedListDemo.printList(linkedList);
    }
}
