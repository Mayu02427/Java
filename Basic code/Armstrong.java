//WAP to check whether the number is Armstrong number or not.
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int n,rem,sum=0,temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
         temp = n;
         while (n != 0) {
            rem = n % 10;      
            sum = sum+(rem * rem * rem); 
            n = n / 10;            
        }

        if (temp==sum) {
        System.out.println("The number is an Armstrong number.");
        }
        else {
            System.out.println("The number is not an Armstrong number.");
             }
    }
}