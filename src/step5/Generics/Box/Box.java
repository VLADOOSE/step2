package step5.Generics.Box;

public class Box <T>{
    private T a;
    public Box(){}

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }
}
