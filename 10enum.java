enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class enum {
    public static void main(String[] args) {
        Days today = Days.SATURDAY;

        System.out.println("Today is: " + today);

        switch (today) {
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend! 🎉");
                break;
            default:
                System.out.println("It's a weekday. Get to work!");
        }

        // Display all days
        System.out.println("\nAll days:");
        for (Days d : Days.values()) {
            System.out.println(d);
        }
    }
}
