import java.io.*;
public class Decry {
    public static void main(String[] a){
        try{
            FileInputStream f = new FileInputStream("demo1.txt");
            FileOutputStream f2 = new FileOutputStream(a[0]);
            int ch;
            while((ch = f.read()) != -1){
                if(Character.isLetter(ch)){
                    switch (ch) {
                        case 'a': f2.write('z'); break;
                        case 'A': f2.write('Z'); break;
                        default: f2.write(ch - 1); break;
                    }
                }
                if(Character.isDigit(ch)){
                    switch (ch) {
                        case '0': f2.write('9'); break;
                        default: f2.write(ch - 1); break;
                    }
                }
                if(!Character.isLetter(ch) && !Character.isDigit(ch)){
                    f2.write((ch - f.hashCode()) % 256);
                }
            }
            System.out.println("File decrypted successfully");    
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
