import java.util.*;

public class ArithmeticExcep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            // if b is taken as zero, it will cause an arithmetic exception
            int result = a / b;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception occured: "+e);
        } finally{
            System.out.println("This is a block that always run, no matter what!");
            sc.close();
        }
    }
}
