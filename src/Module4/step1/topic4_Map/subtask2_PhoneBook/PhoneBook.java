package Module4.step1.topic4_Map.subtask2_PhoneBook;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Vlad", "+77777777777");
        hashMap.put("Vlada", "+9999999999");
        System.out.println("Input name for number");
        String name = scanner.nextLine();
        System.out.println(hashMap.getOrDefault(name, "Такого имени нет"));

    }
}
