import java.util.*;
public class twoDarray {
    public static void main(String[] args) {
        System.out.println("enter number of rows: ");
        System.out.println("Enter the number of columns: ");
        Scanner r = new Scanner(System.in);
        int rows = r.nextInt();
        int cols = r.nextInt();
        int m[][] = new int[rows][cols];
        for(int i = 0;i<rows;i++)
        {
            for(int j = 0;j<cols;j++)
            {
                System.out.println("Enter the element at position "+i+","+j+": ");
                m[i][j] = r.nextInt();
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

        //transpose of the matrix
        System.out.println("The transpose of the matrix is: ");
        for(int i = 0;i<cols;i++)
        {
            for(int j = 0;j<rows;j++)
            {
                System.out.print(m[j][i]+" ");
            }
            System.out.println();
        }
    }
}
