public class ExceptionSuperClass {
            public static void main(String[] args){
                int a=10;
            int b=0;
            int[] arr = {10, 20, 30, 40, 50};
    try{
        // whichever comes first, is caught first
        arr[5]=100;
        int c=a/b; 
    }catch(Exception e){
        System.err.println("Error: "+e);
    }
    finally{
        System.out.print("Executed");
    }
            }
}
