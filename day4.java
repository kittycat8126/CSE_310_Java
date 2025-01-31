import java.util.Scanner;

public class day4 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int k = n.nextInt();
        int y = n.nextInt();
        int div = k/y;
        System.out.println("Division of "+k+" and "+y+" is "+div);
    }
    
}
