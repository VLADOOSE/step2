package Module4.step2.topic2_Streams.task2_MapToSquare;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbersDemo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list = list.stream()
                .map(n -> n*n)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
