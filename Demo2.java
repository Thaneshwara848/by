import java.util.Scanner;
class Dev
{
	int id, age;
	float  salary=50000;
	String name;
	String desig="Developer";
	Dev()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("HI ID  ");id=sc.nextInt();
		System.out.println("HI NAME  ");name=sc.next();
		System.out.println("HI Age  ");age=sc.nextInt();
		
	}	
	void display()
	{
		System.out.println("My ID is :"+id);
		System.out.println("My Name is :"+name);
		System.out.println("My Age is :"+age);
		System.out.println("My Salary is :"+salary);
		System.out.println("My Desig is :"+desig);
	}
}

class Clerk
{
	int id, age;
	float  salary=20000;
	String name;
	String desig="Clerk";
	Clerk()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("HI ID  ");id=sc.nextInt();
		System.out.println("HI NAME  ");name=sc.next();
		System.out.println("HI Age  ");age=sc.nextInt();
		
	}	
	void display()
	{
		System.out.println("My ID is :"+id);
		System.out.println("My Name is :"+name);
		System.out.println("My Age is :"+age);
		System.out.println("My Salary is :"+salary);
		System.out.println("My Desig is :"+desig);
	}
}
class Manager
{
	int id, age;
	float  salary=80000;
	String name;
	String desig="Manager";
	Manager()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("HI ID  ");id=sc.nextInt();
		System.out.println("HI NAME  ");name=sc.next();
		System.out.println("HI Age  ");age=sc.nextInt();
		
	}	
	void display()
	{
		System.out.println("My ID is :"+id);
		System.out.println("My Name is :"+name);
		System.out.println("My Age is :"+age);
		System.out.println("My Salary is :"+salary);
		System.out.println("My Desig is :"+desig);
	}
}
class Tester
{
	int id, age;
	float  salary=30000;
	String name;
	String desig="Tester";
	Tester()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("HI ID  ");id=sc.nextInt();
		System.out.println("HI NAME  ");name=sc.next();
		System.out.println("HI Age  ");age=sc.nextInt();
		
	}	
	void display()
	{
		System.out.println("My ID is :"+id);
		System.out.println("My Name is :"+name);
		System.out.println("My Age is :"+age);
		System.out.println("My Salary is :"+salary);
		System.out.println("My Desig is :"+desig);
	}
}
class Demo2
{
	public static void main(String args[])
	{
		System.out.println("============== Developer Details ==================");
			Dev d = new Dev();	
			d.display();
		System.out.println("============== Manager Details ==================");
			Manager m = new Manager();
			m.display();
		
		System.out.println("============== Clerk  Details ==================");
			Clerk c = new Clerk();
			c.display();
		
		System.out.println("============== Tester Details ==================");
			Tester t = new Tester();	
			t.display();
		
	}
}
