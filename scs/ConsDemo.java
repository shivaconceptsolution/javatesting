package scs;

public class ConsDemo {
    int a,b;
	ConsDemo()  //it is constructor block
	{
		a=100;
		b=200;
		System.out.println(a+b);
	}
	ConsDemo(int a, int b)  //it is constructor block
	{
		this.a=a;
		this.b=b;
		System.out.println(a+b);
	}
	ConsDemo(ConsDemo o)  //it is constructor block
	{
		this.a=o.a;
		this.b=o.b;
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		ConsDemo obj = new ConsDemo();
		ConsDemo obj1 = new ConsDemo(1000,2000);
		ConsDemo obj2 = new ConsDemo(obj);
		ConsDemo obj3 = new ConsDemo(obj1);

	}

}
