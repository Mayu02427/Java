//Q.1)WAP to make use of break in real time. write in java simple code

import java.util.Scanner;
class ATMSystem 
{
    public static void main(String[] args) 
  {
        Scanner scanner = new Scanner(System.in);
        int correctPin = 1234; 
        int attempts = 3;

        for (int i=1; i<=attempts; i++) 
        {
            System.out.print("Enter your PIN: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin==correctPin) 
            {
                System.out.println("Access Granted!");
                break;
            } 
            else 
            {
              System.out.println("Incorrect PIN. Try again.");
            }

            if (i==attempts) 
            {
                System.out.println("many failed attempts.Account locked!");
            }
        }
    }
}
