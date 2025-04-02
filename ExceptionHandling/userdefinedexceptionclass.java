import java.util.Scanner;

class Myexception extends Exception{
    Myexception(int x){
        super("My exception occured");
    }
    Myexception(String message){
        super(message);
    }
    
}

class Money{
    int amount;
    Money(){
        amount = 0;
    }
}

public class userdefinedexceptionclass {
    public static void main(String[] args) {
        Money m = new Money();
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        m.amount = n.nextInt();
        try{
            if(m.amount<0){
                throw new Myexception("Amount cannot be negative");
            }
        }
        catch(Myexception e){
            System.out.println(e.getMessage());
        }

    }
}