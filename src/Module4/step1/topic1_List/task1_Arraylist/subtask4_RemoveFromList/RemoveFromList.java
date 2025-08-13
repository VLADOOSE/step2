package Module4.step1.topic1_List.task1_Arraylist.subtask4_RemoveFromList;

import java.util.ArrayList;

public class RemoveFromList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Three");
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);
        arrayList.remove("Three");
        System.out.println(arrayList);

    }
}
