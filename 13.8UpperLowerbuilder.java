// converting upper ot lower and vice versa using stringbuilder or buffer,totally same code!
import java.util.*;
class UpperLowerBuilder {
    public static void main(String[] args) {
        String str = "KunalChauhan";
        StringBuilder sb = new StringBuilder(str);

        System.out.println("Original String: " + str);
        System.out.print("Converted String: ");

        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);

            if (Character.isUpperCase(c)) {
                sb.setCharAt(i, Character.toLowerCase(c));  // modify directly
            } else if (Character.isLowerCase(c)) {
                sb.setCharAt(i, Character.toUpperCase(c));
            }
        }

        System.out.println(sb.toString());
    }
}
