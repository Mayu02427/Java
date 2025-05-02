//(2) WAP to get simple Interest.
import java.util.Scanner;

public class SimpleInterest1 {
    public static void main(String[] args) {
        float principal, Year, Rate=5.4f;
        double SI;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the principal amount: ");
        principal = input.nextFloat();
                
        System.out.print("Enter the time in years: ");
        Year = input.nextFloat();
        
        SI = (principal *Rate*Year) / 100;
        
        
        System.out.println("The Simple Interest is: " + SI);
        
            }
}
