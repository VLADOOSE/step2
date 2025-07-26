package step2.Methods;

public class Greeting {
    public static void main(String[] args) {
        System.out.println(getGreeting("Вова"));
    }
    public static String getGreeting(String name){
        return new String("Привет, " + name + "!");
    }
}
