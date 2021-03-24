public class MiniMax
{ 
  public static int lookAhead(ConnectFourBoard game, int depth, ConnectFourMove recommended) 
  { 
    game.setTurn(); 
    if(game.done()|| depth==0) 
    { 
   
      return game.evaluate(); 
    } 
     
    else 
    { 
      Stack<ConnectFourMove> moves = new Stack<ConnectFourMove>(); 
      game.legalMoves(moves); 
      int value; 
      int bestValue = game.worstCase(); 
      while(!moves.empty()) 
      { 
        ConnectFourMove move = new ConnectFourMove(); 
        ConnectFourMove tryIt = moves.peek(); 
    
        ConnectFourBoard newGame = null; 
        newGame = new ConnectFourBoard(); 
       newGame.turn = game.turn; 
        
       for(int i=0;i<6;i++) 
       { 
         for(int j=0;j<7;j++) 
         { 
           newGame.board[i][j]=game.board[i][j]; 
         } 
       } 
        newGame.play(tryIt); 
         
 
        value=lookAhead(newGame,depth-1,move); 
        if(game.better(value,bestValue)) 
        { 
        
          bestValue=value; 
          recommended.setMove(tryIt); 
        } 
        
        moves.pop(); 
      } 
    
      return bestValue; 
    } 
  } 
}