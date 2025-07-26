package step2.Arrays;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        int avg = 0;
        for(int i :arr) {
            sum += i;
        }
        avg = sum / arr.length;
        System.out.println("Среднее равно = " + avg);
    }
    //для дробных avg должно быть double
}
