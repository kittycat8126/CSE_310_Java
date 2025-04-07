import java.io.*;
public class Encryp {
    public static void main(String[] args) throws IOException{
        FileInputStream f = new FileInputStream("demo.txt");
        FileOutputStream f2 = new FileOutputStream("demo1.txt");
        int ch;
        while((ch = f.read()) != -1){
            if(Character.isLetter(ch)){
                switch (ch) {
                    case 'z': f2.write('a'); break;
                    case 'Z': f2.write('A'); break;
                    default: f2.write(ch + 1); break;
                }
            }
            if(Character.isDigit(ch)){
                switch (ch) {
                    case '9': f2.write('0'); break;
                    default: f2.write(ch + 1); break;
                }
            }
            if(!Character.isLetter(ch) && !Character.isDigit(ch)){
                f2.write((ch + f.hashCode()) % 256);
            }
        }
        System.out.println("File encrypted successfully");    
    }
}
