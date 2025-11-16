// generic class
class add<T>{
    T n1;
    T n2;
    add(T n1,T n2){
        this.n1=n1;
        this.n2=n2;
    }
    T return1(){
        return n1;
    }
     T return2(){
        return n2;
    }
}
class BasicGenericClass {
    public static void main(String[] args) {
        add <String> obj1 = new add<>("Kunal","Chauhan");
        add <Integer> obj2 = new add<>(10,20);
        System.out.println(obj1.return1()+obj1.return2());
        System.out.println(obj2.return1()+obj2.return2());
    }
}