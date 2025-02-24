import java.util.Scanner;

class Father{
    int income ;
    Father(int n){   
        System.out.println("Father constructor called");
    }
    public void car(){
        System.out.println("Father's car");
    }
    public void showIncome(){
        System.out.println("Father's income is : "+income);
    }
}
class son extends Father{
    int income;
    int pocketmoney;
    son(int i,int p,int f){
        super(f);
        this.income = i;
        pocketmoney = p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Son constructor called");
        sc.close();
    }
    public void showIncome(){
        System.out.println("Son's income is : "+income);
        System.out.println("Son's pocketmoney is : "+pocketmoney);
        super.showIncome();
    }
}
class simple{
    public static void main(String args[]){
        Scanner op = new Scanner(System.in);
        System.out.println("Enter your pocketmoney noob: ");
        int pckmny = op.nextInt();
        System.out.println("Enter your income noob: ");
        int inc = op.nextInt();
        System.out.println("Enter your fathers income noob: ");
        int fin = op.nextInt();
        son f = new son(inc,pckmny,fin);
        f.showIncome();
    }
}