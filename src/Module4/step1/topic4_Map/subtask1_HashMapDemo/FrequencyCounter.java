package Module4.step1.topic4_Map.subtask1_HashMapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class FrequencyCounter {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Apple");
        arrayList.add("Orange");
        arrayList.add("Banana");
        arrayList.add("Apple");
        HashMap<String, Integer> hashMap = new HashMap<>();
        int p = 1;
        System.out.println(hashMap);
        for(int i = 0; i < arrayList.size(); i++) {
            if(!hashMap.containsKey(arrayList.get(i))) {
                hashMap.put(arrayList.get(i), p);
            }else{
                hashMap.put(arrayList.get(i), hashMap.get(arrayList.get(i)) + 1);
            }
        }
        System.out.println(hashMap);
    }
}
