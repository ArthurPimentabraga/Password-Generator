package Main;
import java.io.*;
import java.io.FileWriter;
import java.util.Scanner;

public class File {
    public static void writeFile(String pwd){
        try {
            java.io.File pwdFile = new java.io.File("Password.txt");
            if (pwdFile.createNewFile()){
                System.out.println("File saved: "+pwdFile);
            }
            else{
                System.out.println("Password saved to an existing file! (Password.txt)");
            }
            FileWriter fw = new FileWriter(pwdFile, true);
            fw.write("-> "+pwd+"\n");
            fw.close();
        }
        catch (IOException e){
            System.out.printf("Saving error!");
            e.printStackTrace();
        }
    }
    public static void readFile(){
        try {
            java.io.File pwdFile = new java.io.File("Password.txt");
            Scanner myReader = new Scanner(pwdFile);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
