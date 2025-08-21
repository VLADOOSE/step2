package Module4.step2.topic1_LambdaExpressions.task3_ArraySort;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdaArraySortDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Lambda");
        arrayList.add("Stream");
        arrayList.add("API");

        arrayList.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(arrayList);
    }
}
