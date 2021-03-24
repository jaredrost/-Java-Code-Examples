//Jared Rostkowski
import java.util.*;
public class threeCard
{
  public static void printDoubleArray(DoubleArray a)
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
    int[] encoder = new int[2];
    int switcher = 0;
    int[] works1 = new int[2];
    int[] coding = new int[3];
    int[] coding1 = new int[3];
    
    int hidden = 0;
    int remainder;
    int remainder2 = 0;
    int q = 0;
    int z = 0;
      DoubleArray[] k = new DoubleArray[56];
      boolean[] works = new boolean[9];
     
    for(int i = 0; i < 56; i++)
    {
      k[i] = new DoubleArray();
      
    }
 for(int o = 0; o < 9; o++)
 {
   works[o] = false;
 }
  
   for (int j = 1; j < 7;j++)
   {
     for (int m = j+1; m < 8;m++)
     {
      for(int l = m + 1; l < 9;l++)
      {
       
        k[q].comb[0] = j;
        k[q].comb[1] = m;
        k[q].comb[2] = l;      
        q++;
      }
     }
   
  }

  for(int s = 0; s < 56; s++)
  {
     for(int o = 0; o < 9; o++)
 {
   works[o] = false;
 }

  remainder = (k[s].comb[0] + k[s].comb[1] + k[s].comb[2])%3;
 
hidden =  k[s].comb[remainder];

  if(remainder == 0)
  {
   coding[0] =  k[s].comb[1];
   coding[1] =  k[s].comb[2];
  }
   if(remainder == 1)
  {
   coding[0] = k[s].comb[0];
   coding[1] = k[s].comb[2];
  }
    if(remainder == 2)
  {
    coding[0] = k[s].comb[0];
    coding[1] = k[s].comb[1];
  }
//    System.out.print(coding[0]);
//     System.out.print(coding[1]);
//      System.out.println();
  
    
   int n;
  for(n = 1; n < 9; n++)
  {
    if( n != coding[0] && n != coding[1])
    {
    coding1[0] = coding[0];  
    coding1[1] = coding[1];  
    coding1[2]= n;
   
    


 remainder2 = (coding1[0] + coding1[1] + coding1[2])%3;
 

   
    
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
    }
  }

                         
  
  int holder = 0;
  for(int p = 1; p < 9;p++)
  {
  
    if( works[p])
    {
      works1[holder] = p;
      holder++;
    
    }
  }
  int result;
//  System.out.println(hidden);
//  System.out.println(works1[0]);
//  System.out.println(works1[1]);
if(works1[0] == hidden)
{
  
 encoder = encode(2,1);
}
if(works1[1] == hidden)
{
  

  encoder = encode(2,2);
  
     
}
//System.out.println(encoder[0]);
//System.out.println(encoder[1]);
for(int u = 0; u < 2;u++)
{
  k[s].code[u] = coding1[encoder[u] - 1];
}

printDoubleArray(k[s]);   

 
     
      
      
     
    
      
    
    

   
  
 }
  }
}