package step2.Loops;

public class SumWhileLoop {
    public static void main(String[] args){
        int n = 100;
        int i = 0;
        int c = 0;
        while(i < n){
            c += i;
            i++;
        }
        System.out.println(c);
    }
}
