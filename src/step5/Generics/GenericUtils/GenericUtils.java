package step5.Generics.GenericUtils;

public class GenericUtils {
    public static <T extends Comparable<T>> T max(T a, T b){
        if(a.compareTo(b) == 1){
            return a;
        }else if(a.compareTo(b) == -1){
            return b;
        }else{
            return null;
        }
    }
}
