public class day2 {
    public static void main(String[] args) {
        /*****************************************************WRAPPER CLASS**********************************************/

        //Integer a = new Integer(56);
        //System.out.println(a);

        /*****************************************************Operators**********************************************/
        System.out.println(25-5.0);
        System.out.println(25*5.0);
        System.out.println(25/5.0);
        System.out.println(25+5.0);
        System.out.println(25%5.0);

        //bitwise Operators
        System.out.println(25&5);
        System.out.println(25|5);
        System.out.println(25^5);
        System.out.println(~5);
        System.out.println(~25);
        System.out.println(-25<<1);
        System.out.println(-25>>1);
        System.out.println(-25>>>1);


        int a = 5;
        int b = 234;
        int c = 34;

        System.out.println("smallest is  : " + (a<b && a<c ? a : b<c ? b : c));
    }   
}

