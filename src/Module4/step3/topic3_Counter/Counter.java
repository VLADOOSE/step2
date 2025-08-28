package Module4.step3.topic3_Counter;

public class Counter {
    private int count;
    public synchronized void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
