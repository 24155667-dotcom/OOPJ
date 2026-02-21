import java.util.Scanner;

class Hrsexception extends Exception{
    Hrsexception(String msg){
        super(msg);
    }
}
class minexception extends Exception{
    minexception(String msg){
        super(msg);
    }
}
class secexception extends Exception{
    secexception(String msg){
        super(msg);
    }
}
class time{
    int h,min,sec;
    void getinput(int h,int min,int sec)throws Hrsexception,minexception,secexception{
        if(h>24 || h<0){
            throw new Hrsexception("INVALID");
        }
        if(min<0 || min>60){
            throw new minexception("INVALID MIN");
        }
        if(sec<0 || sec>60){
            throw new secexception("INVALID SEC");
        }
        this.h=h;
        this.min=min;
        this.sec=sec;
    }
    void display(){
        System.out.println(h+":"+min+":"+sec);
    }
}
public class lab6q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        time t=new time();
        try {
            System.out.println("Enter hours:");
            int h = sc.nextInt();
            System.out.println("Enter mins:");
            int min = sc.nextInt();
            System.out.println("Enter seconds");
            int sec = sc.nextInt();
            t.getinput(h,min,sec);
            t.display();
        }catch(Hrsexception e){
            System.out.println(e.getMessage());
        }catch(minexception e){
            System.out.println(e.getMessage());
        }catch(secexception e){
            System.out.println(e.getMessage());
        }
    }
}