import java.util.*;

// Class with variables, more methods, and constructors
class Basic {
    int age;
    String name;
    final String course = "MCA";
    Basic() {
        System.out.println("This is the default constructor!");
    }

    Basic(int a) {
        System.out.println("This is a parameterised constructor with parameter: " + a);
    }

    void takeInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

// Main class
public class BasicClass2 {
    public static void main(String[] args) {
        Basic b = new Basic();      
        Basic b1 = new Basic(2);  

        b.takeInput();  
        b.display();    

        b1.takeInput();
        b1.display();
    }
}
