package Module4.step2.topic1_LambdaExpressions.task2_StringModifier;

public class StringModifierDemo {
    public static void main(String[] args) {
        StringModifier m =  s -> s.toUpperCase() + "!";
        System.out.println(m.modify("привет"));
    }
}
