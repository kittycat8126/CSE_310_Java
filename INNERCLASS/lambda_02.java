//Wap to divide two numbers using lambda expression
interface A{
    void show(int a, int b);
}
public class lambda_02 {
    public static void main(String[] args) {
        A a7 = (a,b) -> System.out.println(a/b);
        a7.show(10, 5);
    }
}
