//class is blue print for an object
import java.util.Scanner;
class AddDemo1
{
 int a,b, sum;
Scanner sc=new Scanner(System.in);
 public void accept()
 {
  System.out.println("Enter two numbers");
  a=sc.nextInt();
  b=sc.nextInt();
 }
public void display()
{
  sum=a+b;
  System.out.println("The result is: "+sum);

}
class Call
{
  public static void main(String args[])
 {
 AddDemo1 obj=new AddDemo1();
 obj.accept();
 obj.display();
 }
}
}
