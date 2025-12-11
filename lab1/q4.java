import java .util.Scanner;

public class q4 {
public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int x= sc.nextInt();

        int temp=x,rev=0;
        while(temp!=0){
            rev=rev*10+temp%10;
            temp=temp/10;
        }
    if (x == rev)
        System.out.println(x+ " is a Palindrome");
    else
        System.out.println(x + " is not a Palindrome");

    sc.close();
    }
}
