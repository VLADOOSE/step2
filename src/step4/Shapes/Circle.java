package step4.Shapes;

public class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
    @Override
    public double getPerimeter(){
        return Math.PI * 2 * this.radius;
    }
}
