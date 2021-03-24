//Jared Rostkowski, Bryan Boyle, Zander Montano
import java.util.*;
public class PrimeGCD
{
    
  public static void main(String[] args)
{
  System.out.println("Enter two numbers");
  Scanner input = new Scanner(System.in);
  int num1 = input.nextInt();
  int num2 = input.nextInt();
  long startTime = System.nanoTime();

  PrimeGCD p = new PrimeGCD();
  p.gcd(num1,num2);
  long endTime = System.nanoTime();
  long duration = (endTime - startTime);
  System.out.print("The time is " + duration + " nanoseconds");

  }
  public static void gcd(int num1,int num2)
  {
  
  int [] x = new int[100];
  int [] y = new int[100];
  int [] fin = new int[100];
  
  for(int i = 0; i < 100; i++)
  {
    x[i] = -1;
    y[i] = -1;
    fin[i] = -1;
  }
      
  
  if(num2 > num1)
  {
    int current = num1;
     int count = 0;
    for(int i = 2; i <= num1; i++)
    {
     
      
      
      { 
        while( current != 1 &&current % i == 0)
        {
          current = current/i;
          x[count] = i;
          count++;
          System.out.println(i);
          
        }
      }
    }
    System.out.println();
     int current2 = num2;
     int count2 = 0;
    for(int j = 2; j <= num2; j++)
    {
     
      
      
      { 
        while( current2 != 1 &&current2 % j == 0)
        {
          current2 = current2/j;
          y[count2] = j;
          count2++;
          System.out.println(j);
      
        }
      }
    }

}
   if(num1 > num2)
  {
    int current = num1;
     int count = 0;
    for(int i = 2; i <= num1; i++)
    {
     
      
      
      { 
        while( current != 1 &&current % i == 0)
        {
          current = current/i;
          x[count] = i;
          count++;
          System.out.println(i);
        
        }
      }
    }
    System.out.println();
     int current2 = num2;
     int count2 = 0;
    for(int j = 2; j <= num2; j++)
    {
     
      
      
      { 
        while( current2 != 1 &&current2 % j == 0)
        {
          current2 = current2/j;
          y[count2] = j;
          count2++;
          System.out.println(j);
          
        }
      }
    }
}
   int count3 = 0;
   int count4 = 0;
   int count6 = 0;
   while(x[count3] != -1 && y[count4] != -1)
   {
    
           
     
     
     
     if(x[count3] == y[count4] && count3 == count4)
     {
        
       fin[count6] = x[count3];
       count3++;
       count4++;
       count6++;
     }
       else if(x[count3] == y[count4] && count3 > count4)
     {
       
       fin[count6] = x[count3];
       count3++;
       count4++;
       count6++;
       
     }
       else if(x[count3] == y[count4] && count4 > count3)
     {
       
       fin[count6] = x[count3];
       count3++;
       count4++;
       count6++;
     }
     else if(x[count3] > y[count4])
     {
       count4++;
     }
     else if (x[count3] < y[count4])
     {
       count3++;
     }
   }
   System.out.println();
   int count5 = 0;
   int product = 1;
   
   while(fin[count5] != -1)
   {
     System.out.println(fin[count5]);
     product = product * fin[count5];
     count5++;
     
   }
       System.out.println("The GCD is " + product);    
     

   

   
     
    
    
                        
   
   
   
   
   
   
   
   
   
   
   
   
   
   
  }
}
          
  
    