import java.util.Scanner;

interface Emploee {
    void getDetails();
}

interface manager extends Emploee {
    void getDeptDetails();
}

class Head implements manager {
    int empid;
    String empname;
    int deptid;
    String deptname;
    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        empid = sc.nextInt();
        sc.nextLine();
        empname = sc.nextLine();
    }

    public void getDeptDetails() {
        Scanner sc = new Scanner(System.in);
        deptid = sc.nextInt();
        sc.nextLine();
        deptname = sc.nextLine();
    }
    void display() {
        System.out.println("Employee id - " + empid);
        System.out.println("Employee name - " + empname);
        System.out.println("Department id - " + deptid);
        System.out.println("Department name - " + deptname);
    }
    public static void main(String[] args) {
        Head h = new Head();
        h.getDetails();
        h.getDeptDetails();
        h.display();
    }
}
