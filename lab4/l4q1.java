import java.util.Scanner;

class account{
    protected static int nextaccno=1001;

    protected int acc_no;
    protected String Name;
    protected String acc_type;
    protected double balance;

    protected int day, month, year;

    account(String name,String acc_type,double balance){
        this.acc_no=nextaccno++;
        this.Name=name;
        this.acc_type=acc_type;
        this.balance=balance;
    }
    void checkbalance(){
        System.out.println("Account No: " + acc_no);
        System.out.println("Name: " + Name);
        System.out.println("Account Type: " + acc_type);
        System.out.println("Current Balance: Rs " + balance);
    }
    void deposit(double amount,int m,int d,int y){
        balance+=amount;
        day=d;
        month=m;
        year=y;
        System.out.println("Deposited Rs " + amount);
        System.out.println("Last Deposit Date: " + day + "/" + month + "/" + year);
    }
    void withdraw(double amount) {
        System.out.println("Withdrawal method of Account");
    }
}

class StandardAccount extends account {

    StandardAccount(String name, double balance) {
        super(name, "Standard", balance);
    }

    @Override
    void withdraw(double amount) {
        if(amount<100000){
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn Rs " + amount + " (No penalty)");
            } else { // Dynamic Method Dispatch
                System.out.println("Insufficient balance");
            }
        }else if(amount< 500000){
            double penalty = amount * 0.0005;
            double total = amount + penalty;

            if (total <= balance) {
                balance -= total;
                System.out.println("Withdrawn Rs " + amount);
                System.out.println("Penalty Rs " + penalty);
            } else {
                System.out.println("Insufficient balance");
            }
        }
        else {
            System.out.println("Daily withdrawal limit exceeded for Standard Account");
        }
    }
}
class PremiumAccount extends account {

    PremiumAccount(String name, double balance) {
        super(name, "Premium", balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= 1000000) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn Rs " + amount + " (No penalty)");
            } else {
                System.out.println("Insufficient balance");
            }
        }
        else {
            System.out.println("Daily withdrawal limit exceeded for Premium Account");
        }
    }
}




public class l4q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        account a1 = new StandardAccount("Ravi", 800000);
        account a2 = new PremiumAccount("Anita", 1500000);

        System.out.println("\nStandard Account");
        a1.checkbalance();
        a1.deposit(50000, 8, 1, 2026);
        a1.withdraw(200000);
        a1.checkbalance();

        System.out.println("\nPremium Account");
        a2.checkbalance();
        a2.deposit(100000, 8, 1, 2026);
        a2.withdraw(700000);
        a2.checkbalance();

        sc.close();
    }
}