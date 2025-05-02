/*A switch works with byte,short,char,and int primitive data types.It also works with 
enumerated types (discussed in Enum Types), the String class, and a few special classes that wrap certain primitive types: Character, Bytes, short, and Integer (discussed in Numbers and Strings).
switch(op)
{
   case 1:
          block of code;
          break;
   case 2:
          block of code;
          break;
   case 3:
          block of code;
          break;
   case 4:
          block of code;
          break;
   default:
          System.out.print("Invalid input");
          break;
*/

//WAP to basic Calculator
import java.util.*;
class Switch{
 public static void main(String[] args) {
   int a,b,res,ch;
   Scanner sc = new Scanner(System.in);
   System.out.print("Press 1.Add\n 2.sub\n 3.Mul\n 4.Div\n ");
   System.out.print("Enter a choice: ");
   ch=sc.nextInt();
   
  switch(ch)
  {
    case 1:
          System.out.print("Enter two numbers: ");
          a=sc.nextInt();
          b=sc.nextInt();
          res=a+b;
          System.out.print("The ans is: "+res);
          break;
   case 2:
          System.out.print("Enter two numbers: ");
          a=sc.nextInt();
          b=sc.nextInt();
          res=a-b;
          System.out.print("The ans is: "+res);
          break;

   case 3:
          System.out.print("Enter two numbers: ");
          a=sc.nextInt();
          b=sc.nextInt();
          res=a*b;
          System.out.print("The ans is: "+res);
          break;

   case 4:
         System.out.print("Enter two numbers: ");
          a=sc.nextInt();
          b=sc.nextInt();
          res=a/b;
          System.out.print("The ans is: "+res);
          break;

   default:
          System.out.print("Invalid input");
          break;
}
}
}