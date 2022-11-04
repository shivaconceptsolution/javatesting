class Operation
{
    int a=100,b=20,c;
    void addition()
    {
        c = a+b;
        System.out.println(c);
    }
    void substraction()
    {
        c = a-b;
        System.out.println(c);
    }
    void multiplication()
    {
        c = a*b;
        System.out.println(c);
    }

    void division()
    {
       c = a/b;
       System.out.println(c);
    }

    public static void main(String args[])
    {
        Operation obj = new Operation();
        obj.addition();
        obj.division();

    }
}