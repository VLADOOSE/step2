package Module4.step2.topic2_Streams.task6_UniqueValues;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueValuesDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 2, 4, 3, 5, 1));
        list = list.stream()
                .distinct()
                .toList();//Почему в задачах не этот вариант, а collect(Collectors.toList()) ?
        System.out.println(list);
    }
}
