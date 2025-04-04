import java.io.File;

public class otptstrm {
    public static void main(String[] m){
        File n = new File("C:\\Users\\Chirag\\Desktop\\New file for jav");
        System.out.println(n.getAbsolutePath());
        n.mkdir();
    }
} 
