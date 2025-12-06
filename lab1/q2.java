import java.util.*;
public class q2 {
    public static void main(String args[]){
        System.out.println("Enter your Marks-");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x>=90){
            System.out.println("O");
        } else if (x<90 && x>=80) {
            System.out.println("E");
        } else if (x<80 && x>=70) {
            System.out.println("A");
        } else if (x<70 && x>=60) {
            System.out.println("B");
        } else if (x<60 && x>=50) {
            System.out.println("C");
        } else if (x<50 && x>=40) {
            System.out.println("D");
        } else if (x<40) {
            System.out.println("F");
        }
    }
}
