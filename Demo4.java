class Parent
{
	Parent()
	{
		System.out.println("Hi Parent ");
	}
	Parent(int a)
	{
		System.out.println("Hi Parent int a ");
	}
}
class Child   extends Parent
{
	Child()
	{
		System.out.println("Hi Child ");
	}	
}
class Demo4
{
	public static void main(String args[])
	{
		//Parent p = new Parent();	
		Child c = new Child();
	}
}
// as soon as we create a child class obj it automaticall call the parent clas default constr