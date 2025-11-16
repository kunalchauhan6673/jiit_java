import java.util.*;
public class multipleExcep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {5, 10, 15};

        try {
            // whichever is first will be caught first, the other one will be ignored because the compiliationprocess will stop before it could be caught 
            System.out.print("Enter index: ");
            int idx = sc.nextInt();
            System.out.println("Array value: " + arr[idx]);
            
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();
            System.out.print("Enter denominator: ");
            int b = sc.nextInt();
            System.out.println("Division: " + (a / b));
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}

