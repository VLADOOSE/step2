package Module4.step2.topic2_Streams.task7_JoinStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("red", "green", "blue", "yellow"));
        String str = list.stream()
                .collect(Collectors.joining(", "));
        System.out.println(str);
    }
}
