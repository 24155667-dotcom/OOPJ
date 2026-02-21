import java.io.*;
import java.util.Scanner;


public class lab9q1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        try{
            System.out.println("Enter the roll number :");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter name: ");
            String name=sc.nextLine();


            System.out.println("Enter subject : ");
            String subject=sc.nextLine();

            System.out.println("Enter marks: ");
            Double marks=sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter file name: ");
            String filename=sc.nextLine();

            FileWriter fw=new FileWriter(filename,true);
            BufferedWriter bw=new BufferedWriter(fw);

            bw.write("Roll No: " + roll);
            bw.newLine();
            bw.write("Name: " + name);
            bw.newLine();
            bw.write("Subject: " + subject);
            bw.newLine();
            bw.write("Marks: " + marks);
            bw.newLine();

            bw.close();

            FileReader fr= new FileReader(filename);
            BufferedReader br=new BufferedReader(fr);

            String line;

            System.out.println("\nDisplaying File Content:\n");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
}
