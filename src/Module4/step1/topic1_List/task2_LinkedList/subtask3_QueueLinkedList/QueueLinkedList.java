package Module4.step1.topic1_List.task2_LinkedList.subtask3_QueueLinkedList;

import java.util.LinkedList;

public class QueueLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.offer("First");
        linkedList.offer("Second");
        linkedList.offer("Three");
        String poll = "notNull";
        while(poll != null){
            poll = linkedList.poll();
            /*Был for(int i = 0; i < 5; i++) и метод
            public static <T> void printPoll(LinkedList<T> linkedList){
                System.out.println(linkedList.poll() + "\n");
            }
            не знаю зачем придумал,
             думал что для того чтоб увидеть null
            но потом увидел что наоборот null не надо видеть
            но его всё равно видно, думаю норм, не стану заморачиваться
             */
            System.out.println(poll + "\n");
        }
    }

}
