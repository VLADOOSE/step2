package step2.Methods;

public class SquareCalculator {
    public static void main(String[] args) {
        System.out.println(square(16));
    }
    public static int square(int number){
        return (int) Math.pow(number, 2);
    }
}
