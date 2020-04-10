package Main;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variables
        int length, num, amountDesire=0;
        char uppercase, lowercase, numbers, symbols;
        String password = "", pwUpper="", pwLower="", pwNumber="", pwSymbol="";
        Random r = new Random();
        int[] desire = {0,0,0,0};
        String uAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String sNumbers = "1234567890";
        String sSymbols = "!@#$%&*+_-<>|/";


        //Input
        System.out.printf("Informe o tamanho que deseja: ");
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
        if (uppercase == 's'){
            desire[0] = 1;
        }
        if (lowercase == 's'){
            desire[1] = 1;
        }
        if (numbers == 's'){
            desire[2] = 1;
        }
        if (symbols == 's'){
            desire[3] = 1;
        }

        for (int i=0; i<4; i++){
            if (desire[i] == 1){
                amountDesire++;
            }
        }
        int numberLoop = length/amountDesire;

        if (uppercase == 's')
        {
            for (int i=0; i<=numberLoop; i++){
                num = r.nextInt(uAlphabet.length());
                pwUpper += uAlphabet.charAt(num);
            }
        }
        if (lowercase == 's')
        {
            for (int i=0; i<=numberLoop; i++){
                num = r.nextInt(lAlphabet.length());
                pwLower += lAlphabet.charAt(num);
            }
        }
        if (numbers == 's')
        {
            for (int i=0; i<=numberLoop; i++){
                num = r.nextInt(sNumbers.length());
                pwNumber += sNumbers.charAt(num);
            }
        }
        if (symbols == 's')
        {
            for (int i=0; i<=numberLoop; i++){
                num = r.nextInt(sSymbols.length());
                pwSymbol += sSymbols.charAt(num);
            }
        }

        password = pwUpper + pwLower + pwNumber + pwSymbol;
        System.out.println(password);
    }
}
