package Module4.step1.topic2_Set.task1_HashSet.subtask3_SetIntersection;

import java.util.HashSet;

public class SetIntersection {
    public static void main(String[] args) {
        HashSet<String> hashSet1 = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        hashSet1.add("Ivan");
        hashSet1.add("Kolya");
        hashSet1.add("Anatoliy");
        hashSet2.add("Kolya");
        hashSet2.add("Nastya");
        hashSet2.add("Lilya");
        System.out.println(hashSet1 + "\n" + hashSet2);
        hashSet1.retainAll(hashSet2);
        System.out.println(hashSet1);
    }
}
