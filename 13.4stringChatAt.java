//charAt
public class stringChatAt {
    public static void main(String[] args) {
        String str = "Kunal Chauhan";
        char c = str.charAt(3);
        System.out.println("Characters in string at 3:"+c);

        System.out.println(str.contains("Kunal")); // returns a true or false
        System.out.println(str.indexOf('u')); 
        String str2 = str.replace("Kunal","Aditya");
        System.out.println("the string is "+ str2); 

    }
}
