package step2.Conditionals;

public class DayOfWeek {
    public static void main(String[] args){
        int day = 6;
        String nameDay = "Не определён";
        String typeOfDay = "Не определён";
        switch(day) {
            case 1: {
                typeOfDay = "Рабочий день";
                nameDay = "Пн";
                break;
            }case 2: {
                typeOfDay = "Рабочий день";
                nameDay = "Вт";
                break;
            }case 3: {
                typeOfDay = "Рабочий день";
                nameDay = "Ср";
                break;
            }case 4: {
                typeOfDay = "Рабочий день";
                nameDay = "Чт";
                break;
            }case 5: {
                typeOfDay = "Рабочий день";
                nameDay = "Пт";
                break;
            } case 6: {
                typeOfDay = "Выходной";
                nameDay = "Сб";
                break;
            } case 7: {
                typeOfDay = "Выходной";
                nameDay = "Вс";
                break;
            }

        }
        System.out.println(typeOfDay + " " + nameDay);
    }
}
