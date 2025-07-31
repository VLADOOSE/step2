package step4.String;

import java.util.SortedMap;

public class StringComparison {
    public static void main(String[] args) {
        String s1 = "justawordwithoutspaces";
        String s2 = new String("justawordwithoutspaces");
        System.out.println((s1 == s2) + "\n" + s1.equals(s2));//интересную особенность заметил,
        // если не обернуть в скобки s1 == s2, то результат выводится только один - false
        // через == ссылки проверяем, через equals - содержимое
    }
}
