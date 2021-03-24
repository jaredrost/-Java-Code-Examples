public class ConnectFourBoard 
{ 
  public char[][] board=new char[6][7]; 
  public int turn; 
  int[][] Evaluation = new int[][]{{3,4,5,7,5,4,3}, 
                                     {4,6,8,10,8,6,4}, 
                                     {5,8,11,13,11,8,5}, 
                                     {5,8,11,13,11,8,5}, 
                                     {4,6,8,10,8,6,4}, 
                                     {3,4,5,7,5,4,3}}; 
   
  public ConnectFourBoard() 
  { 
    for(int i=0;i<6;i++) 
      for(int j=0;j<7;j++) 
      board[i][j]='e'; 
     
    turn=0; 
  } 
  ConnectFourBoard(char[][] n, int player) 
  { 
    board = n; 
    turn = player; 
  } 
  ConnectFourBoard(ConnectFourBoard b) 
  { 
    this.board = b.board; 
    this.turn = b.turn; 
  } 
  boolean done() 
  { 
    if(winner()) 
      return true; 
     
    if(loser()) 
      return true; 
     
    if(tie()) 
      return true; 
     
    return false; 
  } 
  void play(ConnectFourMove tryIt) 
  { 
    if(turn==0) 
    { 
      if(board[5][tryIt.getMove()]=='e') 
        board[5][tryIt.getMove()]='b'; 
       
     else if(board[4][tryIt.getMove()]=='e') 
        board[4][tryIt.getMove()]='b'; 
       
     else if(board[3][tryIt.getMove()]=='e') 
        board[3][tryIt.getMove()]='b'; 
       
     else if(board[2][tryIt.getMove()]=='e') 
        board[2][tryIt.getMove()]='b'; 
       
     else if(board[1][tryIt.getMove()]=='e') 
        board[1][tryIt.getMove()]='b'; 
       
     else if(board[0][tryIt.getMove()]=='e') 
        board[0][tryIt.getMove()]='b'; 
      else 
      { 
      } 
      
    } 
    else 
    { 
      if(board[5][tryIt.getMove()]=='e') 
        board[5][tryIt.getMove()]='r'; 
       
     else if(board[4][tryIt.getMove()]=='e') 
        board[4][tryIt.getMove()]='r'; 
       
      else if(board[3][tryIt.getMove()]=='e') 
        board[3][tryIt.getMove()]='r'; 
       
     else if(board[2][tryIt.getMove()]=='e') 
        board[2][tryIt.getMove()]='r'; 
       
     else if(board[1][tryIt.getMove()]=='e') 
        board[1][tryIt.getMove()]='r'; 
       
     else if(board[0][tryIt.getMove()]=='e') 
        board[0][tryIt.getMove()]='r'; 
       
     
    else 
    { 
    } 
     
    } 
       
  } 
  public void printBoard() 
  { 
    for(int i=0;i<6;i++) 
    { 
      for(int j=0;j<7;j++) 
      { 
        System.out.print( board[i][j] + " "); 
      } 
      System.out.println(); 
    } 
  } 
  int evaluate() 
  { 
    if(winner()) 
      if(turn==1) 
      return 10000; 
       
    if(loser()) 
      if(turn==0) 
      return -10000; 
     
     
    int value=0; 
    
      for(int i=0;i<6;i++) 
      { 
        for(int j=0;j<7;j++) 
        { 
          if(board[i][j]=='b') 
            value= value + Evaluation[i][j]; 
           
           if(board[i][j]=='r') 
            value= value - Evaluation[i][j]; 
           
        } 
      } 
      
    return value; 
             
  } 
  void setTurn() 
  { 
    turn = (turn+1)%2; 
  } 
  public boolean checkColumn(int column) 
  { 
    if(board[0][column]=='e') 
      return true; 
    return false; 
  } 
  public void legalMoves(Stack<ConnectFourMove> moves) 
  { 
   for(int i=0;i<7;i++) 
     if(checkColumn(i)) 
   { 
     ConnectFourMove move = new ConnectFourMove(i); 
     moves.push(move); 
   } 
      
  } 
  int worstCase() 
  { 
    if(turn==1) 
      return 10000; 
    return -10000; 
  } 
  public void setBoard(char[][] n) 
  { 
   board=n; 
  } 
  public int getTurn() 
  { 
    return turn; 
  } 
  boolean better(int value, int oldValue) 
  { 
    if(turn==1) 
      return (value<=oldValue); 
    return (value>=oldValue); 
  } 
  public boolean winner() 
  { 
    if(turn==1) 
    { 
      
   for(int i=0;i<=2;i++) 
     for(int j=0;j<7;j++) 
     if(board[i][j]=='r' && board[i+1][j]=='r' && board[i+2][j]=='r' && board[i+3][j]=='r') 
     return true; 
    
   
    
   for(int a=0;a<6;a++) 
     for(int b=0;b<=3;b++) 
     if(board[a][b]=='r' && board[a][b+1]=='r' && board[a][b+2]=='r' && board[a][b+3]=='r') 
     return true; 
    
  
    
   if(board[2][0]=='r' && board[3][1]=='r' && board[4][2]=='r' && board[5][3]=='r') 
        return true; 
    
   if(board[1][0]=='r' && board[2][1]=='r' && board[3][2]=='r' && board[4][3]=='r') 
        return true; 
    
   if(board[2][1]=='r' && board[3][2]=='r' && board[4][3]=='r' && board[5][4]=='r') 
        return true; 
    
   if(board[0][0]=='r' && board[1][1]=='r' && board[2][2]=='r' && board[3][3]=='r') 
        return true; 
    
   if(board[1][1]=='r' && board[2][2]=='r' && board[3][3]=='r' && board[4][4]=='r') 
        return true; 
    
   if(board[2][2]=='r' && board[3][3]=='r' && board[4][4]=='r' && board[5][5]=='r') 
        return true; 
    
   if(board[0][1]=='r' && board[1][2]=='r' && board[2][3]=='r' && board[3][4]=='r') 
        return true; 
    
   if(board[1][2]=='r' && board[2][3]=='r' && board[3][4]=='r' && board[4][5]=='r') 
        return true; 
    
   if(board[2][3]=='r' && board[3][4]=='r' && board[4][5]=='r' && board[5][6]=='r') 
        return true; 
    
   if(board[0][2]=='r' && board[1][3]=='r' && board[2][4]=='r' && board[3][5]=='r') 
        return true; 
    
   if(board[1][3]=='r' && board[2][4]=='r' && board[3][5]=='r' && board[4][6]=='r') 
        return true; 
    
   if(board[0][3]=='r' && board[1][4]=='r' && board[2][5]=='r' && board[3][6]=='r') 
        return true; 
     
       
   if(board[0][3]=='r' && board[1][2]=='r' && board[2][1]=='r' && board[3][0]=='r') 
     return true; 
    
   if(board[0][4]=='r' && board[1][3]=='r' && board[2][2]=='r' && board[3][1]=='r') 
     return true; 
    
   if(board[1][3]=='r' && board[2][2]=='r' && board[3][1]=='r' && board[4][0]=='r') 
     return true; 
      
   if(board[0][5]=='r' && board[1][4]=='r' && board[2][3]=='r' && board[3][2]=='r') 
     return true; 
    
   if(board[1][4]=='r' && board[2][3]=='r' && board[3][2]=='r' && board[4][1]=='r') 
     return true; 
    
   if(board[2][3]=='r' && board[3][2]=='r' && board[4][1]=='r' && board[5][0]=='r') 
     return true; 
    
   if(board[0][6]=='r' && board[1][5]=='r' && board[2][4]=='r' && board[3][3]=='r') 
     return true; 
    
   if(board[1][5]=='r' && board[2][4]=='r' && board[3][3]=='r' && board[4][2]=='r') 
     return true; 
    
   if(board[2][4]=='r' && board[3][3]=='r' && board[4][2]=='r' && board[5][1]=='r') 
     return true; 
    
   if(board[1][6]=='r' && board[2][5]=='r' && board[3][4]=='r' && board[4][3]=='r') 
     return true; 
    
   if(board[2][5]=='r' && board[3][4]=='r' && board[4][3]=='r' && board[5][2]=='r') 
     return true; 
    
   if(board[2][6]=='r' && board[3][5]=='r' && board[4][5]=='r' && board[5][4]=='r') 
     return true; 
    
   return false; 
    } 

    else 
    { 
      
   for(int i=0;i<=2;i++) 
     for(int j=0;j<7;j++) 
     if(board[i][j]=='b' && board[i+1][j]=='b' && board[i+2][j]=='b' && board[i+3][j]=='b') 
     return true; 
    
   
    
   for(int a=0;a<6;a++) 
     for(int b=0;b<=3;b++) 
     if(board[a][b]=='b' && board[a][b+1]=='b' && board[a][b+2]=='b' && board[a][b+3]=='b') 
     return true; 
    
   
    
   if(board[2][0]=='b' && board[3][1]=='b' && board[4][2]=='b' && board[5][3]=='b') 
        return true; 
    
   if(board[1][0]=='b' && board[2][1]=='b' && board[3][2]=='b' && board[4][3]=='b') 
        return true; 
    
   if(board[2][1]=='b' && board[3][2]=='b' && board[4][3]=='b' && board[5][4]=='b') 
        return true; 
    
   if(board[0][0]=='b' && board[1][1]=='b' && board[2][2]=='b' && board[3][3]=='b') 
        return true; 
    
   if(board[1][1]=='b' && board[2][2]=='b' && board[3][3]=='b' && board[4][4]=='b') 
        return true; 
    
   if(board[2][2]=='b' && board[3][3]=='b' && board[4][4]=='b' && board[5][5]=='b') 
        return true; 
    
   if(board[0][1]=='b' && board[1][2]=='b' && board[2][3]=='b' && board[3][4]=='b') 
        return true; 
    
   if(board[1][2]=='b' && board[2][3]=='b' && board[3][4]=='b' && board[4][5]=='b') 
        return true; 
    
   if(board[2][3]=='b' && board[3][4]=='b' && board[4][5]=='b' && board[5][6]=='b') 
        return true; 
    
   if(board[0][2]=='b' && board[1][3]=='b' && board[2][4]=='b' && board[3][5]=='b') 
        return true; 
    
   if(board[1][3]=='b' && board[2][4]=='b' && board[3][5]=='b' && board[4][6]=='b') 
        return true; 
    
   if(board[0][3]=='b' && board[1][4]=='b' && board[2][5]=='b' && board[3][6]=='b') 
        return true; 
     
       
   if(board[0][3]=='b' && board[1][2]=='b' && board[2][1]=='b' && board[3][0]=='b') 
     return true; 
    
   if(board[0][4]=='b' && board[1][3]=='b' && board[2][2]=='b' && board[3][1]=='b') 
     return true; 
    
   if(board[1][3]=='b' && board[2][2]=='b' && board[3][1]=='b' && board[4][0]=='b') 
     return true; 
      
   if(board[0][5]=='b' && board[1][4]=='b' && board[2][3]=='b' && board[3][2]=='b') 
     return true; 
    
   if(board[1][4]=='b' && board[2][3]=='b' && board[3][2]=='b' && board[4][1]=='b') 
     return true; 
    
   if(board[2][3]=='b' && board[3][2]=='b' && board[4][1]=='b' && board[5][0]=='b') 
     return true; 
    
   if(board[0][6]=='b' && board[1][5]=='b' && board[2][4]=='b' && board[3][3]=='b') 
     return true; 
    
   if(board[1][5]=='b' && board[2][4]=='b' && board[3][3]=='b' && board[4][2]=='b') 
     return true; 
    
   if(board[2][4]=='b' && board[3][3]=='b' && board[4][2]=='b' && board[5][1]=='b') 
     return true; 
    
   if(board[1][6]=='b' && board[2][5]=='b' && board[3][4]=='b' && board[4][3]=='b') 
     return true; 
    
   if(board[2][5]=='b' && board[3][4]=='b' && board[4][3]=='b' && board[5][2]=='b') 
     return true; 
    
   if(board[2][6]=='b' && board[3][5]=='b' && board[4][5]=='b' && board[5][4]=='b') 
     return true; 
    
   return false; 
    } 
         
           
    
  } 
  public boolean loser() 
  { 
     if(turn==1) 
   { 
    
   for(int i=0;i<=2;i++) 
     for(int j=0;j<7;j++) 
     if(board[i][j]=='b' && board[i+1][j]=='b' && board[i+2][j]=='b' && board[i+3][j]=='b') 
     return true; 
    

    
   for(int a=0;a<6;a++) 
     for(int b=0;b<=3;b++) 
     if(board[a][b]=='b' && board[a][b+1]=='b' && board[a][b+2]=='b' && board[a][b+3]=='b') 
     return true; 
    
   if(board[2][0]=='b' && board[3][1]=='b' && board[4][2]=='b' && board[5][3]=='b') 
        return true; 
    
   if(board[1][0]=='b' && board[2][1]=='b' && board[3][2]=='b' && board[4][3]=='b') 
        return true; 
    
   if(board[2][1]=='b' && board[3][2]=='b' && board[4][3]=='b' && board[5][4]=='b') 
        return true; 
    
   if(board[0][0]=='b' && board[1][1]=='b' && board[2][2]=='b' && board[3][3]=='b') 
        return true; 
    
   if(board[1][1]=='b' && board[2][2]=='b' && board[3][3]=='b' && board[4][4]=='b') 
        return true; 
    
   if(board[2][2]=='b' && board[3][3]=='b' && board[4][4]=='b' && board[5][5]=='b') 
        return true; 
    
   if(board[0][1]=='b' && board[1][2]=='b' && board[2][3]=='b' && board[3][4]=='b') 
        return true; 
    
   if(board[1][2]=='b' && board[2][3]=='b' && board[3][4]=='b' && board[4][5]=='b') 
        return true; 
    
   if(board[2][3]=='b' && board[3][4]=='b' && board[4][5]=='b' && board[5][6]=='b') 
        return true; 
    
   if(board[0][2]=='b' && board[1][3]=='b' && board[2][4]=='b' && board[3][5]=='b') 
        return true; 
    
   if(board[1][3]=='b' && board[2][4]=='b' && board[3][5]=='b' && board[4][6]=='b') 
        return true; 
    
   if(board[0][3]=='b' && board[1][4]=='b' && board[2][5]=='b' && board[3][6]=='b') 
        return true; 
     

       
   if(board[0][3]=='b' && board[1][2]=='b' && board[2][1]=='b' && board[3][0]=='b') 
     return true; 
    
   if(board[0][4]=='b' && board[1][3]=='b' && board[2][2]=='b' && board[3][1]=='b') 
     return true; 
    
   if(board[1][3]=='b' && board[2][2]=='b' && board[3][1]=='b' && board[4][0]=='b') 
     return true; 
      
   if(board[0][5]=='b' && board[1][4]=='b' && board[2][3]=='b' && board[3][2]=='b') 
     return true; 
    
   if(board[1][4]=='b' && board[2][3]=='b' && board[3][2]=='b' && board[4][1]=='b') 
     return true; 
    
   if(board[2][3]=='b' && board[3][2]=='b' && board[4][1]=='b' && board[5][0]=='b') 
     return true; 
    
   if(board[0][6]=='b' && board[1][5]=='b' && board[2][4]=='b' && board[3][3]=='b') 
     return true; 
    
   if(board[1][5]=='b' && board[2][4]=='b' && board[3][3]=='b' && board[4][2]=='b') 
     return true; 
    
   if(board[2][4]=='b' && board[3][3]=='b' && board[4][2]=='b' && board[5][1]=='b') 
     return true; 
    
   if(board[1][6]=='b' && board[2][5]=='b' && board[3][4]=='b' && board[4][3]=='b') 
     return true; 
    
   if(board[2][5]=='b' && board[3][4]=='b' && board[4][3]=='b' && board[5][2]=='b') 
     return true; 
    
   if(board[2][6]=='b' && board[3][5]=='b' && board[4][5]=='b' && board[5][4]=='b') 
     return true; 
    
   return false; 
    } 
   else 
   { 
      for(int i=0;i<=2;i++) 
     for(int j=0;j<7;j++) 
     if(board[i][j]=='r' && board[i+1][j]=='r' && board[i+2][j]=='r' && board[i+3][j]=='r') 
     return true; 
    
  
    
   for(int a=0;a<6;a++) 
     for(int b=0;b<=3;b++) 
     if(board[a][b]=='r' && board[a][b+1]=='r' && board[a][b+2]=='r' && board[a][b+3]=='r') 
     return true; 
    
  
    
   if(board[2][0]=='r' && board[3][1]=='r' && board[4][2]=='r' && board[5][3]=='r') 
        return true; 
    
   if(board[1][0]=='r' && board[2][1]=='r' && board[3][2]=='r' && board[4][3]=='r') 
        return true; 
    
   if(board[2][1]=='r' && board[3][2]=='r' && board[4][3]=='r' && board[5][4]=='r') 
        return true; 
    
   if(board[0][0]=='r' && board[1][1]=='r' && board[2][2]=='r' && board[3][3]=='r') 
        return true; 
    
   if(board[1][1]=='r' && board[2][2]=='r' && board[3][3]=='r' && board[4][4]=='r') 
        return true; 
    
   if(board[2][2]=='r' && board[3][3]=='r' && board[4][4]=='r' && board[5][5]=='r') 
        return true; 
    
   if(board[0][1]=='r' && board[1][2]=='r' && board[2][3]=='r' && board[3][4]=='r') 
        return true; 
    
   if(board[1][2]=='r' && board[2][3]=='r' && board[3][4]=='r' && board[4][5]=='r') 
        return true; 
    
   if(board[2][3]=='r' && board[3][4]=='r' && board[4][5]=='r' && board[5][6]=='r') 
        return true; 
    
   if(board[0][2]=='r' && board[1][3]=='r' && board[2][4]=='r' && board[3][5]=='r') 
        return true; 
    
   if(board[1][3]=='r' && board[2][4]=='r' && board[3][5]=='r' && board[4][6]=='r') 
        return true; 
    
   if(board[0][3]=='r' && board[1][4]=='r' && board[2][5]=='r' && board[3][6]=='r') 
        return true; 
     
       
   if(board[0][3]=='r' && board[1][2]=='r' && board[2][1]=='r' && board[3][0]=='r') 
     return true; 
    
   if(board[0][4]=='r' && board[1][3]=='r' && board[2][2]=='r' && board[3][1]=='r') 
     return true; 
    
   if(board[1][3]=='r' && board[2][2]=='r' && board[3][1]=='r' && board[4][0]=='r') 
     return true; 
      
   if(board[0][5]=='r' && board[1][4]=='r' && board[2][3]=='r' && board[3][2]=='r') 
     return true; 
    
   if(board[1][4]=='r' && board[2][3]=='r' && board[3][2]=='r' && board[4][1]=='r') 
     return true; 
    
   if(board[2][3]=='r' && board[3][2]=='r' && board[4][1]=='r' && board[5][0]=='r') 
     return true; 
    
   if(board[0][6]=='r' && board[1][5]=='r' && board[2][4]=='r' && board[3][3]=='r') 
     return true; 
    
   if(board[1][5]=='r' && board[2][4]=='r' && board[3][3]=='r' && board[4][2]=='r') 
     return true; 
    
   if(board[2][4]=='r' && board[3][3]=='r' && board[4][2]=='r' && board[5][1]=='r') 
     return true; 
    
   if(board[1][6]=='r' && board[2][5]=='r' && board[3][4]=='r' && board[4][3]=='r') 
     return true; 
    
   if(board[2][5]=='r' && board[3][4]=='r' && board[4][3]=='r' && board[5][2]=='r') 
     return true; 
    
   if(board[2][6]=='r' && board[3][5]=='r' && board[4][5]=='r' && board[5][4]=='r') 
     return true; 
    
   return false; 
    } 
      
  } 
  public boolean tie() 
  { 
    int count2=0; 
    for(int i=0;i<6;i++) 
      for(int j=0;j<7;j++) 
      if(board[i][j]!='e') 
      count2++; 
     
    if(count2==42) 
      return true; 
     
    return false; 
  } 
  public static void main(String[] args) 
  { 
    ConnectFourBoard game = new ConnectFourBoard(); 
    game.setTurn(); 
    ConnectFourMove first = new ConnectFourMove(0); 
     
    game.play(first); 
     
    System.out.println("The game evaluates to " + game.evaluate()); 
     
    game.setTurn(); 
     
    ConnectFourMove second = new ConnectFourMove(6); 
     
    game.play(second); 
     
    System.out.println("The game evaluates to " + game.evaluate()); 
    game.setTurn(); 
    first.setMove2(1); 
    game.play(first); 
    first.setMove2(2); 
    game.play(first); 
    first.setMove2(3); 
    game.play(first); 
     
    System.out.println("The game evaluates to " + game.evaluate()); 
     
    game.printBoard(); 
  }  
}