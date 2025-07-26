package step2.Loops;

public class FactorialFor {
    static public void main(String[] args){
        int n = 15;
        int c = 1;
        for(int i = 1; i <= n; i++){
            c *= i;
        }
        System.out.println(c);
    }
    //результат обрезался из за максимального допустимого int
}
