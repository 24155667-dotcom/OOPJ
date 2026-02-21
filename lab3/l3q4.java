import java.util.*;

class Account{
    int Acc_no;
    double balance;

    void input(Scanner sc){
        System.out.println("Enter the account number:");
        Acc_no=sc.nextInt();

        System.out.println("Enter the balance :");
        balance=sc.nextDouble();
    }
    void disp() {
        System.out.println("Account Number: " + Acc_no);
        System.out.println("Balance: " + balance);
    }
}

class person extends Account{
    String Name;
    String aadhar_no;

    void input(Scanner sc) {
        super.input(sc);
        sc.nextLine();

        System.out.print("Enter Name: ");
        Name = sc.nextLine();

        System.out.print("Enter Aadhar Number: ");
        aadhar_no = sc.nextLine();
    }

    @Override
    void disp() {
        super.disp();
        System.out.println("Name: " + Name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
    public class l3q4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            person p[] = new person[3];

            for (int i = 0; i < 3; i++) {
                System.out.println("\nEnter details of Person " + (i + 1) + ":");
                p[i] = new person();
                p[i].input(sc);
            }

            System.out.println("\n--- Details of Persons ---");
            for (int i = 0; i < 3; i++) {
                p[i].disp();
            }

            sc.close();
        }
    }
}