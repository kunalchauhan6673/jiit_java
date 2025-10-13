
abstract class Shape {
    
    abstract void area();

    void display() {
        System.out.println("Calculating area of shape...");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

   // abstract method
    void area() {
        double a = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + a);
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void area() {
        double a = length * breadth;
        System.out.println("Area of Rectangle: " + a);
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        // Shape s = new Shape();  not allowed — abstract class cannot be instantiated

        Shape s1 = new Circle(5);    // reference of abstract class pointing to child object
        s1.display();
        s1.area();

        Shape s2 = new Rectangle(4, 6);
        s2.display();
        s2.area();
    }
}
