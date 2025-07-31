package step4.Shapes;

public class Rectangle extends Shape{
    private double width;
    public double height;
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea(){
        return this.width * this.height;
    }
    @Override
    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }
}
