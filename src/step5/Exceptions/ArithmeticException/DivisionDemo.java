package step5.Exceptions.ArithmeticException;

public class DivisionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int z = 0;
        try {
            System.out.println(a/z);

        }catch (ArithmeticException e){
            System.err.println("Деление на ноль!");
            e.printStackTrace();
        }
    }
}
