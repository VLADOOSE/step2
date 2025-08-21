package Module4.step2.topic2_Streams.task5_MinString;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinStringDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("elephant", "cat", "hippopotamus", "dog", "lion"));
        list.stream()
                .min(Comparator.comparingInt(String::length))
                .ifPresent(System.out::println);

    }
}
