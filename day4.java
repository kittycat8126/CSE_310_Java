import java.util.Scanner;

public class day4 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter two numbers to divide: ");
        int k = n.nextInt();
        int y = n.nextInt();
        // if(y==0)
        // {
        //     throw new ArithmeticException("Division by zero not possible Buddy");
        // }
        // try {
        //     int div = k/y;
        //     System.out.println("Division of "+k+" and "+y+" is "+div);
        // } catch (Exception e) {
        //     System.out.println("Exception: "+e);
        // }
        switch (y) 
        {
            case 0:
                System.out.println("Division by zero not possible Buddy");
                break;
            default:
                System.out.println("Division of "+k+" and "+y+" is "+k/y);
                break;
        }        
    }    
}
