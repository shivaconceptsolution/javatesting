package scs;

public class StaticBlockExample {

	static int x,y;
	static
	{
		x=100;
		y=200;
		System.out.println("Result is "+(x+y));
	}
	public static void main(String[] args) {
		System.out.println("This is Main Method");

	}
	
}
