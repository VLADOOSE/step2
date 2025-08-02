package step5.Enums.Operation;

public class OperationDemo {
    public static void main(String[] args) {
        System.out.println(
                Operation.PLUS.apply(1, 4) + "\n" +
                Operation.MINUS.apply(10, 2) + "\n" +
                Operation.TIMES.apply(15, 2) + "\n" +
                Operation.DIVIDE.apply(20, 2)
        );
    }
}
