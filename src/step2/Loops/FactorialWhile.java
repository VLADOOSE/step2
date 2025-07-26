package step2.Loops;

public class FactorialWhile {
        public static void main(String[] args){
        int n = 5;
        int i = 1;
        int c = 1;
        while(i <= n){
            c *= i;
            i++;
        }
        System.out.println(c);
    }
}
