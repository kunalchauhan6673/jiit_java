// overriding
class A {
    void display() {
        System.out.println("Yes");
    }
}

class B extends A {
    void display() {   // method overriding
        super.display(); // calls parent methods
        System.out.println("No");
    }
}

public class overridding {
    public static void main(String[] args) {
        A obj = new B();   //  parent -> child object
        obj.display();     // Calls overridden method in B (runtime polymorphism)
    }
}
