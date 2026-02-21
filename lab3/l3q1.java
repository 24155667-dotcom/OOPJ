import java.util.Scanner;

class sheet2d {
    double length, breadth;

    void read1(Scanner sc) {
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
    }

    double cost1() {
        return length * breadth * 40;
    }
}

class sheet3d extends sheet2d {
    double height;

    void read2(Scanner sc) {
        read1(sc);
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }

    double cost2() {
        return length * breadth * height * 60;
    }
}

public class l3q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. 2D Sheet");
        System.out.println("2. 3D Box");
        int ch = sc.nextInt();

        if (ch == 1) {
            sheet2d s = new sheet2d();
            s.read1(sc);
            System.out.println("Cost = Rs " + s.cost1());
        } else if (ch == 2) {
            sheet3d b = new sheet3d();
            b.read2(sc);
            System.out.println("Cost = Rs " + b.cost2());
        }
    }
}
