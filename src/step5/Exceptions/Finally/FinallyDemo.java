package step5.Exceptions.Finally;

public class FinallyDemo {
    public static void main(String[] args) {
        int a = 10;
        int z = 0;
        try {
            System.out.println("Resource opened");
            System.out.println(a/z);


        }catch (ArithmeticException e){
            e.printStackTrace();
        } finally {
            System.out.println("Resource closed");
        }
    }
}
