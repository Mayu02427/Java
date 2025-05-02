//Q.2)Write a program to check whether entered number is palindrome or not.

import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
  int n, rev=0,rem, temp;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number");
  n=sc.nextInt();
  temp =n;
  
  while(n>0)
  {
   rem=n%10;
   rev=(rev*10)+rem;
   n=n/10;
  }
   System.out.println(rev);
   if(rev==temp)
    {
      System.out.println(" The number is palindrome");
    }
    else
    {
      System.out.println("The number is not palindrome");
    }

}
}
