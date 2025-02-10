class Money
{
    private int rs, ps;
    public Money() //modifying the default constructor
    {
        rs = 100;
        ps = 0;
    }
    public Money(double d) //constructor overloading
    {
        set(d);
    }
    public void set(int rs, int ps)
    {
        while(ps>=100)
        {
            ps -= 100;
            rs++;
        }
        this.rs = rs;
        this.ps = ps; //this keyword is used to refer to the current object
    }
    public void set(double r)
    {
        rs = (int)r;
        ps = (int)((r-rs)*100);
    }
    public void print()
    {
        System.out.println("Rs " + rs + "." + ps);
    }
    Money add(Money b)
    {
        Money s = new Money();
        s.rs = rs + b.rs;
        s.ps = ps + b.ps;
        if(s.ps>=100)
        {
            s.ps = s.ps - 100;
            s.rs++;
        }
        return s;
    }
}
class Demo2
{
    public static void main(String args[])
    {
        Money m, n, p;
        m = new Money();
        m.set(10.40);
        m.print();
        n = new Money();
        n.set(25,75);
        m.print();
        n.print();
        p = m.add(n);
        p.print();
    }
}