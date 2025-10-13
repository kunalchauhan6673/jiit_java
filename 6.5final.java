final class Vehicle {             // final class: Cannot be inherited 
    final int wheels = 4;         // final variable: Value cannot be changed
    final void display() {        // final method: Cannot be overridden in subclass
        System.out.println("Vehicle has " + wheels + " wheels.");
    }
}

public class final {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.display();
    }
}
