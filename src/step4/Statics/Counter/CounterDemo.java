package step4.Statics.Counter;

public class CounterDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        System.out.println(Counter.getCount());
        //а, можно было просто new Counter
    }
}
