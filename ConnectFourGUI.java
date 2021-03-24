import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
 
public class ConnectFourGUI extends JPanel 
{ 
  boolean done; 
  ConnectFour connectFour; 
  int turn; 
  int count=0; 
  ConnectFourBoard game;  
  JButton exit = new JButton("Exit"); 
  JButton reset = new JButton("Reset"); 
  JPanel buttonPanel = new JPanel(); 
  private char[][] display = new char[6][7]; 
  public ConnectFourGUI() 
  { 
    //game = new ConnectFourBoard(); 
    done=false; 
    buttonPanel.add(exit); 
    buttonPanel.add(reset); 
    add(buttonPanel,BorderLayout.NORTH); 
    addMouseListener(new MouseListen()); 
    addMouseMotionListener(new MouseMotion()); 
    exit.addActionListener( new ConnectFourButtonListener()); 
    reset.addActionListener(new ConnectFourButtonListener()); 
     
    for(int i=0;i<6;i++) 
      for(int j=0;j<7;j++) 
      display[i][j]='e'; 
  } 
  public void changeTurn() 
  { 
      turn = (turn+1)%2; 
  } 
    public void paintComponent(Graphics g) 
  { 
      int i=50; 
      int j=35; 
    super.paintComponent(g); 
    Color backgroundColor = new Color(0,102,0); 
    setBackground(backgroundColor);// set the background color to white 
     
    g.setColor(Color.YELLOW); // sets the color to yellow, so we can make the yellow slots  
       
    while(i<=650) 
    { 
      while(j<=535) 
      { 
        g.fillRect(i,j,100,100); // puts the yellow squares on the board, which will become the slots 
        j=j+100; 
      } 
      i=i+100; 
      j=35; 
    } 
    
 g.setColor(Color.BLACK); // sets the color to black so we can draw the black lines, separating the slots 
  
    i=50; //resets i so that the lines are in the right spots 
    j=35; //resets j so that the lines are in the right spots 
     
 while(i<=750) 
 { 
   g.drawLine(i,j,i,635); // puts the vertical lines on the graph to distinguish the squares 
   i=i+100; 
 } 
  
 i=50; // resets i so that the lines are in the right spots 
 j=35; // resets j so that the lines are in the right spots 
  
 while(j<=750) 
 { 
   g.drawLine(i,j,750,j); // puts the horizontal lines to distinguish the squares 
   j=j+100; 
 } 
  
// g.setColor(Color.WHITE); // sets the color to white, so we can add the circles that will look like empty slots 
  
  i=40; 
 j=55; 
  int count=0; 
  int count2=0; 
 
   while(count<6) 
    { 
      while(count2<7) 
      { 
        if(display[count][count2]=='e') 
        { 
          g.setColor(Color.WHITE); 
        } 
        if(display[count][count2]=='r') 
        { 
          g.setColor(Color.RED); 
        } 
        if(display[count][count2]=='b') 
        { 
          g.setColor(Color.BLACK); 
        } 
        g.fillOval(j,i,93,93); // puts the white circles on the board which look like the empty slots on the board 
        g.setColor(Color.BLACK); // sets the color to black so we can outline the empty slots 
        g.drawOval(j,i,93,93); // draws an empty black circle around the already existing white circles 
       // g.setColor(Color.WHITE); // sets the color back to white to draw the rest of the empty slots 
         j=j+100;                 // adjusts the position of j so the circles are all in the right spots 
        count2++; 
        
         
      } 
       i=i+100;                   // adjusts i so the circles are in the right spots 
      j=55;                      // adjusts j so the circles are in the right spots 
      count++; 
      count2=0; 
      
   } 
    
  } 
     
