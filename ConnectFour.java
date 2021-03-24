import java.util.*; 
import java.awt.*; 
public class ConnectFour
{ 
  char[][] pieces=new char[6][7]; 
  boolean done; 
  int turn; 
  ConnectFourBoard game; 
  Scanner input; 
  public ConnectFour(int n) 
  { 
    turn=1; 
    done=false; 
    input = new Scanner(System.in); 
     
    for(int i=0;i<6;i++) 
    { 
      for(int j=0;j<7;j++) 
      { 
        pieces[i][j]='e'; 
      } 
    } 
     
    printBoard(); 
     

     
   placeChecker(n); 
        
     
    game = new ConnectFourBoard(pieces,0); 
   
  } 
 public void printBoard() 
 { 
   for(int i=0;i<6;i++) 
   { 
     for(int j=0;j<7;j++) 
     { 
       System.out.print(pieces[i][j] + " "); 
     } 
     System.out.println(); 
   } 
 } 
 public Point placeChecker(int column) 
 { 
   Point point = new Point(); 
   if(turn==1) 
   { 
   if(pieces[5][column]=='e') 
   { 
     pieces[5][column]='r'; 
     point.x=5; 
     point.y=column; 
     return point; 
   } 
    
   else if(pieces[4][column]=='e') 
   { 
     pieces[4][column]='r'; 
     point.x=4; 
     point.y=column; 
     return point; 
   } 
    
   else if(pieces[3][column]=='e') 
   { 
     pieces[3][column]='r'; 
     point.x=3; 
     point.y=column; 
     return point; 
   } 
    
   else if(pieces[2][column]=='e') 
   { 
     pieces[2][column]='r'; 
     point.x=2; 
     point.y=column; 
     return point; 
   } 
    
   else if(pieces[1][column]=='e') 
   { 
     pieces[1][column]='r'; 
     point.x=1; 
     point.y=column; 
     return point; 
   } 
    
   else if(pieces[0][column]=='e') 
   { 
     pieces[0][column]='r'; 
     point.x=0; 
     point.y=column; 
     return point; 
   } 
    
   else 
   { 
     return point; 
   } 
   } 
   else 
   { 
    
     if(pieces[5][column]=='e') 
     { 
     pieces[5][column]='b'; 
     point.x=5; 
     point.y=column; 
     return point; 
     } 
         
   else if(pieces[4][column]=='e') 
   { 
     pieces[4][column]='b'; 
     point.x=4; 
     point.y=column; 
     return point; 
   } 
    
  else if(pieces[3][column]=='e') 
  { 
     pieces[3][column]='b'; 
     point.x=3; 
     point.y=column; 
     return point; 
  } 
    
   else if(pieces[2][column]=='e') 
   { 
     pieces[2][column]='b'; 
     point.x=2; 
     point.y=column; 
     return point; 
   } 
    
   else if(pieces[1][column]=='e') 
   { 
     pieces[1][column]='b'; 
     point.x=1; 
     point.y=column; 
     return point; 
   } 
    
  else if(pieces[0][column]=='e') 
  { 
     pieces[0][column]='b'; 
     point.x=0; 
     point.y=column; 
     return point; 
  } 
   
  else 
  { 
    return point; 
  } 
   } 
             
 }        
    
  public void playGame() 
  { 
    while(!done) 
    { 
      ConnectFourMove recommended = new ConnectFourMove(); 
      int value = MiniMax.lookAhead(game,5,recommended); 
      System.out.println("Computer  places a checker in" + recommended.getMove()); 
      changeTurn(); 
      placeChecker(recommended.getMove()); 
       
      printBoard(); 
       
      for(int a =0;a<6;a++) 
      { 
        for(int b=0;b<7;b++) 
        { 
          game.board[a][b]=pieces[a][b]; 
        } 
      } 
       
      if(game.done()) 
      { 
        done=true; 
         
        if(game.winner()) 
        System.out.println("Computer wins, Player loses"); 
         
        else if(game.loser()) 
          System.out.println("Player wins, Computer loses"); 
         
        else 
          System.out.println("Tie"); 
      } 
       
         
      else 
      { 
        changeTurn(); 
        int choice; 
         do 
         { 
           System.out.println("Which column would you like to place a checker in?(0-6)"); 
             choice = input.nextInt(); 
         }while(choice<0|| choice>6 ||!(game.checkColumn(choice))); 
         
       placeChecker(choice); 
        
       printBoard(); 
        
      for(int x=0;x<6;x++) 
      { 
        for(int y=0;y<7;y++) 
        { 
          game.board[x][y]=pieces[x][y]; 
        } 
      } 
         
        if(game.done()) 
        { 
          done=true; 
           
          if(game.winner()) 
          System.out.println("Player wins, computer loses"); 
           
          else if(game.loser()) 
            System.out.println("computer wins, player loses"); 
           
          else 
          System.out.println("Tie"); 
        } 
      } 
       
    } 
     
  } 
  public void changeTurn() 
  { 
    turn = (turn+1)%2; 
  } 
  public static void main(String[] args) 
  { 
    Scanner input = new Scanner(System.in); 
    int choice=99; 
    
      System.out.println("Which column would you like to start with?"); 
       choice = input.nextInt(); 
     
    ConnectFour nim = new ConnectFour(choice); 
  } 
}