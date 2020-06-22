package Main;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File();
        Generator g = new Generator();
        int choose;
        String menu = "| 1- Create a password || 2- View passwords already created || 3- Exit |";
        String instruction = "| Choose a number for the desired action";
        asciiArt();

        do {
            //Menu
            for (int i=0; i < menu.length(); i++){
                System.out.printf("-");
            }

            System.out.printf("\n"+instruction);

            for (int i=1; i < menu.length() - instruction.length(); i++){
                System.out.printf(" ");
            }

            System.out.println("|\n"+menu);

            for (int i=0; i < menu.length(); i++){
                System.out.printf("-");
            }
            System.out.printf("\n-> ");
            choose = sc.nextInt();

            if (choose == 1) g.generator();
            else if(choose == 2) file.readFile();
            else System.out.println("Thanks for used my software!\nI hope that you enjoyed! :)\nBy Arthur Pimenta Braga");

        }while (choose != 3);
    }

    public static void asciiArt(){
        System.out.println("                            ......                      ");
        System.out.println("                        'cx0XXNNNX0xc'                  ");
        System.out.println("                      'xXMWXOkxxkOXWMXx'                ");
        System.out.println("                     :KMNk:.      .:kNMK:               ");
        System.out.println("                    ,KMXl.          .lXMK,              ");
        System.out.println("                    lWWx.            .xWNl              ");
        System.out.println("                    oWWo              oWWo              ");
        System.out.println("               'ccclOWWOlcccccclccccclOWW0lccc'         ");
        System.out.println("              ;XMMMMMMMMMMMMWNXXNWMMMMMMMMMMMMX;        ");
        System.out.println("              ;XMMMMMMMMMMMKl'..'lKMMMMMMMMMMMX;        ");
        System.out.println("              ;XMMMMMMMMMMWo      dWMMMMMMMMMMX;        ");
        System.out.println("              ;XMMMMMMMMMMMK:.  .:KMMMMMMMMMMMX;        ");
        System.out.println("              ;XMMMMMMMMMMMMK,  ,KMMMMMMMMMMMMX;        ");
        System.out.println("              ;XMMMMMMMMMMMMK;  ;KMMMMMMMMMMMMX;        ");
        System.out.println("              ;XMMMMMMMMMMMMNkllkNMMMMMMMMMMMMX;        ");
        System.out.println("               ;oddddddddddddddddddddddddddddo;         ");
    }
}
