//Q.1) WAP To accept age from user and make decision whether he can vote or not.

import java.util.Scanner;

public class Voting
{
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) 
        {
            System.out.println("You are eligible");
        } else 
        {
            System.out.println("You are not eligible");
        }

    }
}
