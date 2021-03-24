//Jared Rostkowski
import java.util.*;
public class Die implements Move
{
  public int die;
  
  public Die()
  {
    die = 6;
  }
  public Die(int d)
  {
    die = d;
  }
  
    
  public void display()
  {
    System.out.println(" ________ ");
    System.out.println("| 0    0 |");
    System.out.println("| 0    0 |");
    System.out.println("| 0    0 |");
    System.out.println("|________|");
  }
  public int getValue()
  {
    int r = (int)(Math.random()*die + 1);
    return r;
  }
}