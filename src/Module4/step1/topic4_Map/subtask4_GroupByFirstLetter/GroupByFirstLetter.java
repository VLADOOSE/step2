package Module4.step1.topic4_Map.subtask4_GroupByFirstLetter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupByFirstLetter {
    public static void main(String[] args) {
        String[] array = new String[] {"VLAD", "IVAN", "OLYA", "VITALYA", "ILYA"};
        HashMap<Character, List<String>> hashMap = new HashMap<>();
        for(String s: array){
            List<String> list = new ArrayList<>();
            for(String c : array){
                if(c.startsWith(String.valueOf(s.charAt(0)))){
                    list.add(c);
                }
            }
            hashMap.put(s.charAt(0), list);
        }
        System.out.println(hashMap);
    }
}
