final class Car
{
	final int speed=200;
	String colro="Red";
	//final void gare(){ we cant over ride the method
	void gare(){
		//5
	}
}
class Bmw //extends Car
{
	void gare(){
		//automatic
	}	
}
class Demo11
{
	public static void main(String args[])
	{
		Car  a = new Car();
		System.out.println(a.speed);
		//a.speed=2000; we cant re assin 
		System.out.println(a.speed);		
	}
}