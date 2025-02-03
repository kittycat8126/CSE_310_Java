import java.util.Scanner;

public class arrays_day_06 {
    public static void main(String[] args) {
        System.out.println("Enter the number of subjects: ");
        Scanner n = new Scanner(System.in);
        int nos = n.nextInt();
        double[] marks = new double[nos];
        for(int i = 0;i <nos;i++)
        {
            System.out.println("Enter the marks of subject "+(i+1)+": ");
            Scanner m = new Scanner(System.in);
            marks[i] = m.nextDouble();
        }
        //printing marks
        System.out.println("Your marks are : ");
        for (double d : marks) {
            System.out.print(d+" , ");
        }
    }    
}
