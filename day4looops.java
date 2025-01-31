import java.util.Scanner;

public class day4looops {
    public static void main(String[] args) {
        System.out.println("Loops in Java");
        Scanner n = new Scanner(System.in);
        System.out.println("Enter n :");
        int n1 = n.nextInt();
        int sum = 0;
        for(int i =1;i<=n1;i++)
        {
            if(i%2==0)
            {
                sum += (i*i);
            }
            else{
                sum += i;
            }
        }
        System.out.println("Sum of series is: "+sum);
    }
}
