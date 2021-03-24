//Jared Rostkowski
import java.util.*;
public class Spinner implements Move
{
  public int spinner;
  
  public Spinner()
  {
    spinner = 4;
  }
  public Spinner(int s)
  {
    spinner = s;
  }
  public void display()
  {
    System.out.println("       1      ");
    System.out.println("       ^      ");
    System.out.println(" 2     |    9 ");
    System.out.println("       |      ");
    System.out.println("3      |      8");
    System.out.println();
    System.out.println(" 4          7 ");
    System.out.println();
    System.out.println("    5     6   ");
  }
  public int getValue()
  {
    int s = (int)(Math.random()*spinner + 1);
    return s;
  }
}
     