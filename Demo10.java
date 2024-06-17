class A
{
	static int x=1000;
	static void display()
	{
		System.out.println("Hi A class Display method ....!");
	}

}
class Demo10
{
	public static void main(String args[])
	{
		//A  a = new A();a.display();
		//System.out.println(a.x);
		A.display();
		System.out.println(A.x);

	}
}