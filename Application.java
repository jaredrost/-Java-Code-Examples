//Jared Rostkowski
import java.util.*;
public class Application
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
      String type;
    do
    {
    System.out.println("Enter D to use a dice, Enter S to spin a spinner, Enter C to draw a candy card");
    type = input.next();
    type = type.toUpperCase();
    }
    while(!(type.equals("D") || type.equals("S") || type.equals("C")));
    
    if(type.equals("D"))
      {
      int choice = 0;
      while(choice !=6 && choice !=8 && choice !=12 && choice !=20)
      {
      System.out.println("Do you want a 6, 8, 12, or 20 sided dice?");
      choice = input.nextInt();
      }
   
      Die d = new Die(choice);
      d.display();
      System.out.println("The Value is " + d.getValue());
    }
      else if(type.equals("S"))
     {  
        int choice1 = 0;
        while(choice1 !=4 && choice1 !=7 && choice1 !=9)
        {
      System.out.println("Do you want a 4, 7, or 9 slots?");
      choice1 = input.nextInt();
        }
      Spinner s = new Spinner(choice1);
      s.display();
      System.out.println("The Value is " + s.getValue());
      }
    else 
    {            
      CandyCard c = new CandyCard();
      c.display();
      int color = c.getValue();
      if(color == 1)
        System.out.print("Blue");
        else if(color == 2)
        System.out.print("Green");
        else if(color == 3)
        System.out.print("Yellow");
        else if(color == 4)
        System.out.print("Brown");
        else
        System.out.print("Pink");
      
      
      
      
      
    }
              
              }
}
      
              
              
        
            
      
    
  
