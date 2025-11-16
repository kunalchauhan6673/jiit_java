// splitting a string into a word array, similar to tokenizer
public class stringSplit {
    public static void main(String[] args) {

        String sentence = "My name is Kunal Chauhan";

        // Split the string into words (split by space)
        String[] words = sentence.split(" ");

        // Display each word
        System.out.println("\nWords in the sentence:");
        for (String w : words) {
            System.out.println(w);
        }
    }
}
