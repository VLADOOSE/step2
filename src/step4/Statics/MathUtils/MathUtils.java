package step4.Statics.MathUtils;

public class MathUtils {
    private int a;
    public int b;
    private MathUtils(){}
    public static int max(int a, int b){
        return a > b ?  a :  b; //больше либо равно верно делать
    }
}
