package step5.Generics.ArrayUtils;

public class ArrayUtils <T> {
    public static <T> void swap(T[] array, int i, int j){
        T b = array[i];
        array[i] = array[j];
        array[j] = b;

    }
}
