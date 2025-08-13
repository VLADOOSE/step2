package Module4.step1.topic2_Set.task2_TreeSet.subtask3_TreeSetRanges;

import java.util.TreeSet;

public class TreeSetRanges {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i = 1; i < 21; i++){
            treeSet.add(i);
        }
        System.out.println(treeSet.headSet(10));
        System.out.println(treeSet.tailSet(10));
        System.out.println(treeSet.subSet(5, 15));
    }
}
