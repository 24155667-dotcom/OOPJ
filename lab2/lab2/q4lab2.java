package lab2;

import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;
    int area;
    int perimeter;

    // Method to read length and breadth
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();
    }

    // Method to calculate area and perimeter
    void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    // Method to display results
    void display() {
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }
}

public class q4lab2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.read();
        r.calculate();
        r.display();
    }
}
