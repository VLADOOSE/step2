package Module4.step1.topic2_Set.task1_HashSet.subtask2_DuplicateCheker;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateChecker {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String stop = "";
        System.out.println("Вводите строки, чтоб закончить напишите: стоп");
        boolean q = false;
        while(!q){
            stop = scanner.nextLine();
            if(stop.equals("стоп")){
                q = true;
            } else if(hashSet.contains(stop)){
                System.out.println("Дубликат!");
            } else {
                hashSet.add(stop);
            }
        }
        System.out.println(hashSet);
    }
}
