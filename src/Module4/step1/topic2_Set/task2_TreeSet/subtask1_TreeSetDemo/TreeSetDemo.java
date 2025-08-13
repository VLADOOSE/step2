package Module4.step1.topic2_Set.task2_TreeSet.subtask1_TreeSetDemo;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(40);
        treeSet.add(10);
        treeSet.add(30);
        System.out.println(treeSet);
    }
}
