package Module4.step1.topic2_Set.task1_HashSet.subtask1_HashSetDemo;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple");
        for(String s : hashSet){
            System.out.println(s);
        }

    }
}
