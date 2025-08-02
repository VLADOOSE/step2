package step5.Enums.Planet;

public enum Planet {
    EARTH(20000000, 15000), MARS(100000, 7500),
    JUPITER(700000000, 400000);
    private int mass;
    private int radius;
    public static final double G = 6.67430 * Math.pow(10, -11);
    Planet(int mass, int radius){
        this.mass = mass;
        this.radius = radius;
    }
    public double surfaceGravity(){
        return G * mass / (radius * radius);
    }
}
