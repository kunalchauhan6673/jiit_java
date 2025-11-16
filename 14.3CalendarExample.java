import java.util.*;
public class CalendarExample {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();  // get current date/time

        System.out.println("Current Date & Time: " + c.getTime());
        System.out.println("Year: " + c.get(Calendar.YEAR));
        System.out.println("Month: " + (c.get(Calendar.MONTH) + 1)); // 0-based
        System.out.println("Date: " + c.get(Calendar.DATE));
        System.out.println("Hour: " + c.get(Calendar.HOUR));
        System.out.println("Minute: " + c.get(Calendar.MINUTE));
        System.out.println("Second: " + c.get(Calendar.SECOND));
    }
}
