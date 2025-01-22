class test
{
    int x = 10;
    int y = 20;
    static int j = 87;
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
        //if you want to access the static variables inside the main or any other class you have to use class name in which the variable is decealred
        System.out.println(test.j);
        t1.show();
    }
}


// class Demo{
//     int x = 10;
//     static int y = 20; //only static variables can be called from a static class
//     public static void main(String[] args) {
//         int z = 30;
//         System.out.println("Z is : "+ z);
//         System.out.println("x is : "+ (new Demo().x)); //the non static methods or members can be accessd thorugh the objects or with help of object refrernces
//         System.out.println("y is : "+ y); 
//     }
// }