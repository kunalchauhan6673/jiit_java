// modern java uses localdate, localyear, local time to get time or date or year or month at an instance 
import java.time.*;
public class  ModernJavaWithDate&Time {
    
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Date & Time: " + dateTime);
    }
}

