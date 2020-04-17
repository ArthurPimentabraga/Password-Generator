package Main;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Generator g = new Generator();
        int choose;
        String menu = "1- Criar uma senha || 2- Visualizar senhas já criadas || 3- Sair";

        asciiArt();

        do {
            //Menu
            for (int i=0; i <= menu.length(); i++){
                System.out.printf("-");
            }
            System.out.println("\nChoose a number for the desired action");
            System.out.println(menu);
            System.out.printf("->");
            choose = sc.nextInt();
            for (int i=0; i <= menu.length(); i++){
                System.out.printf("-");
            }

            if (choose == 1) g.generator();
            else if(choose == 2) System.out.println("\nFunção não implementada ainda!");
            else System.out.println("\nThanks for used my software!\nI hope that you enjoyed! :)\nBy Arthur Pimenta Braga");

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
        System.out.println("                    oWWo              oWWo              ");
        System.out.println("               'ccclOWWOlcccccclccccclOWW0lccc'         ");
        System.out.println("              ,0MMMMMMMMMMMMMMMMMMMMMMMMMMMMMM0,        ");
        System.out.println("              ;XMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMX;        ");
        System.out.println("              ;XMMMMMMMMMMMMWNXXNWMMMMMMMMMMMMX;        ");
        System.out.println("              ;XMMMMMMMMMMMKl'..'lKMMMMMMMMMMMX;        ");
        System.out.println("              ;XMMMMMMMMMMWo      dWMMMMMMMMMMX;        ");
        System.out.println("              ;XMMMMMMMMMMMK:.  .:KMMMMMMMMMMMX;        ");
        System.out.println("              ;XMMMMMMMMMMMMK,  ,KMMMMMMMMMMMMX;        ");
        System.out.println("              ;XMMMMMMMMMMMMK;  ;KMMMMMMMMMMMMX;        ");
        System.out.println("              ;XMMMMMMMMMMMMNkllkNMMMMMMMMMMMMX;        ");
        System.out.println("              ,KMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMK,        ");
        System.out.println("               ;oddddddddddddddddddddddddddddo;         ");
    }
}
