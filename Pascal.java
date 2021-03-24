//Jared Rostkowski
import java.util.*;
public class Pascal
{
  public static int Pascal(int r, int e)
  {
    if(r == e || e == 0)
      return 1;
 
    else
      return Pascal(r-1,e-1) + Pascal(r-1,e);
    
  }
  public static void main (String[] args)
  {
    
    for(int i = 0; i < 8; i++)
   
    {
      
      for(int j = 0; j<=i;j++)
      
      {
        
        System.out.print(Pascal(i,j)+"      ");
      }
      System.out.println();
       System.out.println();
    }
    
  }
}

