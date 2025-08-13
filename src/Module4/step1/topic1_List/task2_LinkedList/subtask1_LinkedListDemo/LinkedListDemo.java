package Module4.step1.topic1_List.task2_LinkedList.subtask1_LinkedListDemo;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");
        linkedList.addFirst("Zero");
        linkedList.addLast("Infinity");
        printList(linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        printList(linkedList);

    }
    public static <T> void printList(LinkedList<T> linkedList){
        for(T s : linkedList) {
            System.out.println(s);
        }
        System.out.println();
    }
}
