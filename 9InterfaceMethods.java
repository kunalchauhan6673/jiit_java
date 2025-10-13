
interface one{
    void display(); //by default methods are abstract
    static void Sdisplay(){
        System.out.println("This is a Static method.");
    }
    default void ddisplay(){
        System.out.println("This is a Default method.");
    }
}
class two implements one{
    public void display(){
       System.out.println("This is a Abstract method.");
    }
}
public class InterfaceMethods {
    public static void main(String[] args) {
        one obj = new two();
        obj.display();  // abstract method
        obj.ddisplay(); // default method
        one.Sdisplay(); // static method
    }
}
