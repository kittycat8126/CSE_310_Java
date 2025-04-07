import java.io.*;
import java.net.Socket;
public class coping {
    public static void main(String[] args) throws IOException{  
        FileOutputStream target = new FileOutputStream(args[1]);
        FileInputStream source = new FileInputStream(args[0]);
        int ch;
        while((ch = source.read()) != -1){
            target.write(ch);
        }
        source.close();
        target.close();
        System.out.println("File copied successfully");
    }
}
