// generics + constructor + multi params
class Box<T,U>{
    private T value1;
    private U value2;
   Box(T value1,U value2){
        this.value1=value1;
        this.value2=value2;
    }
    T getvalue1(){
        return value1;
    }
    U getvalue2(){
        return value2;
    }
    
}
public class Generics2{
    public static void main(String[] args){
        Box<Integer,String> obj = new Box<>(10,"Kunal");
        System.out.println(obj.getvalue1());
        System.out.println(obj.getvalue2());
    }
}