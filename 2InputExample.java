// how to take input from user in int, string and array
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking integer input
        System.out.print("Enter your n: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        // Taking string input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Displaying the inputs
        System.out.println("Name: " + name);
        System.out.println("N: " + n);

        // Array input
        int[] arr =  new int[n];
        System.out.println("Enter elements in the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The Elements in the array: ");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
