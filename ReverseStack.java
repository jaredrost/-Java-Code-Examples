//Jared Rostkowski, Bryan Boyle, Patrick Doherty
import java.util.*;
public class ReverseStack
{
  private static Stack<Integer> stack = new Stack<Integer>(10);
  private static Stack<Integer> a = new Stack<Integer>(10);
  private static Stack<Integer> b = new Stack<Integer>(10);
  
  public static void reverseStack(Stack<Integer> s)
  {
   while(!s.empty())
   {
     a.push(s.pop());
   }
   while(!a.empty())
   {
     b.push(a.pop());
   }
   while(!b.empty())
   {
     s.push(b.pop());
   }
      
       
 
    
  }
      public static void main(String[] args) 
      { 
        Stack<Integer> s = new Stack<Integer>(); 
        for (int i = 1; i < 10; i++) s.push(i); 
        reverseStack (s); 
        while(!s.empty()) 
          System.out.println(s.pop()); 
      }
  }