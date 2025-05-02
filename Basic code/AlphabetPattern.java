/*Q.3)A                        # ###

       A B                     # # #

       A B C                 # #
print above pattern 

*/

class AlphabetPattern
  {
    public static void main(String[] args) 
    {
        int n=3; 
        
        for(int i=0; i<n; i++) {
          
            for (char ch ='A'; ch <='A' +i; ch++) 
            {
                System.out.print(ch+ " ");
            }
            
            
            for (int s=0; s<(n-i-1)*2; s++) 
            {
                System.out.print(" ");
            }
            
            for (int j=0; j < (n-i); j++) {
                System.out.print("# ");
            }
            
            System.out.println();
        }
    }
}
