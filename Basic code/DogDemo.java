//Constructor
class DogConstructor
{
   	String name;
  	int age;
	 DogConstructor()
	{
        System.out.println("New objevt is created");
     	}
        DogConstructor(String name)
        {
	 this.name=name;
	}
  
	DogConstructor(String name,int age)
	{
	 this.name=name;
         this.age=age;
	}
}
class DogDemo
{
	public static void main(String args[])
        {
	//Constructor with noargument isdefault constructor	
 	DogConstructor obj=new DogConstructor(); 
	DogConstructor obj1= new DogConstructor("Puppy");
        System.out.println("The name is:"+obj1.name);
        DogConstructor obj2= new DogConstructor("Dolly",5);
        System.out.println("The name is:"+obj2.name+" and age is: "+obj2.age);
	
        }
}