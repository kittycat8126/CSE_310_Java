import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class JavaFileHandling {
    public static void main(String[] args) throws IOException{
        File f = new File("yoyo.txt");
        if(f.exists()){
            System.out.println("File exists name is : " + f.getName());
        
        System.out.println("File is absolute path : "+ f.getAbsolutePath());
        System.out.println("File is readable : "+ f.canRead());
        System.out.println("File is writable : "+ f.canWrite());
        System.out.println("File is executable : "+ f.canExecute());
        System.out.println("File is directory : "+ f.isDirectory());
        System.out.println("File is file : "+ f.isFile());
        System.out.println("File is hidden : "+ f.isHidden());
        System.out.println("File length : "+ f.length());
        System.out.println("File last modified : "+ f.lastModified());
        System.out.println("File name : "+ f.getName());
        System.out.println("File path : "+ f.getPath());
        }
        else{
            System.out.println("File does not exist");
        }
    }
}