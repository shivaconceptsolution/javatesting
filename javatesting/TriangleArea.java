class TriangleArea
{
public static void main(String args[])
{
   int a=10,b=10,c=10;
   int s = (a+b+c)/2;
   double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
   System.out.println(area);
}
}