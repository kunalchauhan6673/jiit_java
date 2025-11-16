// used to split a string into tokens (words)
import java.util.StringTokenizer;

public class stringTokenizer {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("My name is Kunal Chauhan");

        while (st.hasMoreTokens()) // scans how many words are there, not just spaces
        {
            System.out.println(st.nextToken());
        }
    }
}
