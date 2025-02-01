import java.util.Scanner;

public class day5 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        double att_per= n.nextDouble();
        if(att_per>90)
        {
            System.out.println("Bonus marks : "+ 5);
        }
        else if(att_per>=85 && att_per<90)
        {
            System.out.println("Bonus marks: "+4);
        }
        else if(att_per>=80 && att_per<85)
        {
            System.out.println("Bonus marks: "+3);
        }
        else if(att_per>=75 && att_per<80)
        {
            System.out.println("Bonus marks: "+2);
        }
        else
        {
            System.out.println("Bonus marks: "+0);
        } 
    }
}