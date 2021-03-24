//Jared Rostkowski, Bryan Boyle, Zander Montano
import java.util.*;

public class RSATDecoding
{
  public RSATDecoding()
  {
  }
  public static int decode(int number, int exponent, int prime2)
  {
    int p = 0;
    int q = 0;
    for(int i = 2; i < (prime2/2); i++)
    {
      if(prime2 %i == 0)
      {
      
        p = prime2/i;
        q = prime2/p;
        break;
      }
    }
    int pq = ((p-1)*(q-1));

    Program7 p7 =new Program7(); 
    Triple answer = p7.GCD(exponent,pq); 
    
    int d = answer.getY();
    
    if(d < 0)
    {
      d = d + pq;
    }
    
    RSATEncoding c = new RSATEncoding();
    int ans = c.encode(number,d,prime2);
     
    
    
    return ans;
    
    
   
          
    
    
  }
   public static  void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number to decode");
    int num = input.nextInt();
    System.out.println("Enter the first number of the public key");
    int prime1 = input.nextInt();
    System.out.println("Enter the second number of the public key");
    int prime2 = input.nextInt();

    System.out.println(" Your decoded number is: " + decode(num,prime1,prime2));
    
  }
}
    
    
  
  