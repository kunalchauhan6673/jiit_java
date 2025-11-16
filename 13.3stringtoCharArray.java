//String to Char Array
public class stringtoCharArray {
    public static void main(String[] args) {
        String str = "KunalChauhan";
        char[] arr = str.toCharArray();

        System.out.println("Characters in string:");
        for (char c : arr) {
            System.out.println(c);
        }
    }
}
