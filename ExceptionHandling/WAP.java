import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
public class WAP {
    public static void main(String[] args) throws IOException {
        int k = System.in.read(); //read returns ASCII value of input. //read 1 bute from input
        //System.out.println(k);
        byte[] d = new byte[5];
        // int l = System.in.read(d); //reads nest byte from input
        // for(int f: d){
        //     System.out.print(f+" ");
        // }
        
        int o = System.in.read(d,0,3); //reads next 3 bytes into array 0,1,2
        for(int f: d){
            System.out.print(f+" ");
        }
    }
}
