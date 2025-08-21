package Module4.step2.topic2_Streams.task8_AverageValue;

import java.util.ArrayList;
import java.util.List;

public class AverageValueDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        list.stream()
                .mapToInt(n -> n)
                .average()
                .ifPresent(System.out::println);
    }
}
