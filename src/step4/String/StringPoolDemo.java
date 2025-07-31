package step4.String;

public class StringPoolDemo {
    public static void main(String[] args) {
        String s1 = "word";
        String s2 = "word";
        System.out.println("Comparison result: " + (s1==s2)); // возвращает всегда false,
        //если не обернуть в скобки s1==s2, видимо потом, что в таком случае сравниваем
        //строку в кавычках + s1 и s2, поэтому false
    }
}
