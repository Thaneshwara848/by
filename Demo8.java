class Bank
{
	Bank(int a)
	{
	}
	public int roi()
	{
		return 7;
	}
}
class SBI extends Bank
{
	Bank(int a)
	{
	}
}
class Demo8
{
	public static void main(String args[])
	{
		SBI s = new SBI();
		System.out.println(s.roi());			
	}
}