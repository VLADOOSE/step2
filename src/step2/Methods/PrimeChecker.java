package step2.Methods;

public class PrimeChecker {
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
    public static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
