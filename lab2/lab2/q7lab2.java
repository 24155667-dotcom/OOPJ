package lab2;
import java.util.Scanner;

class Rectangle7 {
    int length;
    int breadth;

    // Default constructor
    Rectangle7() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor
    Rectangle7(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to display area
    void displayArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }
}

public class q7lab2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Using default constructor
        Rectangle7 r1 = new Rectangle7();
        System.out.println("Using Default Constructor:");
        r1.displayArea();

        // User input
        System.out.print("\nEnter length: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        // Using parameterized constructor
        Rectangle7 r2 = new Rectangle7(l, b);
        System.out.println("\nUsing Parameterized Constructor:");
        r2.displayArea();

        sc.close();
    }
}
