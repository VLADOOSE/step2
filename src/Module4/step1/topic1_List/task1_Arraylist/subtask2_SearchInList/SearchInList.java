package Module4.step1.topic1_List.task1_Arraylist.subtask2_SearchInList;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchInList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Vasya");
        arrayList.add("Kolya");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = scanner.nextLine();
        if (arrayList.contains(name)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
