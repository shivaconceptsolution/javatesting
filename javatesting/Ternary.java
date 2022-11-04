class Ternary
{
public static void main(String args[])
{
int a=10,b=20,c=11;
String s = (a>b && a>c)?"a is greatest": (b>c?"b is greatest":"c is greatest");
System.out.println(s);
}
}