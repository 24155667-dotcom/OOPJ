import java.util.Scanner;

class input{
    void processinput(int x){
        if(x>=0){
            System.out.println(x*2);
        }else{
            throw new ArithmeticException("A negative number");
        }
    }
}
public class lab6q3 {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int x=sc.nextInt();

        input i=new input();
        i.processinput(x);
    }
}
