//Jared Rostkowski
import java.util.*;
public class Arithmetic
{
  public static int add(int a, int b)
  {
   
    try
    {
      if(a > 0 && b > 0 && (a+b) < 0)
      {
        UnderflowException e = new UnderflowException("Underflow Exception, Number too large");
        throw e;
      }
     else if(a < 0 && b < 0 && (a+b) > 0)
     {
        OverflowException q = new OverflowException("Overflow Exception, Number too small");
        throw q;
     }
     else
       return (a+b);
    }
    catch(UnderflowException e)
    {
      System.out.println(e.getMessage());
    }
    catch(OverflowException q)
    {
      System.out.println(q.getMessage());
    }
    return (a+b);
  }
}
          
  
  
  