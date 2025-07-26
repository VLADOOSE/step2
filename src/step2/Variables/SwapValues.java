package step2.Variables;

public class SwapValues {
    public static void main(String[] args){
        int a = 10; int b = 20;
        System.out.println("a = " + a + "\n" + "b = " + b + "\n");
        int c = a;
        a = b;
        b = c;
        System.out.println("a = " + a + "\n" + "b = " + b);
    }
}
