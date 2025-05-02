//WAP to get sum of digits input accepted by user
import java.util.Scanner;
class SumDigit
{
  public static void main(String args[])
  {
   int n,rem,sum=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number");
   n=sc.nextInt();
   while(n>0)
   {
   rem=n%10;
   sum=sum+rem;
   n=n/10;
   }
System.out.println("The sum of digit in given number is: "+sum);
}
}