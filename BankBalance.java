class Bank
{
	int balance=1000;
}
class ATM extends Bank
{
	void checkbalance()
	{
		System.out.println("Balance ="+balance);
	}
	void deposit(int amount)
	{
		balance=balance+amount;
		System.out.println("deposit ="+amount);
		System.out.println("Updated Balance ="+balance);
	}
	void withdraw(int amount)
	{
		if(amount<=balance)
		{
			balance=balance-amount;
			System.out.println("withdraw ="+amount);
			System.out.println("Updated Balance ="+balance);
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
}
class BankBalance
{
	public static void main(String[] args)
	{
		ATM atm=new ATM();
		System.out.println();
		atm.checkbalance();
		System.out.println();
		atm.deposit(1000);
		System.out.println();
		atm.withdraw(500);
		System.out.println();
	}
}
