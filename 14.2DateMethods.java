// methods of date
import java.util.*;

public class DateMethods {
    public static void main(String[] args) throws InterruptedException {
        Date d1 = new Date();
        Thread.sleep(1000);  // wait 1 second
        Date d2 = new Date();

        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);
        System.out.println("d1 before d2? " + d1.before(d2));
        System.out.println("Time in ms for d1: " + d1.getTime());
    }
}
// problems with date :
/* 1.Many methods like getYear(), getMonth(), etc. are deprecated (outdated).
   2. Not very flexible for adding or subtracting dates.
   3. Not time zone–aware. 
   therefore Java introduced calendar*/
