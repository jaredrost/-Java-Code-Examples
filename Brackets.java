//Jared Rostkowski, Bryan Boyle, Jared Rostkowski
import java.util.*;
public class Brackets 
{
  private static Stack <Character> stk= new Stack<Character>(110); 
    
public static boolean isBalanced(String s)
{
  
  for(int i = 0; i < s.length();i++)
  {
    char ch = s.charAt(i);
    if(ch== '(' ||  ch =='[' || ch == '{')
      stk.push (ch);
    else if(ch== ')' || ch == ']' || ch == '}')
    {
      if( stk.empty())
        return false;
      char x = stk.peek();
      if (ch == ')' && x != '(')
        return false;
     else if (ch == '}' && x != '{')
        return false;
     else if (ch == ']' && x != '[')
        return false;
     else
       stk.pop();
    }
  }
  if(stk.empty())
    return true;
  else
    return false;
    
}

public static void main(String[] args)
    { 
         Scanner input = new Scanner(System.in);
         System.out.print("Enter an experssion: ");
         String s = input.nextLine();
         while(!s.equals("xxx"))
        {
                 if (isBalanced(s))
                   System.out.println("Balanced");
                 else
                     System.out.println(" Not Balanced");
                 System.out.print("Enter an experssion: ");
                 s = input.nextLine();
        }
}
}

    
      
    
  
      
  
