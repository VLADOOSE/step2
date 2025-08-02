package step5.Enums.Color;

public class ColorDemo {
    public static void main(String[] args) {
        for(Color i : Color.values()){
            System.out.println(i + " " + i.getHexCode());
        }
    }
}
