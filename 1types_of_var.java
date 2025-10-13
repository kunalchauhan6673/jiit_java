public class types_of_var {

    // 1. Static variable, can be reassigned 
    static String collegeName = "ABC University";

    // 2. Instance variables
    String name;
    int age;

    // 3. Final variable (constant), cant be reassigned
    final String course = "MCA";

    // Method showing a local variable
    void showLocalVariable() {
        int marks = 90; // 4. local variable
        System.out.println("Local Variable (marks): " + marks);
    }

    // Method to display instance and static variables
    void display() {
        System.out.println("Instance Variable (name): " + name);
        System.out.println("Instance Variable (age): " + age);
        System.out.println("Final Variable (course): " + course);
        System.out.println("Static Variable (collegeName): " + collegeName);
    }

    public static void main(String[] args) {
        types_of_var obj = new types_of_var();
        obj.name = "Rahul";
        obj.age = 21;

        System.out.println("---- Displaying Instance, Static & Final Variables ----");
        obj.display();

        System.out.println("\n---- Displaying Local Variable ----");
        obj.showLocalVariable();
    }
}
