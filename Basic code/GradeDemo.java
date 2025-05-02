import java.util.*;
class GradeDemo
{
  public static void main(String args[])
   {
     float per;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your percentage: ");
     per=sc.nextFloat();
     if(per>=75)
      {
      System.out.println("You got O grade");
      }
     else if(per>=60 && per<75)
     {
      System.out.println("You got A grade");
     }
     else if(per>=40)
     {
      System.out.println("You got B grade");
     }
     else 
     {
      System.out.println("You failed ");
     }
}
}