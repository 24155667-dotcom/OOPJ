import java.util.*;

public class q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number of the month: ");
        int day = sc.nextInt();
        String result = switch (day % 7) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Sunday";
        };

        System.out.println(result);
    }
}