//(3) WAP to find average of three numbers
import java.util.Scanner;

public class AverageNumber 
{
    public static void main(String[] args) 
  {
        int num1, num2, num3; 
        double average;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        num3 = scanner.nextInt();
        
        average = (num1+num2+num3)/3;
        
        System.out.println("The average of three numbers is: " + average);
        
    }
}
