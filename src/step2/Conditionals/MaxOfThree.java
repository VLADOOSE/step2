package step2.Conditionals;

public class MaxOfThree {
    public static void main(String[] args) {
        int a = 200;
        int b = 60;
        int c = 80;
        int max;
        if(a > b && a > c) {
            max = a;
        }else if(b > a && b > c){
            max = b;
        }else{
            max = c;
        }
        System.out.println("Max = " + max);
    }
}