  private class MouseMotion implements MouseMotionListener 
  { 
    public void mouseMoved(MouseEvent e) 
    { 
    } 
    public void mouseDragged(MouseEvent e) 
    { 
    } 
  } 
  public void setGameBoard() 
  { 
    for(int i=0;i<6;i++) 
    { 
      for(int j=0;j<7;j++) 
      { 
        game.board[i][j]=display[i][j]; 
      } 
    } 
  } 
  private class ConnectFourButtonListener implements ActionListener 
  { 
    public void actionPerformed(ActionEvent e) 
    { 
      if(e.getSource()==exit) 
      { 
        System.out.println("Check"); 
        System.exit(0); 
      } 
       
      if(e.getSource()==reset) 
      { 
        for(int i=0;i<6;i++) 
        { 
          for(int j=0;j<7;j++) 
          { 
            display[i][j]='e'; 
          } 
        } 
        repaint(); 
        connectFour=null; 
        count=0; 
        done=false; 
      } 
    } 
  } 
  private class MouseListen implements MouseListener 
  { 
    public void mouseClicked(MouseEvent e) 
    { 
    if(!done) 
    { 
     if(e.getX()>50 && e.getX()<150 && count==0) 
     { 
       Point point = new Point(); 
         count++; 
          connectFour = new ConnectFour(0); 
          
      ConnectFourMove recommended = new ConnectFourMove(); 
      int value = MiniMax.lookAhead(connectFour.game,6,recommended); 
      System.out.println("Computer  places a checker in" + recommended.getMove()); 
      connectFour.changeTurn(); 
     point =connectFour.placeChecker(recommended.getMove()); 
             
      for(int a =0;a<6;a++) 
      { 
        for(int b=0;b<7;b++) 
        { 
         connectFour.game.board[a][b]=connectFour.pieces[a][b]; 
        } 
      } 
       
       
        for(int i=0;i<6;i++) 
        { 
          for(int j=0;j<7;j++) 
          { 
            display[i][j]=connectFour.pieces[i][j]; 
          } 
        } 
        repaint(); 
     } 
  
     else if(e.getX()>50 && e.getX()<150) 
     { 
       connectFour.changeTurn(); 
                
      connectFour.placeChecker(0); 
              
      for(int x=0;x<6;x++) 
      { 
        for(int y=0;y<7;y++) 
        { 
         connectFour.game.board[x][y]=connectFour.pieces[x][y]; 
        } 
      } 
         
        if(connectFour.game.done()) 
        { 
          done=true; 
           
          if(connectFour.game.winner()) 
          System.out.println("Player wins, computer loses"); 
           
          else if(connectFour.game.loser()) 
            System.out.println("Computer wins, player loses"); 
           
          else 
          System.out.println("Tie"); 
        } 

        else 
        { 
       ConnectFourMove recommended = new ConnectFourMove(); 
      int value = MiniMax.lookAhead(connectFour.game,6,recommended); 
      System.out.println("Computer  places a checker in" + recommended.getMove()); 
      connectFour.changeTurn(); 
      connectFour.placeChecker(recommended.getMove()); 
       
      for(int a =0;a<6;a++) 
      { 
        for(int b=0;b<7;b++) 
        { 
          connectFour.game.board[a][b]=connectFour.pieces[a][b]; 
        } 
      } 
       
      if(connectFour.game.done()) 
      { 
        done=true; 
         
        if(connectFour.game.winner()) 
        System.out.println("Player wins, Computer loses"); 
         
        else if(connectFour.game.loser()) 
          System.out.println("Computer wins, Player loses"); 
         
        else 
          System.out.println("Tie"); 
      } 
        } 
              for(int a=0;a<6;a++) 
        for(int b=0;b<7;b++) 
        display[a][b]=connectFour.pieces[a][b]; 
      repaint(); 
     } 
 
     else if(e.getX()>150 && e.getX()<250 && count==0) 
     { 
        Point point = new Point(); 
         count++; 
          connectFour = new ConnectFour(1); 
          
      ConnectFourMove recommended = new ConnectFourMove(); 
      int value = MiniMax.lookAhead(connectFour.game,6,recommended); 
      System.out.println("Computer  places a checker in" + recommended.getMove()); 
      connectFour.changeTurn(); 
     point =connectFour.placeChecker(recommended.getMove()); 
             
      for(int a =0;a<6;a++) 
      { 
        for(int b=0;b<7;b++) 
        { 
         connectFour.game.board[a][b]=connectFour.pieces[a][b]; 
        } 
      } 
       
      
        for(int i=0;i<6;i++) 
        { 
          for(int j=0;j<7;j++) 
          { 
            display[i][j]=connectFour.pieces[i][j]; 
          } 
        } 
        repaint(); 
     } 
      
     else if(e.getX()>150 && e.getX()<250) 
     { 
       connectFour.changeTurn(); 
                
      connectFour.placeChecker(1); 
              
      for(int x=0;x<6;x++) 
      { 
        for(int y=0;y<7;y++) 
        { 
         connectFour.game.board[x][y]=connectFour.pieces[x][y]; 
        } 
      } 
         
        if(connectFour.game.done()) 
        { 
          done=true; 
           
          if(connectFour.game.winner()) 
          System.out.println("Player wins, computer loses"); 
           
          else if(connectFour.game.loser()) 
            System.out.println("computer wins, player loses"); 
           
          else 
          System.out.println("Tie"); 
        } 

        else 
        { 
       ConnectFourMove recommended = new ConnectFourMove(); 
      int value = MiniMax.lookAhead(connectFour.game,6,recommended); 
      System.out.println("Computer  places a checker in" + recommended.getMove()); 
      connectFour.changeTurn(); 
      connectFour.placeChecker(recommended.getMove()); 
       
      for(int a =0;a<6;a++) 
      { 
        for(int b=0;b<7;b++) 
        { 
          connectFour.game.board[a][b]=connectFour.pieces[a][b]; 
        } 
      } 
       
      if(connectFour.game.done()) 
      { 
        done=true; 
         
        if(connectFour.game.winner()) 
        System.out.println("Player wins, Computer loses"); 
         
        else if(connectFour.game.loser()) 
          System.out.println("Computer wins, Player loses"); 
         
        else 
          System.out.println("Tie"); 
      } 
        } 
              for(int a=0;a<6;a++) 
        for(int b=0;b<7;b++) 
        display[a][b]=connectFour.pieces[a][b]; 
      repaint(); 
      
     } 
      
    else if(e.getX()>250 && e.getX()<350 && count==0) 
     { 
         Point point = new Point(); 
         count++; 
          connectFour = new ConnectFour(2); 
          
      ConnectFourMove recommended = new ConnectFourMove(); 
      int value = MiniMax.lookAhead(connectFour.game,6,recommended); 
      System.out.println("Computer  places a checker in" + recommended.getMove()); 
      connectFour.changeTurn(); 
     point =connectFour.placeChecker(recommended.getMove()); 
             
      for(int a =0;a<6;a++) 
      { 
        for(int b=0;b<7;b++) 
        { 
         connectFour.game.board[a][b]=connectFour.pieces[a][b]; 
        } 
      } 
       
      
        for(int i=0;i<6;i++) 
        { 
          for(int j=0;j<7;j++) 
          { 
            display[i][j]=connectFour.pieces[i][j]; 
          } 
        } 
        repaint(); 
     } 
      
    else if(e.getX()>250 && e.getX()<350) 
     { 
         connectFour.changeTurn(); 
                
      connectFour.placeChecker(2); 
              
      for(int x=0;x<6;x++) 
      { 
        for(int y=0;y<7;y++) 
        { 
         connectFour.game.board[x][y]=connectFour.pieces[x][y]; 
        } 
      } 
         
        if(connectFour.game.done()) 
        { 
          done=true; 
           
          if(connectFour.game.winner()) 
          System.out.println("Player wins, computer loses"); 
           
          else if(connectFour.game.loser()) 
            System.out.println("computer wins, player loses"); 
           
          else 
          System.out.println("Tie"); 
        } 

        else 
        { 
       ConnectFourMove recommended = new ConnectFourMove(); 
      int value = MiniMax.lookAhead(connectFour.game,6,recommended); 
      System.out.println("Computer  places a checker in" + recommended.getMove()); 
      connectFour.changeTurn(); 
      connectFour.placeChecker(recommended.getMove()); 
       
      for(int a =0;a<6;a++) 
      { 
        for(int b=0;b<7;b++) 
        { 
          connectFour.game.board[a][b]=connectFour.pieces[a][b]; 
        } 
      } 
       
      if(connectFour.game.done()) 
      { 
        done=true; 
         
        if(connectFour.game.winner()) 
        System.out.println("Player wins, Computer loses"); 
         
        else if(connectFour.game.loser()) 
          System.out.println("Computer wins, Player loses"); 
         
        else 
          System.out.println("Tie"); 
      } 
        } 
              for(int a=0;a<6;a++) 
        for(int b=0;b<7;b++) 
        display[a][b]=connectFour.pieces[a][b]; 
      repaint(); 
      
     } 
     
     else if(e.getX()>350 && e.getX()<450 && count==0) 
     { 
          Point point = new Point(); 
         count++; 
          connectFour = new ConnectFour(3); 
          
      ConnectFourMove recommended = new ConnectFourMove(); 
      int value = MiniMax.lookAhead(connectFour.game,6,recommended); 
      System.out.println("Computer  places a checker in" + recommended.getMove()); 
      connectFour.changeTurn(); 
     point =connectFour.placeChecker(recommended.getMove()); 
             
      for(int a =0;a<6;a++) 
      { 
        for(int b=0;b<7;b++) 
        { 
         connectFour.game.board[a][b]=connectFour.pieces[a][b]; 
        } 
      } 
       
       
        for(int i=0;i<6;i++) 
        { 
          for(int j=0;j<7;j++) 
          { 
            display[i][j]=connectFour.pieces[i][j]; 
          } 
        } 
        repaint(); 
     } 
      
     else if(e.getX()>350 && e.getX()<450) 
     { 
         connectFour.changeTurn(); 
                
      connectFour.placeChecker(3); 
              
      for(int x=0;x<6;x++) 
      { 
        for(int y=0;y<7;y++) 
        { 
         connectFour.game.board[x][y]=connectFour.pieces[x][y]; 
        } 
      } 
         
        if(connectFour.game.done()) 
        { 
          done=true; 
           
          if(connectFour.game.winner()) 
          System.out.println("Player wins, computer loses"); 
           
          else if(connectFour.game.loser()) 
            System.out.println("computer wins, player loses"); 
           
          else 
          System.out.println("Tie"); 
        } 

        else 
        { 
       ConnectFourMove recommended = new ConnectFourMove(); 
      int value = MiniMax.lookAhead(connectFour.game,6,recommended); 
      System.out.println("Computer  places a checker in" + recommended.getMove()); 
      connectFour.changeTurn(); 
      connectFour.placeChecker(recommended.getMove()); 
       
      for(int a =0;a<6;a++) 
      { 
        for(int b=0;b<7;b++) 
        { 
          connectFour.game.board[a][b]=connectFour.pieces[a][b]; 
        } 
      } 
       
      if(connectFour.game.done()) 
      { 
        done=true; 
         
        if(connectFour.game.winner()) 
        System.out.println("Player wins, Computer loses"); 
         
        else if(connectFour.game.loser()) 
          System.out.println("Computer wins, Player loses"); 
         
        else 
          System.out.println("Tie"); 
      } 
        } 
              for(int a=0;a<6;a++) 
        for(int b=0;b<7;b++) 
        display[a][b]=connectFour.pieces[a][b]; 
      repaint(); 
      
     } 
    else if(e.getX()>450 && e.getX()<550&& count==0) 
     { 
          Point point = new Point(); 
         count++; 
          connectFour = new ConnectFour(4); 
          
      ConnectFourMove recommended = new ConnectFourMove(); 
      int value = MiniMax.lookAhead(connectFour.game,6,recommended); 
      System.out.println("Computer  places a checker in" + recommended.getMove()); 
      connectFour.changeTurn(); 
     point =connectFour.placeChecker(recommended.getMove()); 
             
      for(int a =0;a<6;a++) 
      { 
        for(int b=0;b<7;b++) 
        { 
         connectFour.game.board[a][b]=connectFour.pieces[a][b]; 
        } 
      } 
       
      
        for(int i=0;i<6;i++) 
        { 
          for(int j=0;j<7;j++) 
          { 
            display[i][j]=connectFour.pieces[i][j]; 
          } 
        } 
        repaint(); 
     } 
    else if(e.getX()>450 && e.getX()<550) 
     { 
        connectFour.changeTurn(); 
                
      connectFour.placeChecker(4); 
              
      for(int x=0;x<6;x++) 
      { 
        for(int y=0;y<7;y++) 
        { 
         connectFour.game.board[x][y]=connectFour.pieces[x][y]; 
        } 
      } 
         
        if(connectFour.game.done()) 
        { 
          done=true; 
           
          if(connectFour.game.winner()) 
          System.out.println("Player wins, computer loses"); 
           
          else if(connectFour.game.loser()) 
            System.out.println("computer wins, player loses"); 
           
          else 
          System.out.println("Tie"); 
        } 

        else 
        { 
       ConnectFourMove recommended = new ConnectFourMove(); 
      int value = MiniMax.lookAhead(connectFour.game,6,recommended); 
      System.out.println("Computer  places a checker in" + recommended.getMove()); 
      connectFour.changeTurn(); 
      connectFour.placeChecker(recommended.getMove()); 
       
      for(int a =0;a<6;a++) 
      { 
        for(int b=0;b<7;b++) 
        { 
          connectFour.game.board[a][b]=connectFour.pieces[a][b]; 
        } 
      } 
       
      if(connectFour.game.done()) 
      { 
        done=true; 
         
        if(connectFour.game.winner()) 
        System.out.println("Player wins, Computer loses"); 
         
        else if(connectFour.game.loser()) 
          System.out.println("Computer wins, Player loses"); 
         
        else 
          System.out.println("Tie"); 
      } 
        } 
              for(int a=0;a<6;a++) 
        for(int b=0;b<7;b++) 
        display[a][b]=connectFour.pieces[a][b]; 
      repaint(); 
      
     } 
    else if(e.getX()>550 && e.getX()<650&& count==0) 
     { 
          Point point = new Point(); 
         count++; 
          connectFour = new ConnectFour(5); 
          
      ConnectFourMove recommended = new ConnectFourMove(); 
      int value = MiniMax.lookAhead(connectFour.game,6,recommended); 
      System.out.println("Computer  places a checker in" + recommended.getMove()); 
      connectFour.changeTurn(); 
     point =connectFour.placeChecker(recommended.getMove()); 
             
      for(int a =0;a<6;a++) 
      { 
        for(int b=0;b<7;b++) 
        { 
         connectFour.game.board[a][b]=connectFour.pieces[a][b]; 
        } 
      } 
       
       
        for(int i=0;i<6;i++) 
        { 
          for(int j=0;j<7;j++) 
          { 
            display[i][j]=connectFour.pieces[i][j]; 
          } 
        } 
        repaint(); 
     } 
     else if(e.getX()>550 && e.getX()<650) 
     { 
       connectFour.changeTurn(); 
                
      connectFour.placeChecker(5); 
              
      for(int x=0;x<6;x++) 
      { 
        for(int y=0;y<7;y++) 
        { 
         connectFour.game.board[x][y]=connectFour.pieces[x][y]; 
        } 
      } 
         
        if(connectFour.game.done()) 
        { 
          done=true; 
           
          if(connectFour.game.winner()) 
          System.out.println("Player wins, computer loses"); 
           
          else if(connectFour.game.loser()) 
            System.out.println("computer wins, player loses"); 
           
          else 
          System.out.println("Tie"); 
        } 

        else 
        { 
       ConnectFourMove recommended = new ConnectFourMove(); 
      int value = MiniMax.lookAhead(connectFour.game,6,recommended); 
      System.out.println("Computer  places a checker in" + recommended.getMove()); 
      connectFour.changeTurn(); 
      connectFour.placeChecker(recommended.getMove()); 
       
      for(int a =0;a<6;a++) 
      { 
        for(int b=0;b<7;b++) 
        { 
          connectFour.game.board[a][b]=connectFour.pieces[a][b]; 
        } 
      } 
       
      if(connectFour.game.done()) 
      { 
        done=true; 
         
        if(connectFour.game.winner()) 
        System.out.println("Player wins, Computer loses"); 
         
        else if(connectFour.game.loser()) 
          System.out.println("Computer wins, Player loses"); 
         
        else 
          System.out.println("Tie"); 
      } 
        } 
              for(int a=0;a<6;a++) 
        for(int b=0;b<7;b++) 
        display[a][b]=connectFour.pieces[a][b]; 
      repaint(); 
      
     } 
    else if(e.getX()>650 && e.getX()<750 && count==0) 
     { 
         Point point = new Point(); 
         count++; 
          connectFour = new ConnectFour(6); 
          
      ConnectFourMove recommended = new ConnectFourMove(); 
      int value = MiniMax.lookAhead(connectFour.game,6,recommended); 
      System.out.println("Computer  places a checker in" + recommended.getMove()); 
      connectFour.changeTurn(); 
     point =connectFour.placeChecker(recommended.getMove()); 
             
      for(int a =0;a<6;a++) 
      { 
        for(int b=0;b<7;b++) 
        { 
         connectFour.game.board[a][b]=connectFour.pieces[a][b]; 
        } 
      } 
       
        for(int i=0;i<6;i++) 
        { 
          for(int j=0;j<7;j++) 
          { 
            display[i][j]=connectFour.pieces[i][j]; 
          } 
        } 
        repaint(); 
     } 
    else if(e.getX()>650 && e.getX()<750) 
     { 
       connectFour.changeTurn(); 
                
      connectFour.placeChecker(6); 
              
      for(int x=0;x<6;x++) 
      { 
        for(int y=0;y<7;y++) 
        { 
         connectFour.game.board[x][y]=connectFour.pieces[x][y]; 
        } 
      } 
         
        if(connectFour.game.done()) 
        { 
          done=true; 
           
          if(connectFour.game.winner()) 
          System.out.println("Player wins, computer loses"); 
           
          else if(connectFour.game.loser()) 
            System.out.println("computer wins, player loses"); 
           
          else 
          System.out.println("Tie"); 
        } 

        else 
        { 
       ConnectFourMove recommended = new ConnectFourMove(); 
      int value = MiniMax.lookAhead(connectFour.game,6,recommended); 
      System.out.println("Computer  places a checker in" + recommended.getMove()); 
      connectFour.changeTurn(); 
      connectFour.placeChecker(recommended.getMove()); 
       
      for(int a =0;a<6;a++) 
      { 
        for(int b=0;b<7;b++) 
        { 
          connectFour.game.board[a][b]=connectFour.pieces[a][b]; 
        } 
      } 
       
      if(connectFour.game.done()) 
      { 
        done=true; 
         
        if(connectFour.game.winner()) 
        System.out.println("Player wins, Computer loses"); 
         
        else if(connectFour.game.loser()) 
          System.out.println("Computer wins, Player loses"); 
         
        else 
          System.out.println("Tie"); 
      } 
        } 
              for(int a=0;a<6;a++) 
        for(int b=0;b<7;b++) 
        display[a][b]=connectFour.pieces[a][b]; 
      repaint(); 
      
     } 
    else 
    { 
    } 
        
    }   
    } 
    public void mousePressed(MouseEvent e) 
    { 
    } 
    public void mouseReleased(MouseEvent e) 
    { 
    } 
    public void mouseEntered(MouseEvent e) 
    { 
    } 
    public void mouseExited(MouseEvent e) 
    { 
    } 
  } 
         
  public static void main(String[] args) 
  { 
  JFrame frame = new JFrame(); 
  JPanel panel = new ConnectFourGUI(); 
  frame.add(panel,BorderLayout.CENTER); 
  frame.setVisible(true); 
  frame.setBounds(300,10,800,700); 
  frame.setResizable(false); 
   
  
    } 
}