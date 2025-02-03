import java.util.Scanner;

public class arrays_day_06 {
    public static void main(String[] args) {
        System.out.println("Enter the number of subjects: ");
        Scanner n = new Scanner(System.in);
        int nos = n.nextInt();
        double sum = 0;
        double[] marks = new double[nos];
        for(int i = 0;i <nos;i++)
        {
            System.out.println("Enter the marks of subject "+(i+1)+": ");
            Scanner m = new Scanner(System.in);
            marks[i] = m.nextDouble();
            sum += marks[i];
        }
        double avg = sum/nos;
        //printing marks
        System.out.println("The average marks are: " + String.format("%.2f", avg));
        System.out.println("The total marks are: "+String.format("%.2f",sum));
        System.out.println("Your Subject wise marks are : ");
        for (double d : marks) {
            System.out.print(d+" , ");
        }
    }    
}
