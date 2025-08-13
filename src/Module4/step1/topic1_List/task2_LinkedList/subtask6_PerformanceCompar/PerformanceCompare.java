package Module4.step1.topic1_List.task2_LinkedList.subtask6_PerformanceCompar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Timer;

public class PerformanceCompare {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        long start = System.nanoTime();
        for(int i = 0; i < 100000; i ++){
            arrayList.add(i);
        }
        System.out.println("Время вставки 100к элементов для ArrayList: " + (System.nanoTime() - start) + " нс");
        start = System.nanoTime();
        for(int i = 0; i < 100000; i ++){
            linkedList.add(i);
        }
        System.out.println("Время вставки 100к элементов для LinkedList: " + (System.nanoTime() - start) + " нс");
        start = System.nanoTime();
        for(int i = 0; i < 10000; i++){
            arrayList.add(0, i);
        }
        System.out.println("Время вставки 10к элементов в начало для ArrayList:" + (System.nanoTime() - start) + " нс");
        start = System.nanoTime();
        for(int i = 0; i < 10000; i++){
            linkedList.add(0, i);
        }
        System.out.println("Время вставки 10к элементов в начало для LinkedList: " + (System.nanoTime() - start) + " нс");
    }
}
