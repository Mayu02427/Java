package com.abstraction;

abstract class abd
	{
	abstract void printInfo();
	}
class employee extends abd
{
	void printInfo() 
	{
		String name = "RadhaKrishn";
		int age = 21;
		float salary =55552.2F;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);

	}
}
public class AbstractDemo 
{
public static void main (String args[]) 
	{
	abd s = new employee();
	s.printInfo();
	}
}
