package Module4.step1.topic4_Map.subtask7_GroupByLength;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupByLength {
    public static void main(String[] args) {
        String[] array = new String[]{"hi", "hello", "hey", "hola", "yo", "bonjour"};
        HashMap<Integer, List<String>> hashMap = new HashMap<>();
        for(String s : array){
            hashMap.computeIfAbsent(s.length(), a -> new ArrayList<>()).add(s);
        }
        System.out.println(hashMap);
    }
}
