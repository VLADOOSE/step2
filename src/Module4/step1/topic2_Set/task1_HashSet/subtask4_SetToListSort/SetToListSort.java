package Module4.step1.topic2_Set.task1_HashSet.subtask4_SetToListSort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class SetToListSort {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 10; i > 0; i--) {
            hashSet.add(i);
        }
        System.out.println(hashSet);
        ArrayList<Integer> arrayList = new ArrayList<>(hashSet);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
