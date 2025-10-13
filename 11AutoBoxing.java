public class AutoBoxing {
    public static void main(String[] args) {
        int a = 10;           // primitive
        Integer b = a;        // autoboxing (int → Integer)

        char c = 'A';
        Character d = c;      // autoboxing (char → Character)

        double x = 5.6;
        Double y = x;         // autoboxing (double → Double)

        System.out.println(b);
        System.out.println(d);
        System.out.println(y);
    }
}
