package step5.Enums.Planet;

public class PlanetDemo {
    public static void main(String[] args) {
        for(Planet i : Planet.values()) {
            System.out.println(i + " " + String.valueOf(i.surfaceGravity()));
        }
    }
}
