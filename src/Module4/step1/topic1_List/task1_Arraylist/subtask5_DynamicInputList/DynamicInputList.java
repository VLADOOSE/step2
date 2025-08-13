package Module4.step1.topic1_List.task1_Arraylist.subtask5_DynamicInputList;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicInputList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите строки, чтоб закончить напишите \"стоп\"");
        boolean q = false;
        String input;
        while (!q) {
            input = scanner.nextLine();
            if (input.equals("стоп")) {
                q = true;
            } else {
                arrayList.add(input);
            }
        }
        System.out.println("Кол-во строк: " + arrayList.size() + "\n" + arrayList);

    }
}