import java.io.*;
import java.util.Scanner;
public class JavaFileHandling {
    public static void main(String[] args) throws IOException{
        Scanner k = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = k.nextLine();
        FileOutputStream f = new FileOutputStream("demo.txt");
        f.write(s.getBytes());
        System.out.println("File created successfully");
        f.close();
        FileInputStream f2 = new FileInputStream("demo.txt");
        int ch ;
        while((ch = f2.read()) != -1){
            System.out.print((char)ch);
        }
        System.out.println();
    }
}
