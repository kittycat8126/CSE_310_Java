// final keyword with a class means that the class cannot be inherited
// final keyword with a method means that the method cannot be overridden
// final keyword with a variable means that the variable cannot be changed
class Fruit{
    void taste(){
        System.out.println("I dont know any taste");
    }
}
class mango extends Fruit{
    void taste(){
        System.out.println("Sweet");
    }
}
public class Demo {
    public static void main(String[] args) {
        Fruit f = new Fruit();
        f.taste();
        f = new mango();
        f.taste();
    }
}
