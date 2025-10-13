import java.util.*;

// Class with variables, methods, and constructors
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

  
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class BasicClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Basic b = new Basic();      
        Basic b1 = new Basic(2);   
    
        System.out.println("Enter the name: ");
        b.name = sc.nextLine();
        System.out.println("Enter the name1: ");
        b1.name = sc.nextLine();

        System.out.println("Enter the age: ");
        b.age = sc.nextInt();
        System.out.println("Enter the age1: ");
        b1.age = sc.nextInt();
       
        b.display();
        b1.display();
        sc.close();
    }
}
