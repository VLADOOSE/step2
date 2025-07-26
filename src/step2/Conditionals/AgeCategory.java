package step2.Conditionals;

public class AgeCategory {
    public static void main(String[] args){
        int age = 67;
        String category = "Не определена";
        if(age < 13){
            category = "Ребёнок";
        }else if(13 <= age && age <= 19){
            category = "Подросток";
        }else if(age >= 20 && age <= 64){
            category = "Взрослый";
        }else if (age >= 65){
            category = "Пожилой";
        }
        System.out.println("Возраст: " + age + " Категория: " + category);
        //лишние условности написал
    }
}
