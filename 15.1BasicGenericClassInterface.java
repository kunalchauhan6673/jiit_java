// Generic interface
interface Pair<T> {
    T return1();
    T return2();
}

// Generic class implementing the interface
class Add<T> implements Pair<T> {
    T n1;
    T n2;

    Add(T n1, T n2) {
        this.n1 = n1;
        this.n2 = n2;
    }


    // abstract methods from interface
    public T return1() {
        return n1;
    }

    public T return2() {
        return n2;
    }
}

class BasicGenericClassInterface {
    public static void main(String[] args) {
        Add<String> obj1 = new Add<>("Kunal", "Chauhan");
        Add<Integer> obj2 = new Add<>(0, 20);

        System.out.println(obj1.return1() + obj1.return2()); // String concatenation
        System.out.println(obj2.return1() + obj2.return2()); // Integer addition
    }
}
