package Main;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char goAgain;

        do {
            generator();
            System.out.printf("\nWant to generate another password? 's' for yes: ");
            goAgain = sc.next().charAt(0);
            System.out.println("-----------------------------------------");
        }while (goAgain == 's');
    }

    public static void generator() {
        Scanner sc = new Scanner(System.in);
        Save save = new Save();

        //Variables
        int length, num;
        char uppercase, lowercase, numbers, symbols;
        String password = "";
        Random r = new Random();
        String uAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String sNumbers = "1234567890";
        String sSymbols = "!@#$%&*+_-<>";

        //Input
        System.out.printf("How many characters do you want?");
        length = sc.nextInt();
        System.out.printf("Include uppercase letter? 's' for yes: ");
        uppercase = sc.next().charAt(0);
        System.out.printf("Include lowercase letter? 's' for yes: ");
        lowercase = sc.next().charAt(0);
        System.out.printf("Include numbers? 's' for yes: ");
        numbers = sc.next().charAt(0);
        System.out.printf("Include symbols? 's' for yes: ");
        symbols = sc.next().charAt(0);

        //Generator
        while (password.length() < length){
            if (password.length() < length)
            {
                if (uppercase == 's')
                {
                    num = r.nextInt(uAlphabet.length());
                    password += uAlphabet.charAt(num);
                }
            }
            if (password.length() < length)
            {
                if (lowercase == 's')
                {
                    num = r.nextInt(lAlphabet.length());
                    password += lAlphabet.charAt(num);
                }
            }
            if (password.length() < length)
            {
                if (numbers == 's')
                {
                    num = r.nextInt(sNumbers.length());
                    password += sNumbers.charAt(num);
                }
            }
            if (password.length() < length)
            {
                if (symbols == 's')
                {
                    num = r.nextInt(sSymbols.length());
                    password += sSymbols.charAt(num);
                }
            }
        }

        //Output
        System.out.println(password);

        //Save
        System.out.printf("Do you want save the password? 's' for yes: ");
        char confirmSave = sc.next().charAt(0);
        if (confirmSave == 's'){
            save.saveFile(password);
        }
    }
}
