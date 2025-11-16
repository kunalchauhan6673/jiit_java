// same methods work for string buffer
public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Kunal");

        System.out.println("Original StringBuilder: " + sb);

        // append() → adds text at the end
        sb.append(" Chauhan");
        System.out.println("After append: " + sb);

        // insert() → insert text at a specific position
        sb.insert(5, " Kumar");
        System.out.println("After insert: " + sb);

        // replace() → replace part of the string
        sb.replace(6, 15, "Singh");
        System.out.println("After replace: " + sb);

        // delete() → remove part of the string
        sb.delete(5, 13);
        System.out.println("After delete: " + sb);

        // reverse() → reverse the characters
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}

