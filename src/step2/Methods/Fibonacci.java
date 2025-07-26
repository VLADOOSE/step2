package step2.Methods;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
    public static int fibonacci(int n){
        int a = 0;
        int b = 1;
        for(int i = 2; i <= n; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
