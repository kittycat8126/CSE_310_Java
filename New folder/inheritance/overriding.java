class MyDate{
    int d , m ,y;
    MyDate(int dd,int mm,int yy){
        d = dd;
        m = mm;
        y = yy;

    }
    // @Override
    // int hashCode(){
    //     int prime = 31;

    // }
    //overridin successfull
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }
        MyDate other = (MyDate)obj;
        if(d == other.d && m == other.m && y == other.y){
            return true;
        }
        if(hashCode() != obj.hashCode()){
            return false;
        }
        return true;
    }

    //++++++++++++++++++++++++++++YOU CAN NOT OVERRIDE FINAL METHODS+++++++++++++++++++++++++++++++++++++//
    //@Override      
    // public Class getClass(){
    //     System.out.println("MyDate");
    // }
}
public class overriding {
    public static void main(String[] args) {
        MyDate d = new MyDate(26,2,2025);
        MyDate d1 = new MyDate(26,2,2025);
        System.out.println(d.equals(d1));
        System.out.println(d.getClass());
        System.out.println(d1.getClass());
    }
}
