class FuncDemo1 
{
	static void greet()
	{	
	System.out.println("Hello Everyone!!!");	
	}
	void SayHi()
	{	
	System.out.println("Hi public!!!");	
	greet();
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		greet();
		FuncDemo1 obj= new FuncDemo1();
		obj.SayHi();
	}
}
