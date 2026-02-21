import java.io.*;
import java.util.Scanner;

class FileCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter file name: ");
            String filename = sc.nextLine();

            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            String line;
            int characters = 0;
            int words = 0;
            int lines = 0;

            while ((line = br.readLine()) != null) {

                lines++;

                characters += line.length();

                String wordArray[] = line.split(" ");
                words += wordArray.length;
            }

            br.close();

            System.out.println("No. of characters = " + characters);
            System.out.println("No. of lines = " + lines);
            System.out.println("No. of words = " + words);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}