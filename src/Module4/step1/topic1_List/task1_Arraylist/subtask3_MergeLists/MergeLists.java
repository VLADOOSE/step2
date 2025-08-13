package Module4.step1.topic1_List.task1_Arraylist.subtask3_MergeLists;

import step2.Arrays.ArrayAverage;

import java.util.ArrayList;

public class MergeLists {
    public static void main(String[] args) {
        ArrayList<String> first = new ArrayList<>();
        ArrayList<String> second = new ArrayList<>();
        first.add("Vasya");
        first.add("kolya");
        second.add("Vpiska");
        second.add("Wow");
        System.out.println(first);
        System.out.println(second);
        first.addAll(second);
        System.out.println(first);

    }
}
