import java.util.Scanner;
public class day5 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter attendace percentage: ");
        double att_per = n.nextDouble();
        System.out.println("Bonus marks : " + 
            (att_per > 90 ? 5 : att_per >= 85 ? 4 : att_per >= 80 ? 3 : att_per >= 75 ? 2 : 0));
        String x = "yoyo";
        switch (x) {
            case "yaya":
                System.out.println("did not worked");
                break;
            case "yoyo":
                System.out.println("worked");
                break;
            default:
                break;
        }
        System.out.println("Enter number");
        int tdn = n.nextInt();
        int rev = 0;
        while(tdn!=0)
        {
            int ld = tdn%10;
            tdn /= 10;
            rev = rev*10+ld;
        }
        while(rev != 0)
        {
            System.out.println(rev%10);
            rev = rev /10;
        }
        
        
    }
}
