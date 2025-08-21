package Module4.step2.topic1_LambdaExpressions.task1_Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c = (int a, int b) -> a + b;
        System.out.println(c.operate(1, 2));
    }
}
