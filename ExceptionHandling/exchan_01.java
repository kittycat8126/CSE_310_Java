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

import java.util.InputMismatchException;
import java.util.Scanner;
class x extends Exception {
    x(String s){
        super(s);
    }
    @Override
    public String getMessage(){
        return "Hello vinay ! this side class X you have successfully overrided the method getMessage()";
    }
}
public class exchan_01 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a,b,c=(int)Math.random();
        
        try{
            System.out.println("Enter two numbers: ");
            a = n.nextInt();
            b = n.nextInt();
            //manually throwing exception
            if(b==0){
                throw new x("Divide by zero exception");
            }
            c = a/b;
        }
        catch(x e){
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            return;
        }
        catch(ArithmeticException e){
            System.out.println("Its not me its you!");
        }
        finally{
            n.close();
            System.out.println("Finally block executed");
        }
    }
}

