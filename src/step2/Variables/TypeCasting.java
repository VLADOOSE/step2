package step2.Variables;

public class TypeCasting {
    public static void main(String[] args){
        int a = 3200;
        System.out.println(a + "\n" + (double) a);
        /*посмотрел решение, увидел про неявное преобразование,
        решил дописать его тут чтоб запомнил на будущее*/
        double ad = a;
        System.out.println(a + "\n" + ad); //интересное вспомнил про кавычки, указав одинарные,
        //получалась сумма: 6410.0, видимо '\n' - число 10 в char
    }
}
