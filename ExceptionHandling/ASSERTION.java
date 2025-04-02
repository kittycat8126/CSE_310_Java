/*
 * When a method declears the exception to be thrown instead of catching it.
 */

public class ASSERTION{
    public static void main(String[] args) {
        try{
            int a = Divide(10,0);
            System.out.println("Result is: "+a);
        }
        catch(ArithmeticException e){
            System.out.println("Devision by Zero");
        }
    }
    public static int Divide(int a,int b) throws ArithmeticException{
        return a/b;
    }
}