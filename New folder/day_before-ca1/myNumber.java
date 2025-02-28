/*
 * WAP to create a class Mynumber with a private variable value, of type double, introduce one -argument constructor to initalize the value variable . introduce a default constructor that will initialize the value wiht user input
 * over ride toSting() and equals() method for this class
 */

import java.util.Scanner;
public class myNumber {

    private double value;
    myNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        value = sc.nextDouble();
    }
    myNumber(double value){
        this.value = value;
    }
    public String toString(){
        return "Value: "+value;
    }
    public boolean equals(Object obj){
        if(obj instanceof myNumber){
            myNumber temp = (myNumber)obj;
            if(this.value == temp.value){
                System.out.println("your number are equal");
                return true;
            }
        }
        System.out.println("your number are not equal");
        return false;
    }
    public static void main(String[] args) {
        myNumber obj1 = new myNumber(10.5);
        myNumber obj2 = new myNumber();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1.equals(obj2));
    }
}