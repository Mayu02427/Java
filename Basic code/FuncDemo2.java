public class FuncDemo2 
{
	static int add(int a,int b) //Func with parameter
    {
    	return a+b;
    }
	int Sum;
	void add(int a,int b, int c)
	{
		Sum=a+b+c;
		System.out.println("The sum is: "+Sum);
		
	}
	public static void main(String[] args) 
	{
	    int result =add(23,45); // func calling
	    System.out.println("The return value: "+result);
	    FuncDemo2 obj=new FuncDemo2();
	    obj.add(5,67,23);
	}

}
