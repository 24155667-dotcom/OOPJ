import java.util.*;

/*public class lab6q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = {10, 20, 30, 40};
        int denom[] = {10, 2, 0, 4};
        for (int i = 0; i < 4; i++) {
            try {
                int c = num[i] / denom[i];
                System.out.println("Result:" + c);
            } catch (ArithmeticException e) {
                System.out.println("Caught exception cant divide by 0");
            }
        }
    }
}*/
public class lab7q2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=10;
        int y=0;
        if(y==0){
            throw new ArithmeticException("Denominator is 0");
        }
        int c=x/y;
    }
}
