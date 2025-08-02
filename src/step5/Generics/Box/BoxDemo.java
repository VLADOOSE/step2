package step5.Generics.Box;

public class BoxDemo {
    public static void main(String[] args) {
        Box a = new Box();
        Box b = new Box();
        a.setA("AAA");
        System.out.println(a.getA());
        b.setA(343);
        System.out.println(b.getA());
    }

}
