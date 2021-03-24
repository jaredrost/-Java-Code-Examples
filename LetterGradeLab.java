//Jared Rostkowski, Bryan Boyle, Patrick Doherty
import java.util.*;
public class LetterGradeLab
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String num = "";
    boolean correct = false;
    while(!correct)
    {
    try
    {
      System.out.println("Enter a grade from 0-100");
      num = input.next();
      
      if(Integer.parseInt(num) > 100 || Integer.parseInt(num) < 0)
      {
        Exception e = new Exception("Number not in range");
        throw e;
      }
      int n = Integer.parseInt(num);
      
      if(n >= 90 && n <= 100)
      {
        System.out.println("The grade is an A");
        correct = true;
    
      }
      else if(n >= 80 && n <= 89)
      {
        System.out.println("The grade is a B");
        correct = true;
      }
        else if(n >= 70 && n <= 79)
      {
        System.out.println("The grade is a C");
        correct = true;
      }
         if(n >= 60 && n <= 69)
           
      {
        System.out.println("The grade is a D ");
        correct = true;
      }
          if(n <= 59)
      {
        System.out.println("The grade is a F");
        correct = true;
      }
    }
    catch(NumberFormatException e)
    {
      System.out.println("Error, Please re-enter");
    }
    catch(Exception e)
    {
      System.out.println(e.getMessage());
    }
  
  }
  }
}
      
      
      
    