class Box<T>{
    private T value;
    void setvalue(T value){
        this.value=value;
    }
    T getvalue(){
        return value;
    }
}
public class Generics{
    public static void main(String[] args){
        Box<Integer> obj = new Box<>();
        obj.setvalue(10);
        System.out.println(obj.getvalue());

        Box<String> obj1 = new Box<>();
        obj1.setvalue("Kunal");
        System.out.println(obj1.getvalue());
    }
}