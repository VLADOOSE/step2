package step2.Conditionals;

public class GradeBonus {
    public static void main(String[] args){
        int grade = 4;
        int bonus = 0;
        if (grade == 5){
            bonus = 100;
            System.out.println("Оценка : " + grade + " Бонус : " + bonus);
        }else if( grade == 4){
            bonus = 75;
            System.out.println("Оценка : " + grade + " Бонус : " + bonus);
        }else if(grade == 3){
            bonus = 50;
            System.out.println("Оценка : " + grade + " Бонус : " + bonus);
        }else{
            System.out.println("Оценка : " + grade + " Бонус : " + bonus);
        }
        //стоило вывод делать после блоков if else
    }
}
