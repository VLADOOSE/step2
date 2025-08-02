package step5.Exceptions.InvalidAgeException;

public class AgeChecker {
    public static void checkAge(int age) throws InvalidAgeException {
        if(age < 0 || age > 150){
            throw new InvalidAgeException("Возраст не в доступном диапазоне");
        }

    }

    public static void main(String[] args) {
        try{
            checkAge(160);
        }catch (InvalidAgeException e){
            e.printStackTrace();
        }
    }
}
