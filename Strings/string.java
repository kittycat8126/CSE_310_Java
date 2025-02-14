class string
{
    public static void main(String[] args) {
        String a = "Aswin";
        String b = "Kumar";
        String c = "Aswin";
        String d = new String("Aswin");
        System.out.println(a + "," + b + "," + c);
        System.out.println(a.length());
        System.out.println(a==c);
        System.out.println(a.equals(c));
        System.out.println(d==a);
        System.out.println(d.equals(a));
    }
}