package Module4.step2.topic2_Streams.task4_CountEvenNumbers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CountEvenNumbersDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10, 15, 20, 25, 30, 35));
        long c = list.stream()
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("amount: " + c);

    }
}
