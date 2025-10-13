import java.util.*;
interface Box<T> {
    void add(T item);
    void display();
}

// Class implementing the interface with String type
class Stuff implements Box<String> {
    ArrayList<String> items = new ArrayList<>();

    public void add(String item) {
        items.add(item);
    }

    public void display() {
        System.out.println("Items: " + items);
    }
}

// Main class
public class GenInt {
    public static void main(String[] args) {
        Stuff s = new Stuff();
        s.add("Apple");
        s.add("Banana");
        s.display();  // Output: Items: [Apple, Banana]
    }
} 
