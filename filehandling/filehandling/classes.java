import java.io.*;

class Money{
    
}
public class classes {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("classes.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeBytes("Apples are sweet");
        oos.writeBytes("apples are my fav");
        oos.writeObject(new Integer(69));
        oos.writeObject(new Double(10.11));
        oos.close();
        fos.close();
        System.out.println("File succesfully saved!!!!");

        FileInputStream fis = new FileInputStream("classes.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        String s1 = ois.readObject().toString();
        String s2 = ois.readObject().toString();
        Integer a = (Integer)ois.readObject();
        Double o = (Double)ois.readObject();
        fis.close();
        ois.close();
    }
}