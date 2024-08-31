
interface Printable {
    void print();
}

abstract class Shape {
    abstract public double area();
}

class Circle extends Shape implements Printable {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void print() {
        System.out.println("Circle with radius " + radius);
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
}
}

class Rectangle extends Shape implements Printable {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void print() {
        System.out.println("Rectangle with length " + length + " and width " + width);
    }

    @Override
    public double area() {
        return length * width;
    }
}
public class Main {
    public static void main(String[] args) {
        
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        circle.print();
        rectangle.print();

        System.out.println("Circle area: " + circle.area());
        System.out.println("Rectangle area: " + rectangle.area());
    }
}
