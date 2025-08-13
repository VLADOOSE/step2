package Module4.step1.topic1_List.task2_LinkedList.subtask5_ListInterfaceDemo;

import java.util.LinkedList;
import java.util.List;

public class ListInterfaceDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add(0, "First");
        list.add(0, "Second");
        list.add(0, "Third");
        list.add(0, "Fourth");
        list.add(0, "Fifth");
        System.out.println(list + "\n");
        list.set(4, "Six");
        list.remove(0);
        for(String s : list){
            System.out.print(s + "[" + list.indexOf(s) + "] ");
        }
    }
}
