package Module4.step1.topic4_Map.subtask6_WordCounter;

import java.util.HashMap;

public class WordCounter {
    public static void main(String[] args) {
        String[] array = new String[]{"dog", "cat", "dog", "bird", "cat", "dog"};
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(String s : array){
            hashMap.put(s, hashMap.getOrDefault(s, 0 ) + 1);
        }
        System.out.println(hashMap);
    }
}
