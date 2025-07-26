package step2.Conditionals;

public class MinOfTwoTernary {
    public static void main(String[] args){
        int a = 20;
        int b = 19;
        int min = a > b ? b : a;
        System.out.println("Минимальное : " + min);
    }
}
