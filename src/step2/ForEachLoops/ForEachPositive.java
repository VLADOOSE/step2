package step2.ForEachLoops;

public class ForEachPositive {
    public static void main(String[] args){
        int[] arr = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};
        for(int i : arr){
            if(i > 0){
                System.out.print(i + " ");
            }
        }
    }
}
