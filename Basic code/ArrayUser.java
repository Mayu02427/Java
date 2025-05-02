//WAP to accept 5 element from user and display the samr
import java.util.Scanner;
class ArrayUser

{

public static void main(String args[])
{

int[] marks= new int[5];
Scanner sc = new Scanner(System.in);
System.out.println("Enter five elements");


for(int i=0;i<5;i++)
{
 marks[i] =sc.nextInt();
  }
System.out.println("You have entered: ");
for(int i=0;i<5;i++)
{
 System.out.println(marks[i]);
 }
}
}
