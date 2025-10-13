interface Shape{
     void area(); //by default methods are abstract
     void display();
}

class Circle implements Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

   // abstract method
  public void display() {
        System.out.println("Calculating area of shape...");
    }
  public void area() {
        double a = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + a);
    }
}

class Rectangle implements Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }
    public void display() {
        System.out.println("Calculating area of shape...");
    }
    public void area() {
        double a = length * breadth;
        System.out.println("Area of Rectangle: " + a);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        // Shape s = new Shape();  not allowed — interface cannot be instantiated

        Shape s1 = new Circle(5);    // reference of abstract class pointing to child object
        s1.display();
        s1.area();

        Shape s2 = new Rectangle(4, 6);
        s2.display();
        s2.area();
    }
}
