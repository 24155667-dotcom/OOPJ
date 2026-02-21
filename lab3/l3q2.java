import java.util.Scanner;

// Base class
class Plate {
    double length, width;

    Plate(double l, double w) {
        length = l;
        width = w;
        System.out.println("Plate Constructor");
        System.out.println("Length = " + length);
        System.out.println("Width  = " + width);
    }
}

// Derived class
class Box extends Plate {
    double height;

    Box(double l, double w, double h) {
        super(l, w);   // calls Plate constructor
        height = h;
        System.out.println("Box Constructor");
        System.out.println("Height = " + height);
    }
}

// Derived class
class WoodBox extends Box {
    double thick;

    WoodBox(double l, double w, double h, double t) {
        super(l, w, h);   // calls Box constructor
        thick = t;
        System.out.println("WoodBox Constructor");
        System.out.println("Thickness = " + thick);
    }
}

// Main class
public class l3q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        System.out.print("Enter thickness: ");
        double t = sc.nextDouble();

        // Object creation
        WoodBox wb = new WoodBox(l, w, h, t);

        sc.close();
    }
}
