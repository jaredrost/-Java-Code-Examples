//Jared Rostkowski, Bryan Boyle, Zander Montano
import java.util.*;
public class RSATEncoding
{
  public RSATEncoding()
  {
  
  }


  public static int encode(int number, int exponent,int prime2)
  {
    if(exponent == 0)
    {
      return 1;
    }
 if(exponent%2 == 0)
 {
   int temp = encode(number,exponent/2,prime2);
   return (temp*temp)% prime2;
 
 }
 else
 {
   return (number*encode(number,exponent-1,prime2))%prime2;
          
     
     
  }
  }
  
  public static  void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number to encode");
    int num = input.nextInt();
    System.out.println("Enter a prime exponent");
    int prime1 = input.nextInt();
     System.out.println("Enter a modulus");
    int prime2 = input.nextInt();

    System.out.println(" Your encoded number is: " + encode(num,prime1,prime2));
    
  }
}
    
    
      
  
   
  
