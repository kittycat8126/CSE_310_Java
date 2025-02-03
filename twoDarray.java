import java.util.*;
public class twoDarray {
    public static void main(String[] args) {
        System.out.println("enter number of rows: ");
        System.out.println("Enter the number of columns: ");
        Scanner r = new Scanner(System.in);
        int rows = r.nextInt();
        Scanner c = new Scanner(System.in);
        int cols = c.nextInt();
        int m[][] = new int[rows][cols];
        for(int i = 0;i<rows;i++)
        {
            for(int j = 0;j<cols;j++)
            {
                System.out.println("Enter the element at position "+i+","+j+": ");
                Scanner e = new Scanner(System.in);
                m[i][j] = e.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for(int i = 0;i<rows;i++)
        {
            for(int j = 0;j<cols;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}
