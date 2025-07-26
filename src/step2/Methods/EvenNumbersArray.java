package step2.Methods;

import java.util.Arrays;

public class EvenNumbersArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getEvenNumbers(4)));
    }
    public static int[] getEvenNumbers(int n){
        int c = 0;
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            c += 2; // надо было через индекс конечно
            arr[i] += c;
        }
        return arr;
    }
}
