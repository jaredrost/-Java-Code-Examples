//Jared Rostkowski
import java.util.*;
public class Games
{
  private int numPiles;
  private int[] piles;
  
  public Games()
  {
    numPiles = 3;
    piles = new int[3];
    for(int i = 0; i < 3; i++)
    {
      piles[i] = 10;
    }
  }
  public Games(int num, int[]sticks)
  {
   numPiles = num;
   
    piles = sticks;
     
  }
  public void remove(int pile,int numSticks)
  {
    if(piles[pile] <= 0 || piles[pile] - numSticks < 0)
      System.out.println("There's not enough sticks to do that!");
    else 
     piles[pile] = piles[pile] - numSticks;
    
  }
  public boolean gameOver()
  {
    boolean zero = true;
    for(int i = 0; i < numPiles; i++)
    {
      if(piles[i] > 0)
        zero = false;
    }
    if(zero == false)
      return false;
    else
      System.out.println("Game Over");
      return true;
  }
  public void printPiles()
  {
    for(int i = 0; i< numPiles; i++)
     System.out.println("Pile" +i+": " + piles[i] + " sticks");
   
  }
}
    
  
  
    
    
      
  
    
    
  
    
    