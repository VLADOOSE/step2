package Module4.step1.topic4_Map.subtask3_TopScoper;

import java.util.HashMap;
import java.util.Map;

public class TopScorer {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Vlad", 10);
        hashMap.put("Ruslan", 9);
        hashMap.put("Alena", 3);
        String max = "";
        int a = 0;
        for(String s : hashMap.keySet()){
            if(a < hashMap.get(s)){
                a = hashMap.get(s);
                max = s;
            }
        }
        System.out.println(max + " " + hashMap.get(max));//туплю
    }
}
