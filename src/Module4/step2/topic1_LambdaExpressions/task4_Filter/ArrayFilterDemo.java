package Module4.step2.topic1_LambdaExpressions.task4_Filter;

import java.util.ArrayList;
import java.util.List;

public class ArrayFilterDemo {
    public static <T> void main(String[] args) {
        Integer[] arr = new Integer[] {5, 12, 7, 20, 3};
        System.out.println(filterArray(arr, n -> n > 10));
    }
    public static <T> List<T> filterArray(T[] array, MyPredicate<T> predicate){
        List<T> list = new ArrayList<>();
        for(T t : array){
            if(predicate.test(t)){
                list.add(t);
            }
        }
        return list;
    }
}
