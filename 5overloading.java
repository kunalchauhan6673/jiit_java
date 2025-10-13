// implementing overloading using constructor
class calculator{
    int a, b, c;

    calculator(int a){
        this.a=a;
        b=0;
        c=0;
    }
    calculator(int a,int b){
        this.a=a;
        this.b=b;
        c=0;
    }
    calculator(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void add(){
        System.out.println("The sum :"+(a+b+c));
    }
}
public class overloading{
    public static void main(String[] args){
    calculator c1= new calculator(8);
    c1.add();
    calculator c2= new calculator(8,10);
    c2.add();
    calculator c3= new calculator(8,10,20);
    c3.add();

    }
}