package step5.Generics.ArrayUtils;

public class ArrayUtilsDemo {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};
        ArrayUtils.swap(arr, 3, 4);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
