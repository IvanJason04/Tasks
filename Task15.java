public class Task15 {
    public static void main(String[] args) {
        Shape circle = new Circle("Green", 6);
        Shape rectangle = new Rectangle("Pink", 5, 10);

        System.out.println("Circle Area " + circle.calculateArea());
        System.out.println("Circle Perimeter " + circle.calculatePerimeter());

        System.out.println("Rectangle Area " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter " + rectangle.calculatePerimeter());
    }
}

interface Shape{
    public double calculateArea();
    public double calculatePerimeter();
}

abstract class AbstractShape implements Shape{
    String color;
    public AbstractShape(String color){
        this.color = color;
    }
}

class Circle extends AbstractShape{
    double radius;
    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
}

class Rectangle extends AbstractShape{
    double length;
    double width;

    public Rectangle(String color, double length, double width){
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }

    @Override
    public double calculatePerimeter() {
        return (2*length)+(2*width);
    }
}