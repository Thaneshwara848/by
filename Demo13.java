class A
{
	private String name;
	private int id;
	void setId(int id)
	{
		this.id=id;
	}
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	int getId()
	{
		return id;
	}
}
class Demo13
{
	public static void main(String args[])
	{
		A a = new A();
		a.setName("Suresh");
		a.setId(100);
		System.out.println("ID :"+a.getId());
		System.out.println("Name :"+a.getName());
	}
}



class  and object 
Oops : 
	inheritance 
	polymorphism 
	Abstarction 
		abstract 
		interface 
	Encupulation 

	extends  , Implements  , this , Super 

	Non Access modifiers like 
		abstarct 
		static 
		final 
	Access modifiers like 
		public 
		private 
		protected 
		default 
	