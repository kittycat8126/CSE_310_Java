import java.util.Scanner;

public class day4 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter two numbers to divide: ");
        int k = n.nextInt();
        int y = n.nextInt();
        if(k==0 || y ==0)
        {
            throw new ArithmeticException("Division by zero is not possible Buddy");
        }
        try {
            int div = k/y;
            System.out.println("Division of "+k+" and "+y+" is "+div);
        } catch (Exception e) {
            System.out.println("Exception: "+e);
        }
    }    
}
