import java.io.*;
import java.util.*;
import java.lang.String;
public class JavaFileHandling {
    public static void main(String[] args) throws IOException{
        Scanner k = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = k.nextLine();
        FileOutputStream f = new FileOutputStream("demo.txt", true);
        // FileOutputStream f = new FileOutputStream("demo.txt", true); // append mode
        while( !s.equals(".")){
            System.out.println("Enter a string");
            s = k.nextLine();
            if(s.equals(".")){
                break;
            }
            f.write(s.getBytes());
        }
        f.write(s.getBytes());
        System.out.println("File created successfully");
        f.close();
        FileInputStream f2 = new FileInputStream("demo.txt");
    }


    // Reading the file contents
    public void Reading(FileInputStream obj) throws IOException{
        System.out.println("Your file contents are : ");
        int ch ;
        while((ch = obj.read()) != -1){
            System.out.print((char)ch);
        }
        System.out.println();
    }
}
