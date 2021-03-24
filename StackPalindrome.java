//Jared Rostkowski, Bryan Boyle, Patrick Doherty
import java.util.*;
public class StackPalindrome
{
   private static Stack<Character> stack = new Stack<Character>(10);

  
   public static boolean isPalindrome(String s)
   {
     String t = "";
     String e = "";
     
     for(int i = 0; i<s.length(); i++)
     {
       char ch = (s.charAt(i));
        if(ch >= 'a' && ch <= 'z')
         t = t + ch;
        stack.push(t.charAt(i));
     }
     while(!stack.empty())
     {
     e = e + stack.pop();
     }
     if(s.equals(e))
       return true;
     else
       return false; 

   }
   public static void main(String[] args)
   {
     String s = "";
     Scanner input = new Scanner(System.in);
     System.out.println("Enter a word, to end type in xxx");
    
     while(!s.equals("xxx"))
      {
        s = input.next();
       if(isPalindrome(s) == true)
         System.out.println("It is a palindrome");
       else
         System.out.println("it is not a palindrome");
     }
           }
}
           
       
             
      
       