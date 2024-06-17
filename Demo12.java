class A
{
	int a;
	 A(){}
	void xyz(){}
}
class B{}
//class C extends B,A{} bcz muiltiple inheratence is not support in class 
abstract class X1{int a; X1(){}
	// both abstract and non abstacrt	
}

interface I
{ 
	int a=100;
	//I(){}
	abstract void xyz();
}
interface J {}
interface K extends I,J{}
class Demo12
{
	public static void main(String args[])
	{		
		//A a = new A();
		//X1 x= new X1(); we cant create a obj of Abstract 
	}
}