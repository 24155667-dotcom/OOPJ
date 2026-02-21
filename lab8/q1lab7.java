import java.util.Scanner;

public class q1lab7 {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter a string:");
            String str=sc.nextLine();
            //cahnge case
            changeCase(str);
            //reverse
            reverseString(str);

            System.out.print("\nEnter the second string for comparision : ");
            String str2 = sc.nextLine();
            compareStrings(str, str2);

            // Insert string
            System.out.print("\nEnter the string to be inserted into first string : ");
            String insert = sc.nextLine();
            insertString(str, insert);

            // Uppercase and Lowercase
            System.out.print("\nEnter a String : ");
            String str3 = sc.nextLine();
            upperLower(str3);

            // Character search
            System.out.print("\nEnter a String : ");
            String str4 = sc.nextLine();
            System.out.print("Enter a character : ");
            char ch = sc.next().charAt(0);
            checkCharacter(str4, ch);

            sc.nextLine();

            // Palindrome check
            System.out.print("\nEnter a String : ");
            String pal = sc.nextLine();
            palindrome(pal);

            // Count words & vowels & consonants
            System.out.print("\nEnter a String :    ");
            String sentence = sc.nextLine();
            countAll(sentence);
        }
    // i) Change the case of the string
    static String changeCase(String str){
        String result = str.toUpperCase();
        System.out.println("The string after changing the case is " + result);
        return result;
    }
    // ii) Reverse the string
// a) Without using a function
    static String reverseString(String str){
        String result = "";
        for(int i = str.length()-1;i >= 0;i--){
            result += str.charAt(i);
        }
        System.out.println("The string after reversing is  " + result);
        return result;
    }

    // b) Using a pre-defined function
    static String revString(String str){
        StringBuffer sb = new StringBuffer(str);
        String result = sb.reverse().toString();
        return result;
    }

    // iii) Compare two strings
    static void compareStrings(String s1, String s2){
        int diff = Math.abs(s1.compareTo(s2));
        System.out.println("The difference between ASCII value is " + diff);
    }

    // iv) Insert one string into another string
    static void insertString(String s1, String s2){
        String result = s1 + " " + s2;
        System.out.println("The string after insertion is : " + result);
    }

    // v) Convert to upper case and lower case
    static void upperLower(String str){
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
    }

    // vi) Check whether the character is present in the string and at which position
    static void checkCharacter(String str, char ch){
        int pos = str.indexOf(ch);
        if(pos != -1)
            System.out.println("Position of entered character: " + pos);
        else
            System.out.println("Entered character is not present");
    }
    // vii) Check whether the string is palindrome or not
    static void palindrome(String str) {
        String rev = new StringBuffer(str).reverse().toString();
        if (str.equalsIgnoreCase(rev))
            System.out.println("Entered string is palindrome");
        else
            System.out.println("Entered string is not a palindrome");
    }
        // viii) Check the number of word, vowel and consonant in the string
        static void countAll(String str){
            int words = 1, vowels = 0, consonants = 0;

            for(int i = 0; i < str.length(); i++){
                char c = Character.toLowerCase(str.charAt(i));

                if(c == ' ')
                    words++;

                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                    vowels++;
                else if(c >= 'a' && c <= 'z')
                    consonants++;
            }

            System.out.println("No. of words: " + words);
            System.out.println("No. of vowels: " + vowels);
            System.out.println("No. of consonants: " + consonants);
        }

    }


