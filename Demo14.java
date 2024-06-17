import java.util.*;
class Demo14{
	public static void main(String args[]){
		m1();
	}
	static void m1()
	{
		m2();
		System.out.println("Hi M1............! ");
	}
	static void m2()
	{
		m3();
		System.out.println("Hi M2............! ");
	}
	static void m3()
	{	
		try
		{
			System.out.println("Hi M3............! ");
			Scanner sc =  new Scanner(System.in);
			System.out.println("ENter the A :");
			int a = sc.nextInt();
			System.out.println("ENter the B :");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println("Result :"+c);
		}
		catch(InputMismatchException imp)
		{
			System.out.println("Hi boss please enter only numbers...!"+imp);
		}
		catch(ArithmeticException ae)
		{
				System.out.println("Hi boss we cant devidde anything by 0 "+ae);		
		}
	}
}



checked exception  // compile time exception 
	


upcheck enxpetion // run time exception 
		InputMismatchException
		ArithmeticException