// implementing inheritance
class parent{
  void earns(){
    System.out.println("Parent earns!");
  }
}

class child extends parent{
  void studies(){
    System.out.println("Child studies!");
  }
}

public class inheritance{
    public static void main(String[] args){
      child s = new child();
      s.studies();
      s.earns(); // in parent class

    }
}