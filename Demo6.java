
class A
{
	void draw()
	{
		System.out.println("Hi A default const...!");
	}
	void draw(int r)
	{
		// PI * R * 2 
		System.out.println("Hi A constr with 1 parm ");
	}
	void draw(int a,int  b)
	{
		//a*b 
		System.out.println("Hi A constr with 2 parm ");
	}
}

// same const name + diff parm + multiple times in same class = const oveer loding ....!
class Demo6
{
	public static void main(String args[])
	{
		A a = new A();
		a.abc();
		a.abc(100);
		a.abc(100,"ABC");
	}
}