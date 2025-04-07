import java.io.*;
public class classes {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("classes.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeBytes("Apples are sweet");
        oos.writeBytes("apples are my fav");
        oos.writeInt(69);
        oos.writeDouble(10.11);
        oos.close();
        fos.close();
        System.out.println("File succesfully saved!!!!");

        FileInputStream fis = new FileInputStream("classes.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println("readLine");
        String a = ois.readObject().toString();
        int i = ois.readInt();

        System.out.println(a);
        fis.close();
        ois.close();
    }
}