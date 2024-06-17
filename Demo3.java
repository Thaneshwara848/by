class Parent
{
	int site=5;
	int money=100000;
	String car = "BENZ";

	void use()
	{
		System.out.println("SIte :"+site);
		System.out.println("Money :"+money);
		System.out.println("CAR :"+car);
	}
}
class Child  extends Parent
{
	int money=5000;
	String car = "Maruthi 800 ";
	void use()
	{
		System.out.println("SIte :"+site);
		System.out.println("Money :"+money);
		System.out.println("Parent Money :"+super.money);
		System.out.println("CAR :"+car);
		System.out.println("Parent CAR :"+super.car);
	}
}
class Demo3
{
	public static void main(String args[])
	{

		Parent p = new Parent();
		p.use();

		Child c = new Child();
		c.use();
	}
}