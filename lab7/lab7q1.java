import java.util.Scanner;

public class lab7q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        try {
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
            }
        }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Exception caught");
        }
    }
}
