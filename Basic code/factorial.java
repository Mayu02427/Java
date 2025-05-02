//WAP to print factorial of number
import java.util.*;
class factorial {
    public static void main(String[] args) 
    {
      int i,fact=1,n;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      n=sc.nextInt();
      for(i=1;i<=n;i++)
    {
      fact=fact*i;
    }
   System.out.println("The factorial is" +fact);
}
}
