package scs;

public class Bank {

	private int balance;
	Bank()
	{
		balance = 100;
	}
	private void credit(int amt)
	{
		balance+=amt;
	}
	private void debit(int amt)
	{
		balance-=amt;
	}
	private void checkBalance()
	{
		System.out.println("Balance is "+balance);
	}
	
	public void login(int pincode)  //encapsulation
	{
		if(pincode==1122)
		{
			this.credit(1200);
			this.debit(200);
			this.checkBalance();
		}
		else
		{
			System.out.println("Invalid Pin Code");
		}
	}
}
