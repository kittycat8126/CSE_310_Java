//templates in java 
public class Templates {
    public static void main(String[] args) {
        print(1);
        print(3.5);
        print("Hello");
        print(new Integer(2));
    }
    // private static void print(Object i){
    //     System.out.println(i);
    // }
    private static  <T> void print(T i){
        System.out.println(i);
    }
    // private static void print(double d ){
    //     System.out.println(d);
    // }
    // private static void print(String s ){
    //     System.out.println(s);
    // }
}
