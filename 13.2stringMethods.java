//String methods
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter string 2: ");
        String str2 = sc.nextLine();
        System.out.println("String 1 : " + str1+" and String 2 : " + str2);
        
        // string methods
        // length
         System.out.println("Length of String 1 : " + str1.length()+" and String 2 : " + str2.length());
         
         // uppercase and lowercase:
         System.out.println("String 1 after uppercase: " + str1.toUpperCase()+" and String 2 after lower case: " + str2.toLowerCase());
         /* note: You might think you changed the same string —
            but actually, toUpperCase() created a new String object ("KUNAL") 
            and reassigned str to point to it. */      
            
        // concat:
        System.out.println("Strings after concatenation: " + str1.concat(str2));
        
        //equals ansd equalsIgnoreCase()
        if(str1.equals(str2)){
            System.out.println("Both the strings are same!");
        } else{
            System.out.println("Both the strings are not same!");
        }
        
        // substring substring(a,b)
        System.out.print("Enter the range, n to m: ");
        int a = sc.nextInt();
        int b= sc.nextInt();
        System.out.println("The substring within that range for string 1 is "+str1.substring(a,b));
        
        //getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin): used to copy a substring of a string into other string
         char[] dest = new char[3];
         str1.getChars(2, 5, dest, 0);
         System.out.println("The new string is : " + new String(dest));
         // if you dont use new String(dest), the output would have but the memory references of the char array.ie..[C@6b884d57

    }
}