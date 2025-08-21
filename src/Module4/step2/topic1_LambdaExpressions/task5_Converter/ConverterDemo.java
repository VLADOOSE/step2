package Module4.step2.topic1_LambdaExpressions.task5_Converter;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ConverterDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] a = convertArray(arr, n -> n*n);
        System.out.println(Arrays.toString(a));
    }
    public static int[] convertArray(int[] array, Converter converter){
        int[] arr = new int[array.length];
        int b = 0;
        for(int x = 0; x < array.length; x++){
            b = converter.convert(array[x]);
            arr[x] = b;
        }
        return arr;
    }
}
