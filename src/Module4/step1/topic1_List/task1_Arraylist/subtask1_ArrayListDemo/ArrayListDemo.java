package Module4.step1.topic1_List.task1_Arraylist.subtask1_ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        System.out.println(arrayList);
        //arrayList.remove(1); я так сначала сделал до хинта
        arrayList.remove(Integer.valueOf(20));
        for(int a : arrayList){
            System.out.println(a);
        }
        System.out.println(arrayList);
    }
}
