/*class Student
{
	private int id;
	public void setId(float id)
	{
		this.=id;
	}
	public int getId()
	{
		return id;
	}
	public static void main(String[] args)
	{
		Student st=new Student();
		st.setId(10);
		System.out.print(st.getId());
	}
}*/

class Main
{
    private int balance = 1000;
    public int getBalance()
    {
        return balance;
    }
    public void deposit(int amount)
    {
        balance +=amount;
    }
    public static void main(String[] args)
    {
        Main bank = new Main();
        System.out.println(bank.getBalance());
        bank.deposit(500);
        System.out.println( bank.getBalance());
    }
}

