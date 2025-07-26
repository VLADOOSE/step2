package step2.Methods;

import java.util.Arrays;

public class MinMaxFinder {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findMinMax(new int[] {1, -20, 43, 10, -400, 230, 15, 3, -16})));
    }
    public static int[] findMinMax(int[] numbers) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max){
                max = numbers[i];
            }else if (numbers[i] < min){
                min = numbers[i];
            }
        }
        return new int[]{min, max};
    }
}
