//Jared Rostkowski
import java.util.*;
public class fiveCard
{
  public static void printsDoubleArray(DoubleArray a)
 {
   for(int i = 0; i < 3;i++)
   {
     System.out.print(a.comb[i] + "     ");
   }
   for(int j = 0; j < 2;j++)
   {
     System.out.print(a.code[j]);
   }
   System.out.println();
 }
     public static int[] encode(int n, int m) 
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
           
            //System.out.print(perm[b]); 
             
       } 
       return perm;
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
 public static int[] doSelectionSort(int[] arr)
{ 
  for (int i = 0; i < arr.length - 1; i++) 
  { int index = i; 
    for (int j = i + 1; j < arr.length; j++) 
      if (arr[j] < arr[index]) 
      index = j; 
    int smallerNumber = arr[index]; 
    arr[index] = arr[i]; 
    arr[i] = smallerNumber; } 
  return arr; } 
  
  
  
  
  
  
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
 
    
    System.out.print("Enter 1 for the code, Enter 2 for hidden number");
    int answer = input.nextInt();
    if(answer == 1)
    {
      codePerm();
    }
    if(answer == 2)
    {
      hiddenNum();
    }
  }
      public static void codePerm()
      {
        int[] encoder = new int[4];
//    int switcher = 0;
 int[] works1 = new int[27];
 int[] coding = new int[5];
         Scanner input = new Scanner(System.in);
        int[] finalHand = new int[4];
    int [] hand = new int[5];
    System.out.println("Enter your permutation one number at a time");
     for( int x = 0; x<5; x++)
        {
          hand[x] = input.nextInt();
        }
    int[] coding1 = new int[5];
    
    int hidden = 0;
    int remainder;
    int remainder2 = 0;
    int q = 0;
    int z = 0;
     
      boolean[] works = new boolean[125];
     
   
 for(int o = 1; o < 125; o++)
 {
   works[o] = false;
 }


  doSelectionSort(hand);

  remainder = (hand[0] + hand[1] + hand[2] + hand[3] + hand[4])%5;
 
hidden =  hand[remainder];

  if(remainder == 0)
  {
   coding[0] =  hand[1];
   coding[1] =  hand[2];
   coding[2] =  hand[3];
   coding[3] =  hand[4];
  }
   if(remainder == 1)
  {
   coding[0] =  hand[0];
   coding[1] =  hand[2];
   coding[2] =  hand[3];
   coding[3] =  hand[4];
  }
    if(remainder == 2)
  {
    coding[0] =  hand[0];
    coding[1] =  hand[1];
    coding[2] =  hand[3];
    coding[3] =  hand[4];
  }
     if(remainder == 3)
  {
    coding[0] =  hand[0];
    coding[1] =  hand[1];
    coding[2] =  hand[2];
    coding[3] =  hand[4];
  }
      if(remainder == 4)
  {
    coding[0] =  hand[0];
    coding[1] =  hand[1];
    coding[2] =  hand[2];
    coding[3] =  hand[3];
  }
    
//    System.out.print(coding[0]);
//     System.out.print(coding[1]);
//      System.out.println();
  
    
   int n;
  for(n = 0; n < 125; n++)
  {
    if( n != coding[0] && n != coding[1])
    {
    coding1[0] = coding[0];  
    coding1[1] = coding[1];  
    coding1[2] = coding[2];
    coding1[3] = coding[3];
    coding1[4]= n;
   
    


 remainder2 = (coding1[0] + coding1[1] + coding1[2] + coding1[3] + coding1[4])%5;
 

   
    
    doSelectionSort(coding1);

   
       
    if(coding1[0] == n && remainder2 == 0)
    {
      works[n] = true;
    }
    if(coding1[1] == n && remainder2 == 1)
      {
         works[n] = true;
      }
     if(coding1[2] == n && remainder2 == 2)
      {
       works[n] = true;
      }
     if(coding1[3] == n && remainder2 == 3)
      {
       works[n] = true;
      }
     if(coding1[4] == n && remainder2 == 4)
      {
       works[n] = true;
      }
    }
  }
  
//for(int d = 1; d < 125; d++)
//{
//    System.out.print(d + "   ");
//  System.out.println(works[d]);
//}
                         
  
  int holder = 0;
  for(int p = 0; p < 125;p++)
  {
  
    if( works[p])
    {
      works1[holder] = p;
      holder++;
    
    }
  }
  
//  System.out.println(hidden);
//  System.out.println(works1[0]);
//  System.out.println(works1[1]);
//    System.out.println(works1[2]);
//  System.out.println(works1[3]);
//    System.out.println(works1[4]);
//  System.out.println(works1[5]);
//    System.out.println(works1[6]);
//  System.out.println(works1[7]);
//    System.out.println(works1[8]);
//  System.out.println(works1[9]);
//    System.out.println(works1[10]);
//  System.out.println(works1[11]);
//    System.out.println(works1[12]);
//  System.out.println(works1[13]);
//    System.out.println(works1[14]);
//  System.out.println(works1[15]);
  for(int w = 0; w < 24; w++)
  {
    if (works1[w] == hidden)
    {
      encoder = encode(4,w+1);
    }
    
    
  }
//
System.out.println(encoder[0]);
System.out.println(encoder[1]);
  System.out.println(encoder[2]);
System.out.println(encoder[3]);
//  System.out.println(coding[0]);
//System.out.println(coding[1]);
//  System.out.println(coding[2]);
//System.out.println(coding[3]);
  
  
  

for(int u = 0; u < 4;u++)
{
  finalHand[u] = coding1[encoder[u] - 1];
}
for(int v = 0; v < 4;v++)
{
  System.out.println(finalHand[v]);
}
   
  
 }
       public static void hiddenNum ()
       { 
       Scanner input = new Scanner(System.in);
         System.out.println("Give a hidden number");
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
      
      
       }
}