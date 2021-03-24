//Jared Rostkowski
import java.util.*;
public class CandyCard implements Move
{
  public int color;
  
  public CandyCard()
  {
    color = 1;
  }
  public CandyCard(int c)
  {
    color = c;
  }
  public void display()
  {
    System.out.println(" ________ ");
    System.out.println("|        |");
    System.out.println("|        |");
    System.out.println("| Color  |");
    System.out.println("|        |");
    System.out.println("|        |");
    System.out.println("|________|");
  }
  public int getValue()
  {
     int c = (int)(Math.random()*5 + 1);
     return c;
  }
}
     