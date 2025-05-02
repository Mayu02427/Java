import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        float principal, Year, Rate=6.5f;
        float SimpleInterest;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the principal amount: ");
        principal = input.nextFloat();
                
        System.out.print("Enter the time in years: ");
        Year = input.nextFloat();
        
        double simpleInterest = (principal * Rate * Year) / 100;
        
        
        System.out.println("The Simple Interest is: " + simpleInterest);
        
            }
}
