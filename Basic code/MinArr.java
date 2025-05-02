import java.util.Scanner;

class MinArr
{
    public static void main(String args[])
    {
        int min, i;
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five elements:");
        for(i = 0; i < 5; i++)
        {
            a[i] = sc.nextInt();
        }
        min = a[0];

        for(i = 0;i<5;i++)
        {
            if(a[i]<min)            
            {
                min = a[i];
            }
        }
        System.out.println("The minimum element in this array is: " + min);
    }
}
