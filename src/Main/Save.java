package Main;
import java.io.*;
import java.io.FileWriter;

public class Save {
    public static void saveFile(String pwd){
        try {
            File pwdFile = new File("Password.txt");
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
}
