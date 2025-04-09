import java.io.*;

class Money implements Serializable{
    int rs ,  ps;
    Money(int r,int p){
        rs = r;
        ps = p;
    }
    public String toString(){
        return ("Money value is Rs : "+ rs+" . "+ps);
    }
}

public class userdfd{
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("classes.java");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Money(10, 20));
        oos.close();
        fos.close();
        System.out.println("File saved successfully . ");
        


    }
}