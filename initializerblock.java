class A{
    int val =0;
    static int count ;
    //static initializer block
    static
    {
        count = 0;
        //val = 10; //error as static block cannot access non static variables   
    }
    //initializer block it is always called before constructor and constructor overrides the same variables used in both
    {
        val = 10;
        count = 1;
    }
    A()
    {
        val = 20;
        count = 1;
    }
    void print(){
        System.out.println("Value is: "+val);
    }
}

class B{
    static{
        System.out.println("B static");
    }
    {
        System.out.println("B simple");
    }
    B(){
        System.out.println("B constructor");
    }
}
public class initializerblock {
    public static void main(String[] args) {
        A obj = new A();
        obj.print();
    }
}
