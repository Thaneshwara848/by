class Car  implements Runnable
{
	public void run()
	{
		for(int i=0;i<=20;i++)
		{
			try
			{
				if(Thread.currentThread().getName().equals("Bmw"))
				{
					System.out.println("	"+Thread.currentThread().getName()+":"+i);

				}
				if(Thread.currentThread().getName().equals("Benz"))
				{
					System.out.println(Thread.currentThread().getName()+":"+i);

				}
				Thread.sleep(1000);
			}
			catch(Exception e){}
		}
	}
}
class Demo20
{
	public static void main(String args[])
	{
		Car a = new Car();
		Thread t1= new Thread(a);
		Thread t2= new Thread(a);
		t1.start();t2.start();
		t1.setName("Bmw");
		t2.setName("Benz");
		
		for(int k=0;k<=30;k++)
		{
			try
			{
				System.out.println("			K:"+k);
				Thread.sleep(1000);
				if(k==10){t1.suspend();}
				if(k==20){t1.resume();}
				if(k==15){System.out.println(t1.isAlive());}
				if(k==22){t1.stop();}
				if(k==25){System.out.println(t1.isAlive());}

			}
			catch(Exception e){}
		}
	
	}
}

