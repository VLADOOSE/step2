package Module4.step1.topic4_Map.subtask5_HashMapIter;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 85);
        hashMap.put("Bob", 72);
        hashMap.put("Charlie", 90);
        hashMap.put("Diana", 68);
        for(Map.Entry<String, Integer> s : hashMap.entrySet()){//А, вот как Map.Entry юзать)
            if(s.getValue() > 75){
                System.out.println(s);
            }
        }
    }
}
