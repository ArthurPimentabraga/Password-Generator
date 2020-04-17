package Main;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Generator {
    public static void generator() {
        Scanner sc = new Scanner(System.in);
        File file = new File();

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
        System.out.printf("\nHow many characters do you want?");
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
        char[] pwd = new char[length];
        Integer[] local = new Integer[length];
        Random r2 = new Random();
        int varRandom;
        int count = 0;
        while (count < length){
            if (count < length)
            {
                if (uppercase == 's')
                {
                    varRandom = r2.nextInt(length);

                    List<Integer> list = Arrays.asList(local);
                    while (list.contains(varRandom)){
                        varRandom = r2.nextInt(length);
                    }

                    num = r.nextInt(uAlphabet.length());
                    pwd[varRandom] = uAlphabet.charAt(num);
                    local[count] = varRandom;
                    count++;
                }
            }
            if (count < length)
            {
                if (lowercase == 's')
                {
                    varRandom = r2.nextInt(length);

                    List<Integer> list = Arrays.asList(local);
                    while (list.contains(varRandom)){
                        varRandom = r2.nextInt(length);
                    }

                    num = r.nextInt(lAlphabet.length());
                    pwd[varRandom] = lAlphabet.charAt(num);
                    local[count] = varRandom;
                    count++;
                }
            }
            if (count < length)
            {
                if (numbers == 's')
                {
                    varRandom = r2.nextInt(length);

                    List<Integer> list = Arrays.asList(local);
                    while (list.contains(varRandom)){
                        varRandom = r2.nextInt(length);
                    }

                    num = r.nextInt(sNumbers.length());
                    pwd[varRandom] = sNumbers.charAt(num);
                    local[count] = varRandom;
                    count++;
                }
            }
            if (count < length)
            {
                if (symbols == 's')
                {
                    varRandom = r2.nextInt(length);

                    List<Integer> list = Arrays.asList(local);
                    while (list.contains(varRandom)){
                        varRandom = r2.nextInt(length);
                    }

                    num = r.nextInt(sSymbols.length());
                    pwd[varRandom] = sSymbols.charAt(num);
                    local[count] = varRandom;
                    count++;
                }
            }
        }

        //Output
        //System.out.println(Arrays.toString(pwd));
        for (int i=0; i<pwd.length; i++){
            password += pwd[i];
        }
        System.out.println(password);

        //Save
        System.out.printf("Do you want save the password? 's' for yes: ");
        char confirmSave = sc.next().charAt(0);
        if (confirmSave == 's'){
            file.writeFile(password);
        }
    }
}
