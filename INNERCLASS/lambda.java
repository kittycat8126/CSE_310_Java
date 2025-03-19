interface A{
    void show();
}
public class lambda{
    public static void main(String[] args) {
        A a0 = new A(){
            public void show(){
                System.out.println("A-zero");
            }
        };
        a0.show();
        //lambda expression for interface A 
        A a1 = () -> System.out.println("A-one");
        a1.show();        
    }
}