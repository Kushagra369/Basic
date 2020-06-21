abstract class Bank
{
	static int x=0;
	static void getBalance()
	{
		System.out.println("The balance of the account is: " +x);
	}
}

class BankA extends Bank
{
	static int x = 100;
	static void getBalance()
	{
		System.out.println("The balance of the account A is: $" +x);
	}
}

class BankB extends Bank
{
	static int x = 150;
	static void getBalance()
	{
		System.out.println("The balance of the account B is: $" +x);
	}
}

class BankC extends Bank
{
	static int x = 200;
	static void getBalance()
	{
		System.out.println("The balance of the account C is: $" +x);
	}
}

public class Que2
{
	public static void main(String [] args)
	{
		BankA a = new BankA();
		BankB b = new BankB();
		BankC c = new BankC();

		a.getBalance();
		b.getBalance();
		c.getBalance();
	}
}