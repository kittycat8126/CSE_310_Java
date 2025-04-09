import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class e {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        File g = new File("e.txt");
        FileInputStream n = new FileInputStream("e.txt");
        int count = 1;
        int ch = 0;
        while((ch = n.read())!=-1){
            if(ch == '\n' ){
                count++;
            }
        }
        System.out.println(count);
        
    }
    

}
