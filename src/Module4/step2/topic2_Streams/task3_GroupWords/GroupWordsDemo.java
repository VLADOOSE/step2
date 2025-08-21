package Module4.step2.topic2_Streams.task3_GroupWords;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsDemo {
    public static void main(String[] args) {
        String[] strings = new String[]{"apple", "ant", "banana", "berry", "cherry", "carrot"};
        Map<Character, List<String>> list = Arrays.stream(strings)
                .toList()
                .stream().collect(Collectors.groupingBy(w -> w.charAt(0)));
        list.forEach((k, v) -> System.out.println(k + " -> " + v));//вывод подсмотрел в чатгпт

    }
}
