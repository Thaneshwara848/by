class A  extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			try
			{
				System.out.println("I :"+i);
				Thread.sleep(1000);
			}
			catch(Exception e){}
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int j=0;j<=10;j++)
		{
			try
			{
				System.out.println("	J :"+j);
				Thread.sleep(1000);
			}
			catch(Exception e){}


		}
	}

}
class C  extends Thread
{
	public void run()
	{
		for(int k=0;k<=10;k++)
		{
			try
			{
				System.out.println("		K:"+k);
				Thread.sleep(1000);
			}
			catch(Exception e){}
		}
	}
}
class Demo18
{
	public static void main(String args[])
	{
		A a = new A();a.start();
		B b = new B();b.start();
		C c = new C();c.start();	
	}
}



