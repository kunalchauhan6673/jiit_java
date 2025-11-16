import java.util.*;
class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}
class InvalidNameException extends Exception{
    InvalidNameException(String msg){
       super(msg);
    }
}
class CustomExcep01 {
    public static void validate(String name, int age) throws InvalidAgeException,InvalidNameException{
         if(name.length()<3){
             throw new InvalidNameException("Invalid name!");
         }
         if(age <=0 || age>120){
             throw new InvalidAgeException("Invalid Age!");
         }
         System.out.println("The name is "+name+" and the age is "+age);
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            try{
                System.out.print("Enter your name: ");
                String name = sc.nextLine();
                
                System.out.print("Enter your age: ");
                int age = sc.nextInt();
                
                validate(name,age);
            } 
            catch (InvalidNameException | InvalidAgeException e) 
            {
            System.out.println("Exception: " + e);
            }
    }
}
