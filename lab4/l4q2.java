abstract class student {
    protected int rollno;
    protected long regno;

    void getinput(int r, long reg) {
        rollno = r;
        regno = reg;
    }

    abstract void course();
}

class kiitian extends student {

    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }

    void display() {
        System.out.println("Rollno - " + rollno);
        System.out.println("Registration no - " + regno);
        course();
    }
}

public class l4q2 {
    public static void main(String[] args) {

        kiitian k = new kiitian();
        k.getinput(2205180, 1234567890L);
        k.display();
    }
}
