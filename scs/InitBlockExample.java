package scs;

public class InitBlockExample {

	int a,b;
	{
		a=10;
		b=20;
	}
	
	public InitBlockExample() {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		
        InitBlockExample obj = new InitBlockExample();
	}

}
