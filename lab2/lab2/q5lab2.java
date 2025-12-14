package lab2;
import java.util.Scanner;


    class Student {
        int roll;
        String name;
        double cgpa;

        // Method to read student details
        void read(Scanner sc) {
            System.out.print("Enter Roll No: ");
            roll = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Name: ");
            name = sc.nextLine();

            System.out.print("Enter CGPA: ");
            cgpa = sc.nextDouble();
        }

        // Method to display student details
        void display() {
            System.out.println("Roll No: " + roll);
            System.out.println("Name   : " + name);
            System.out.println("CGPA   : " + cgpa);
            System.out.println("----------------------");
        }
    }

    public class q5lab2 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of students: ");
            int n = sc.nextInt();

            Student[] s = new Student[n];

            // Reading details
            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter details of student " + (i + 1));
                s[i] = new Student();
                s[i].read(sc);
            }

            // Finding student with lowest CGPA
            int minIndex = 0;
            for (int i = 1; i < n; i++) {
                if (s[i].cgpa < s[minIndex].cgpa) {
                    minIndex = i;
                }
            }

            // Displaying all student details
            System.out.println("\nStudent Details:");
            for (int i = 0; i < n; i++) {
                s[i].display();
            }

            // Display student with lowest CGPA
            System.out.println("Student with lowest CGPA: " + s[minIndex].name);

            sc.close();
        }
    }


