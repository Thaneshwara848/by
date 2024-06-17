import java.util.Scanner;

interface Company
{
	void cab();
}
abstract class Emp
{
	int id, age;
	String name;
	float salary;
	String desig;
	Emp()
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
	//abstract void raiseSal();
}
final  class Dev extends Emp  implements Company
{
	float  salary=50000;
	String desig="Developer";
	// over ride the cab method 
	
}
final class Clerk extends Emp
{
	Clerk()
	{
		salary=20000;
		desig="Clerk";
	}
}
 final class Manager extends Emp
{
	float  salary=80000;
	String desig="Manager";	
}
final class Tester extends Emp
{
	float  salary=30000;
	String desig="Tester";	
}
class Demo5
{
	public static void main(String args[])
	{
		int ch1,ch2=0;Clerk c=null ;Dev d=null;
		Scanner sc= new Scanner(System.in);
		do{
			System.out.println("1 ) CREATE ");
			System.out.println("2 ) DISPLAY ");
			System.out.println("3 ) EXIT  ");
			ch1=sc.nextInt();
			if(ch1==1)
			{
				do{
					System.out.println("1 ) Clerk ");
					System.out.println("2 ) Developer ");
					System.out.println("3 ) Tester ");
					System.out.println("4 ) Manager ");
					System.out.println("5 ) EXIT  ");
					ch2=sc.nextInt();
					if(ch2==1)
					{
						 c = new Clerk();
					}
					if(ch2==2)
					{
						 d = new Dev();
					}
				}while(ch2<=5);		
			}
			if(ch1==2)
			{
				c.display();
				d.display();
			}
			if(ch1==3)
			{
				System.out.println("Thank you ");
				System.exit(0);
			}
		}while(ch1<=3);		
	}
}