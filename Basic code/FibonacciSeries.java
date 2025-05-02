//Q.4)Write a program to generate fibonacci series  0 1 1 2 3 5 
class FibonacciSeries 
{
    public static void main(String[] args) 
  {
        int n = 6; 
        int first = 0, second = 1;

        System.out.print(first+ " " + second+ " "); 

        for (int i=2; i<n; i++) 
        {
            int next = first+second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
