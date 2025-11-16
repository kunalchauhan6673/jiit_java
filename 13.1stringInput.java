/*Taking input in string */ 
import java.util.*;
class stringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Name: " + name);
        sc.close();
    }
}