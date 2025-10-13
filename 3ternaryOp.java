// max of two numbers using tern op
import java.util.*;
public class ternaryOp {
   public static void main(String[] args){
    int num1, num2;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter num1: ");
    num1=sc.nextInt();
    System.out.println("Enter num2: ");
    num2=sc.nextInt();
    System.out.println("The Greater number is  "+ ((num1>num2)?num1:num2));
    sc.close();
    
   }
}
