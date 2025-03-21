/*
 *      HOW TO HANDLE EXCEPTIONS
 *             - try{
 *                // code that may throw exception(code that has possibilty of generating runtime exception)
 *               }
 * 
 *             - catch(Exceptionclassname object){
 *               // code to handle exception
 *               }
 */

import java.util.Scanner;

public class exchan_01 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a,b,c=(int)Math.random();
        boolean falg = true;
        System.out.println("Enter two numbers: ");
        a = n.nextInt();
        b = n.nextInt();
        try{
            c = a/b;  
        }
        catch(Exception e){
            System.out.println("Can not divide by zero");
            falg = false;
        }
        if(falg)
        System.out.println("Result: "+c);
    }
}

