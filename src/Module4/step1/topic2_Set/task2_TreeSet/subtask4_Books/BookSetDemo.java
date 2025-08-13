package Module4.step1.topic2_Set.task2_TreeSet.subtask4_Books;

import java.util.TreeSet;

public class BookSetDemo{
    public static void main(String[] args) {
        TreeSet<Book> treeSet = new TreeSet<>();
        Book b1 = new Book("KNiga1", 1934);
        Book b2 = new Book("TheBook2", 2020);
        Book b3 = new Book("OldBook", 1870);
        treeSet.add(b1);
        treeSet.add(b2);
        treeSet.add(b3);
        System.out.println(treeSet);
    }
}
