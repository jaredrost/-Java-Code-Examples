//Jared Rostkowski
import java.util.*;
public class SlotGame
{
 private Player player;
  {
   player = new Player();
 }
 public void Play()
 {
   int choice = 0;
   System.out.println("Bet 1,2, or 3 coins. Add money to bankroll, insert coins, then bet!");
   do
   {
    Scanner input = new Scanner(System.in);
    System.out.println("Choose one of the following");
    System.out.println("1: Bet One");
    System.out.println("2: Bet Max");
    System.out.println("3: Spin");
    System.out.println("4: Insert Coins");
    System.out.println("5: Deposit Coins");
    System.out.println("6: Add money to bankroll");
    System.out.println("7: Print BankRoll");
    System.out.println("8: Exit");
    choice = input.nextInt();
    
    if(choice == 1)
      player.pushBetOne();
    else if(choice == 2)
      player.pushBetMax();
    else if(choice == 3)
      player.pushSpin();
    else if(choice == 4)
      player.insertCoin();
    else if(choice == 5)
      player.pushCoinOut();
    else if(choice == 6)
      player.makeBankRoll();
    else if(choice == 7)
      player.printBankRoll();
    else if(choice == 8)
      player.exitTheGame();
    else
      System.out.println("Invalid choice");
  }
   while(choice > 0 && choice < 8);
}
}
    
          
  
  
  
  
  