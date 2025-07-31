package step4.Statics.Counter;

public class Counter {
    private static int count;
    public Counter(){
        count++;
    }
    public static int getCount(){
        return count;
    }
}
