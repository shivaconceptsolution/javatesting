class CI
{
public static void main(String args[])
{
float p=40000,r=3,t=5,n=12;
double A;
r = r/100;
A = p*Math.pow((1+r/100),n*t);
System.out.println(A);
}
}