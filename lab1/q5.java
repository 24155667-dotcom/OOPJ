import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String first = sc.next();

        System.out.print("Enter second name: ");
        String last = sc.next();

        System.out.println(last + " " + first);

        sc.close();
    }
}
