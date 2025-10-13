import java.util.Scanner;

public class Q2_ppy {
    public static boolean isLeapYear(int year) {
        if(year%4==0){
            if(year%100!=0){
                return true;
            }
            else{
                if(year%400==0){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        int days;
        switch (month) {
            case 1: // Jan
            case 3: // Mar
            case 5: // May
            case 7: // Jul
            case 8: // Aug
            case 10: // Oct
            case 12: // Dec
                days = 31;
                break;
            case 4: // Apr
            case 6: // Jun
            case 9: // Sep
            case 11: // Nov
                days = 30;
                break;
            case 2: // Feb
                if(isLeapYear(year)){
                    days=29;
                }
                else{
                    days=28;
                }
                break;
            default:
                System.out.println("Invalid Month.");
                return;
        }

        System.out.printf("Number of days in month %d of year %d = %d%n", month, year, days);
        sc.close();
    }
}
