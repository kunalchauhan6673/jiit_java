import java.util.*;

public class ArrayOutOfBoundExcep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter index to access: ");
            int index = sc.nextInt();
            System.out.println("Value: " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Occured: "+e);
        }finally{
            System.out.println("This is a block that always run, no matter what!");
            sc.close();
        }
    }
}

