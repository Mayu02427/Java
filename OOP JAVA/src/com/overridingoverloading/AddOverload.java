package com.overridingoverloading;
class Calculator{
	int add(int a, int b)
	{
		return a+b;
	}
	int add(int a, int b, int c) 
	{
		return a+b+c;
	}
	double add(double a, double b)	
	{
		return a+b;
	}
}
public class AddOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        Calculator obj = new Calculator();

        // Calling overloaded methods
        int sum1 = obj.add(10, 20);
        int sum2 = obj.add(10, 20, 30);
        double sum3 = obj.add(5.5, 4.5);

        // Printing results
        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of three integers: " + sum2);
        System.out.println("Sum of two doubles: " + sum3);
        
	}

}
