//WAP to accept 5 elements from the user and make a decision which one is larger element.
import java.util.Scanner;
class MaxArr
{
public static void main(String args[])
{
 int max,i;
 int a[]=new int[5];
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter five element");
 for(i=0;i<5;i++)
 {
   a[i]=sc.nextInt();
 }
max=a[0];
for(i=0;i<5;i++)
{
   if(a[i]>max)
   {
     max=a[i];
   }
}
System.out.println("The maximum element in this array is: "+max);
}
}

