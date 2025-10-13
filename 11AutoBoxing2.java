import java.util.*;

public class AutoBoxing2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);   // int → Integer (autoboxing):To work with collections like ArrayList, HashMap, etc., which only accept objects, not primitive types.
        list.add(10);

        System.out.println(list);
    }
}
