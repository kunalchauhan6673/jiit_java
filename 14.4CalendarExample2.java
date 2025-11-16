// manipulating date with calendar
import java.util.*;

public class CalendarExample2 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.println("Current: " + c.getTime());

        // Add 10 days
        c.add(Calendar.DATE, 10);
        System.out.println("After 10 days: " + c.getTime());

        // Subtract 1 month
        c.add(Calendar.MONTH, -1);
        System.out.println("1 month earlier: " + c.getTime());
    }
}
