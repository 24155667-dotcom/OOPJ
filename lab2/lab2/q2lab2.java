import java.util.*;

class Counter {
    static int count = 0;

    Counter() {
        count++;
    }
}

public class q2lab2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of objects to create: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            new Counter();   // creates object and increases count
        }

        System.out.println("Number of objects created = " + Counter.count);

        sc.close();
    }
}
