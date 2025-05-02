package com.abstraction;

//Interface for Arithmetic operations
interface Arithmatic {
double operate(double a, double b);

}

//Class for Addition
class Addition implements Arithmatic {
public double operate(double a, double b) {
   return a + b;
}
}

//Class for Subtraction
class Subtraction implements Arithmatic {
public double operate(double a, double b) {
   return a - b;
}
}

//Class for Multiplication
class Multiplication implements Arithmatic {
public double operate(double a, double b) {
   return a * b;
}
}

//Class for Division
class Division implements Arithmatic {
public double operate(double a, double b) {
   if (b == 0) {
       throw new ArithmeticException("Cannot divide by zero");
   }
   return a / b;
}
}

//Main class to demonstrate usage
class ArithmeticOperation {
public static void main(String[] args) {
   Arithmatic add = new Addition();
   Arithmatic sub = new Subtraction();
   Arithmatic mul = new Multiplication();
   Arithmatic div = new Division();

   double num1 = 10, num2 = 5;

   System.out.println("Addition: " + add.operate(num1, num2));
   System.out.println("Subtraction: " + sub.operate(num1, num2));
   System.out.println("Multiplication: " + mul.operate(num1, num2));
   System.out.println("Division: " + div.operate(num1, num2));
}
}


