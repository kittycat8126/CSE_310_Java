interface A{
    void show(int a);
    // String showing();
    // void show(); //this will give error as it is not functional interface
}
public class lambda{
    public static void main(String[] args) {
        // A a0 = new A(){
        //     public void show(){
        //         System.out.println("A-zero");
        //         //return "A-zero";
        //     }
        // };
        // a0.show();
        //lambda expression for interface A  
        //A a1 = () -> {return "A-one";}; //one way of writing lambda expression with return statement
        //System.out.println(a1.show());
        //A a2 = () -> "Appo ato to "; //another way of writing lambda expression without return statement
       // System.out.println(a2.show()); 
        //System.out.println(a2.showing());
        //A a3 = () -> {System.out.println("A-three"); return "A-three";}; //one way of writing lambda expression with return statement where it will print and will return as well.
        //System.out.println(a3.show());    
        
        // with parameters
        A a4 = a -> {System.out.println("A-four "+a);}; //one way of writing lambda expression with return statement.
        a4.show(5);
        A a5 = a -> System.out.println((a+a+a));;
        a5.show(5);
        A a6 = System.out::println; // we have restructed our print method to not to print anything except an interger brcause it is binded wiht show method of interface A which has an argument of int type.
        a6.show(98);
    }
}