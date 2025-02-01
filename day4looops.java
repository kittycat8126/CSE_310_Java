import java.util.Scanner;

public class day4looops {
    public static void main(String[] args) {
        System.out.println("Loops in Java");
        Scanner n = new Scanner(System.in);
        System.out.println("Enter n :");
        int n1 = n.nextInt();
        int sum = 0;
        // for(int i =1;i<=n1;i++)
        // {
        //     if(i%2==0)
        //     {
        //         sum += (i*i);
        //     }
        //     else{
        //         sum += i;
        //     }
        // }
        // System.out.println("Sum of series is: "+sum);

        //===========================================patterns=====================================================
        int sumev = 0;
        int sumod = 0;
        int arr[] = new int[n1];
        for(int i = 0;i<n1;i++)
        {
            arr[i] = n.nextInt();
        }
        for(int i = 0;i<n1;i++)
        {
            if(arr[i]%2==0)
            {
                sumev += arr[i];
            }
            else{
                sumod += arr[i];
            }
        }
        System.out.println("Sum of even numbers is: "+sumev);
        System.out.println("Sum of odd numbers is: "+sumod);
    }
}
