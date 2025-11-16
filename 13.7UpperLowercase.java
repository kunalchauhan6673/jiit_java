//converting uppercase to lowercase and vice versa
import java.util.*;
public class UpperLowerCase {
    public static void main(String[] args) {
        String str = "KunalChauhan";
        char[] arr = str.toCharArray();

        System.out.print("Characters in string: ");
        for (int i=0;i<arr.length;i++) {
            char c =arr[i];
            if(Character.isUpperCase(c)){
               arr[i] = Character.toLowerCase(c);
            }
            else{
               arr[i] = Character.toUpperCase(c);
            }
           } 
           System.out.print(new String(arr));
} 
}

