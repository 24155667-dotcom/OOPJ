import java.io.*;
import java.util.Scanner;

public class lab9q2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        try{
            System.out.println("Enter source file:");
            String source=sc.nextLine();

            System.out.println("Enter the destination file");
            String dest=sc.nextLine();

            FileReader fr=new FileReader(source);
            FileWriter fw=new FileWriter(dest);

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("File copied using character stream");

            FileInputStream fi=new FileInputStream(source);
            FileOutputStream fo=new FileOutputStream(dest);
;
            int bytedata;

            while((bytedata=fi.read()) !=-1){
                fo.write(bytedata);
            }
            fi.close();;
            fo.close();
        }catch(Exception e){
            System.out.println("Error; "+e);
        }
    }
}
