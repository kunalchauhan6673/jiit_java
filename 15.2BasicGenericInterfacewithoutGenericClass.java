// Generic interface
interface Pair<T> {
    T return1();
    T return2();
}

// Normal class implementing the generic interface with a specific type
class AddString implements Pair<String> {
    String n1;
    String n2;

    AddString(String n1, String n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public String return1() {
        return n1;
    }

    public String return2() {
        return n2;
    }
}

// Another normal class implementing the interface for Integer
class AddInteger implements Pair<Integer> {
    Integer n1;
    Integer n2;

    AddInteger(Integer n1, Integer n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Integer return1() {
        return n1;
    }

    public Integer return2() {
        return n2;
    }
}

class BasicGenericInterfacewithoutGenericClass {
    public static void main(String[] args) {
        AddString obj1 = new AddString("Kunal", "Chauhan");
        AddInteger obj2 = new AddInteger(10, 0);

        System.out.println(obj1.return1() + obj1.return2()); // String concatenation
        System.out.println(obj2.return1() + obj2.return2()); // Integer addition
    }
}
