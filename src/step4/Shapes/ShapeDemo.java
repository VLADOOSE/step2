package step4.Shapes;

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println(circle.getArea() + "\n" +
        circle.getPerimeter() + "\n" +
        rectangle.getArea() + "\n" +
        rectangle.getPerimeter());
    }
}
