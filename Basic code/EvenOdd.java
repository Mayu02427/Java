//Q.2)Java Program to check whether a given number is even or odd using if-else.

import java.util.Scanner;
class EvenOdd 
{
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) 
        {
            System.out.println(num +" is even");
        } else 
        {
            System.out.println(num +" is odd");
        }

        
    }
}
