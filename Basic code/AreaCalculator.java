//WAP to calculate area of Rectangle,Square,Circle (3.14*r*r)
import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose the shape to calculate the area:");
        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                double rectangle = length * width;
                System.out.println("The area of the rectangle is: " + rectangle);
                break;

            case 2:
               
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                double square = side * side;
                System.out.println("The area of the square is: " + square);
                break;

            case 3:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double circle = 3.14 * radius * radius; 
                System.out.println("The area of the circle is: " + circle);
                break;

            default:
                System.out.println("Invalid choice.");
        }

    }
}
