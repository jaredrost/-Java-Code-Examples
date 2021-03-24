//Jared Rostkowski
import java.util.*;
public class PlayGame
{
  private String player1;
  private String player2;
  private int turn;
  private Games game;
  private Scanner input;
  
  PlayGame()
  {
    input = new Scanner(System.in);
    System.out.println("Player 1, what is your name?");
    player1 = input.nextLine();
    System.out.println("Player 2, what is your name?");
    player2 = input.nextLine();
    
    turn = 1;
    System.out.println("How many piles would you like to play with?");
    int numPiles = input.nextInt();
    System.out.println("How many sticks would you like in each pile?");
    int[] piles = new int[numPiles];
    for(int i = 0; i < numPiles; i++)
    {
      piles[i] = input.nextInt();
    }
    game = new Games(numPiles, piles);
  }
  public void play()
  {
  
    int sticks = 0;
    while(game.gameOver() == false)
    {
      if(turn == 1)
      {
        game.printPiles();
      System.out.println(player1 + ", Select the pile number you would like to remove the sticks from.");
      int pile = input.nextInt();
      System.out.println("Enter the number of sticks you would like to remove.");
      sticks = input.nextInt();
      game.remove(pile,sticks);
      turn++;
      }
      else
      {
          game.printPiles();
          System.out.println(player2 + ", Select the pile number you would like to remove the sticks from.");
          int pile = input.nextInt();
          System.out.println("Enter the number of sticks you would like to remove.");
          sticks = input.nextInt();
          game.remove(pile,sticks);
          turn--;
      }
    }
  }
}
        
      
      
      
    
      
      
      
        