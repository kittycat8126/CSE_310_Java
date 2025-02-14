class string
{
    public static void main(String[] args) {
        // String a = "Aswin";
        // String b = "Kumar";
        // String c = "Aswin";
        // String d = new String("Aswin");
        // System.out.println(a + "," + b + "," + c);
        // System.out.println(a.length());
        // System.out.println(a==c);
        // System.out.println(a.equals(c));
        // System.out.println(d==a);
        // System.out.println(d.equals(a));
        // String e = a.replace('A','a');
        // System.out.println(e);




        /*
         ************************************** Mutable strings
         */
        StringBuilder sb = new StringBuilder("Roman");
        sb.append(" Reigns");
        StringBuffer sBuffer = new StringBuffer("John");
        sBuffer.append(" Cena");
        System.out.println(sb);
        System.out.println(sBuffer);
        System.out.println("capacity of sb: " + sb.capacity()+ " length of sb: \n" + sb.length());
        System.out.println("capacity of sBuffer: " + sBuffer.capacity()+ " length of sBuffer: \n" + sBuffer.length());
        StringBuffer k = new StringBuffer();
        StringBuilder l = new StringBuilder();
        System.out.println("capacity of k: " + k.capacity()+ "\n length of k: " + k.length());
        System.out.println("capacity of l: " + l.capacity()+ "\n length of l: " + l.length());
    }
}