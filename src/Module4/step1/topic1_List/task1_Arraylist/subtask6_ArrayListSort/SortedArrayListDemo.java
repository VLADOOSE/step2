package Module4.step1.topic1_List.task1_Arraylist.subtask6_ArrayListSort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortedArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(42);
        arrayList.add(17);
        arrayList.add(8);
        arrayList.add(99);
        arrayList.add(23);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList.toString()); // не понял зачем в хинте написано про toString,
        // он же и без него выводит
    }
}
