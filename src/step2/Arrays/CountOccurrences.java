package step2.Arrays;

public class CountOccurrences {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 2, 3, 4, 1, 2};
        int counter = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                counter++;
            }
        }
        System.out.println("Число 2 встречается в массиве " + counter + " раз");
    }
}
