//bryan boyle, jared rostkowski, alexander montano 
import java.util.*; 
public class EncodeDecodeTest
{ 
  public static boolean equals(int[]x,int[]y)
  {

    
   for (int i=0;i<x.length;i++)
{
    if (x[i]!=y[i])
    {
       return false;
    }
}
return true; 
  }
  
   public static int[] convert(int[] perm)
   {
    
      int k = perm.length-2; 
        int i;
      while(perm[k]>=perm[k+1]) 
            { 
                k=k-1; 
            } 

         
          i = k + 1 ; 
        while(i<perm.length && perm[i] > perm[k])
        {
        i++;
       
        }
         i = i - 1;
         
           
      
         
        int temp=0; 
        temp=perm[i]; 
        perm[i]=perm[k]; 
        perm[k]=temp; 
        
         
        int[] tempArray=new int[perm.length]; 
        for(int g=k+1; g<perm.length;g++) 
        { 
            tempArray[g]=perm[g]; 
         
        } 
       int b = k+1;
        for(int z=perm.length-1;z>=k+1;z--) 
        { 
                      
            perm[b]=tempArray[z];  
          
            b++;
        } 
        return perm;
   }
     
    public static void encode(int n, int m) 
    { 
      
    
        int[] perm = new int[n];
        int[] result = new int[n];
        for(int w = 0; w < n; w++) 
        { 
            perm[w] = w+1; 
       
             
        } 
               
    for(int l = 0; l < m-1;l++)
    {
           perm = convert(perm);
           
    }
   
        
     
       for(int b = 0; b < n; b++) 
       { 
           
            System.out.print(perm[b]); 
             
       } 
    }
    
         

   
    
    
   
     public static void decode() 
     {
        Scanner input = new Scanner(System.in); 
        int i = 0;
        int count1;
        
        System.out.println("Enter the amount of numbers you want to permutate: "); 
        int n = input.nextInt();
         int[] a = new int[n];
        System.out.println("Enter the permutation one number at a time");
        for( int o = 0; o<n; o++)
        {
          a[o] = input.nextInt();
        }
        count1 = calculate(a,n);
         System.out.println("Your permutation is the " + count1 + " permutation ");
     
     }
  public static int calculate(int[]a, int n)
  {
        int count= 1;
       
        int[] perm = new int[n]; 
        for(int w = 0; w < n; w++) 
        { 
            perm[w] = w+1; 
            
        } 
       
    
        
        for(int u = 0; u < n; u++)
        {
        while(! equals(a,perm))
        {
//           for(int q = 0; q <n; q++) 
//        {           
//           System.out.print(perm[q]);      
//        } 
//        System.out.println(); 
          perm = convert(perm);
           for(int q = 0; q <n; q++) 
        {           
           System.out.print(perm[q]);      
        } 
        System.out.println(); 
         
          
          count++;
        }
        }
        return count;
  }
          

        
 
    
 
        
            
         
         
        

       
    
     
    public static void main(String[]args) 
    { 
      int m = 4;
      int n = 4;
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter 1 to encode, or 2 to decode: "); 
        int call = input.nextInt(); 
        if(call==1) 
          
            encode(n,m); 
         else if(call==2) 
        decode(); 
        else 
        { 
            System.out.println("Error"); 
            System.exit(0); 
        } 
        
    } 
   
    }

