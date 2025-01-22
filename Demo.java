class test
{
    int x = 10;
    int y = 20;
    
    void show()
    {
        int z = 30;
        System.out.println("Z is : "+ z);
        System.out.println("x is : "+ x);
        System.out.println("y is : "+ y);
    }
}

public class Demo {
    public static void main(String[] args) {
        test t1 = new test();
        t1.show();
    }
}


// class Demo{
//     // int x = 10;
//     static int y = 20; //only static variables can be called from a static class
//     public static void main(String[] args) {
//         int z = 30;
//         System.out.println("Z is : "+ z);
//         // System.out.println("x is : "+ x);
//         System.out.println("y is : "+ y); 
//     }
// }