// Base class
class Fruit {
    void show() {
        System.out.println("This is a Fruit");
    }
}

// Derived class Banana
class Banana extends Fruit {
    void show() {
        System.out.println("This is a Banana");
    }
}

// Derived class Cherry
class Cherry extends Fruit {
    void show() {
        System.out.println("This is a Cherry");
    }
}

// Main class
public class l3q3 {
    public static void main(String[] args) {

        Fruit f = new Fruit();
        Banana b = new Banana();
        Cherry c = new Cherry();

        f.show();
        b.show();
        c.show();
    }
}
