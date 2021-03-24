public class ConnectFourMove 
{ 
   private int move; 
  public ConnectFourMove() 
  { 
    move=0; 
  } 
  public ConnectFourMove(int a) 
  { 
    move = a; 
  } 
  public void setMove(ConnectFourMove a) 
  { 
    this.move = a.move; 
  } 
  public void setMove2(int a) 
  { 
    move = a; 
  } 
  public int getMove() 
  { 
    return move; 
  } 
  public String toString() 
  { 
    return "" + move; 
  } 
}