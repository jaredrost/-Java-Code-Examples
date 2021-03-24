//Jared Rostkowski
import java.util.*; 
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
 
public class MonteHall extends JFrame 
{ 
    
     
    private JButton door1; 
    private JButton door2; 
    private JButton door3; 
    private JButton reset; 
    private JLabel games; 
    private int gamesZ; 
    private JLabel switches; 
    private int switchesZ; 
    private JLabel carsWon; 
    private int carsWonZ; 
    private JLabel goatsWon; 
    private int goatsWonZ; 
    private int turn; 
    private JPanel doorPanel; 
    private JPanel labelPanel; 
    private int car; 
    private int goat; 
    private int choice; 
     
    public MonteHall() 
    { 
         
        super("Monte Hall"); 
        setBounds(0,0,1700,900); 
         
        int turn=1; 
        Random r=new Random(); 
        car= r.nextInt(3); 
   
         
         
        gamesZ=0; 
        switchesZ=0;     
        carsWonZ=0; 
        goatsWonZ=0; 
         
        
        reset=new JButton("Reset");         
        add(reset, BorderLayout.WEST); 
         
        door1=new JButton(new ImageIcon("Door.png")); 
        door2=new JButton(new ImageIcon("Door.png"));  
        door3=new JButton(new ImageIcon("Door.png")); 
         
        doorPanel=new JPanel(); 
        doorPanel.add(door1); 
        doorPanel.add(door2);         
        doorPanel.add(door3); 
        add(doorPanel, BorderLayout.CENTER); 
         
        games=new JLabel("Games Played: "+ gamesZ); 
        games.setFont(new Font("Arial", Font.PLAIN, 50)); 
        switches=new JLabel("Switches Performed: "+ switchesZ);    
        switches.setFont(new Font("Arial", Font.PLAIN, 50)); 
        carsWon=new JLabel("Cars Won: "+ carsWonZ); 
        carsWon.setFont(new Font("Arial", Font.PLAIN, 50)); 
        goatsWon=new JLabel("Goats Won: "+ goatsWonZ); 
        goatsWon.setFont(new Font("Arial", Font.PLAIN, 50)); 
         
       
         
        labelPanel=new JPanel(); 
        labelPanel.add(games); 
        labelPanel.add(switches); 
        labelPanel.add(carsWon); 
        labelPanel.add(goatsWon); 
        add(labelPanel, BorderLayout.SOUTH); 
         
        
        door1.addActionListener(new ButtonHandler()); 
        door2.addActionListener(new ButtonHandler()); 
        door3.addActionListener(new ButtonHandler()); 
        reset.addActionListener(new ButtonHandler()); 
    } 
     
    
     
    public class ButtonHandler implements ActionListener 
    { 
         
         
        public void actionPerformed(ActionEvent e) 
        { 
            if(e.getSource()==reset) 
            { 
                turn=0; 
                door1.setEnabled(true); 
                door2.setEnabled(true); 
                door3.setEnabled(true); 
                carsWon.setText("Cars Won: "+ carsWonZ); 
                games.setText("Games Played: "+ gamesZ); 
                switches.setText("Switches: "+ switchesZ); 
            } 
             
            if(turn==0) 
            { 
                if(e.getSource()==door1) 
                { 
                    choice=1; 
                    if(car==0 ) 
                    { 
                        JOptionPane.showMessageDialog(null,"You've chosen door 1, but there is a goat behind door 3. Do you want to change?",  
                                                      "Monte Hall", JOptionPane.INFORMATION_MESSAGE ); 
                        door3.setEnabled(false); 
                        turn++; 
                    } 
                    if(car==1 ) 
                    { 
                        JOptionPane.showMessageDialog(null,"You've chosen door 1, but there is a goat behind door 3. Do you want to change?",  
                                                      "Monte Hall", JOptionPane.INFORMATION_MESSAGE ); 
                        door3.setEnabled(false); 
                        turn++; 
                    } 
                    if(car==2 ) 
                    { 
                        JOptionPane.showMessageDialog(null,"You've chosen door 1, but there is a goat behind door 2. Do you want to change?",  
                                                      "Monte Hall", JOptionPane.INFORMATION_MESSAGE ); 
                        door2.setEnabled(false); 
                        turn++; 
                    } 
                } 
                 
                 
                if( e.getSource()==door2) 
                { 
                    choice=2; 
                    if(car==0 ) 
                    { 
                         
                        JOptionPane.showMessageDialog(null,"You've chosen door 2, but there is a goat behind door 3. Do you want to change?",  
                                                      "Monte Hall", JOptionPane.INFORMATION_MESSAGE ); 
                        door3.setEnabled(false); 
                        turn++; 
                    } 
                    if(car==1 ) 
                    { 
                        JOptionPane.showMessageDialog(null,"You've chosen door 2, but there is a goat behind door 3. Do you want to change?",  
                                                      "Monte Hall", JOptionPane.INFORMATION_MESSAGE ); 
                        door3.setEnabled(false); 
                        turn++; 
                    } 
                    if(car==2 ) 
                    { 
                        JOptionPane.showMessageDialog(null,"You've chosen door 2, but there is a goat behind door 1. Do you want to change?",  
                                                      "Monte Hall", JOptionPane.INFORMATION_MESSAGE ); 
                        door1.setEnabled(false); 
                        turn++; 
                    } 
                } 
                 
                if( e.getSource()==door3) 
                { 
                    choice=3; 
                    if(car==0 ) 
                    { 
                        JOptionPane.showMessageDialog(null,"You've chosen door 3, but there is a goat behind door 2. Do you want to change?",  
                                                      "Monte Hall", JOptionPane.INFORMATION_MESSAGE ); 
                        door2.setEnabled(false); 
                        turn++; 
                    } 
                    if(car==1 ) 
                    { 
                        JOptionPane.showMessageDialog(null,"You've chosen door 3, but there is a goat behind door 1. Do you want to change?",  
                                                      "Monte Hall", JOptionPane.INFORMATION_MESSAGE ); 
                        door1.setEnabled(false); 
                        turn++; 
                    } 
                    if(car==2 ) 
                    { 
                        JOptionPane.showMessageDialog(null,"You've chosen door 3, but there is a goat behind door 2. Do you want to change?",  
                                                      "Monte Hall", JOptionPane.INFORMATION_MESSAGE ); 
                        door2.setEnabled(false); 
                        turn++; 
                    } 
                } 
            } 
           
           else if(turn==1) 
            { 
               
                if(e.getSource()==door1) 
                { 
                    if(car==0) 
                    { 
                        JOptionPane.showMessageDialog(null,"You've won the car!","Monte Hall", 
                                                      JOptionPane.INFORMATION_MESSAGE); 
                        door1.setEnabled(false); 
                        carsWonZ++; 
                        carsWon.setText("Cars Won: "+ carsWonZ); 
                        gamesZ++; 
                        games.setText("Games Played: "+ gamesZ); 
                        if (choice != 1) 
                        { 
                        switchesZ++; 
                        switches.setText("Switches: "+ switchesZ); 
                        } 
                        door3.setEnabled(false); 
                        door1.setEnabled(false); 
                    } 
                    if(car==1) 
                    { 
                         
                        JOptionPane.showMessageDialog(null,"Oops you got a goat","Monte Hall", 
                                                      JOptionPane.INFORMATION_MESSAGE); 
                        goatsWonZ++; 
                        goatsWon.setText("Goats Won: "+ goatsWonZ); 
                        gamesZ++; 
                        games.setText("Games Played: "+ gamesZ); 
                        door3.setEnabled(false); 
                        door1.setEnabled(false); 
                    } 
                    if(car==2) 
                    { 
                        JOptionPane.showMessageDialog(null,"Oops you got a goat","Monte Hall", 
                                                      JOptionPane.INFORMATION_MESSAGE); 
                        goatsWonZ++; 
                        goatsWon.setText("Goats Won: "+ goatsWonZ); 
                        gamesZ++; 
                        games.setText("Games Played: "+ gamesZ); 
                        door3.setEnabled(false); 
                        door1.setEnabled(false); 
                    } 
                } 
                 
                 
                
                if(e.getSource()==door2) 
                { 
                    if(car==0) 
                    { 
                        JOptionPane.showMessageDialog(null,"Oops you got a goat","Monte Hall", 
                                                      JOptionPane.INFORMATION_MESSAGE); 
                        goatsWonZ++; 
                        goatsWon.setText("Goats Won: "+ goatsWonZ); 
                        gamesZ++; 
                        games.setText("Games Played: "+ gamesZ); 
                        if(choice!=1) 
                        { 
                        switchesZ++; 
                        switches.setText("Switches: "+ switchesZ); 
                        } 
                        door1.setEnabled(false); 
                        door2.setEnabled(false); 
                    } 
                    if(car==1) 
                    { 
                         
                        JOptionPane.showMessageDialog(null,"You've won the car!","Monte Hall", 
                                                      JOptionPane.INFORMATION_MESSAGE); 
                        carsWonZ++; 
                        carsWon.setText("Cars Won: "+ carsWonZ); 
                        if(choice!=2) 
                        { 
                        switchesZ++; 
                        switches.setText("Switches: "+ switchesZ); 
                        } 
                        gamesZ++; 
                        games.setText("Games Played: "+ gamesZ); 
                        door1.setEnabled(false); 
                        door2.setEnabled(false); 
                    } 
                    if(car==2) 
                    { 
                        JOptionPane.showMessageDialog(null,"Oops you got a goat","Monte Hall", 
                                                      JOptionPane.INFORMATION_MESSAGE); 
                        goatsWonZ++; 
                        goatsWon.setText("Goats Won: "+ goatsWonZ); 
                        gamesZ++; 
                        games.setText("Games Played: "+ gamesZ); 
                       if(choice!=3) 
                        { 
                        switchesZ++; 
                        switches.setText("Switches: "+ switchesZ); 
                        } 
                        door3.setEnabled(false); 
                        door2.setEnabled(false); 
                    } 
                } 
                     
                     if(e.getSource()==door3) 
                { 
                    if(car==0) 
                    { 
                        JOptionPane.showMessageDialog(null,"Oops you got a goat","Monte Hall", 
                                                      JOptionPane.INFORMATION_MESSAGE); 
                        goatsWonZ++; 
                        goatsWon.setText("Goats Won: "+ goatsWonZ); 
                        gamesZ++; 
                        games.setText("Games Played: "+ gamesZ); 
                        if(choice!=1) 
                        { 
                        switchesZ++; 
                        switches.setText("Switches: "+ switchesZ); 
                        } 
                        door1.setEnabled(false); 
                        door3.setEnabled(false); 
                    } 
                    if(car==1) 
                    { 
                         
                        JOptionPane.showMessageDialog(null,"Oops you got a goat","Monte Hall", 
                                                      JOptionPane.INFORMATION_MESSAGE); 
                        carsWonZ++; 
                        carsWon.setText("Cars Won: "+ carsWonZ); 
                        if(choice!=2) 
                        { 
                        switchesZ++; 
                        switches.setText("Switches: "+ switchesZ); 
                        } 
                        gamesZ++; 
                        games.setText("Games Played: "+ gamesZ); 
                        door1.setEnabled(false); 
                        door3.setEnabled(false); 
                    } 
                    if(car==2) 
                    { 
                        JOptionPane.showMessageDialog(null,"You've won the car!","Monte Hall", 
                                                      JOptionPane.INFORMATION_MESSAGE); 
                        goatsWonZ++; 
                        goatsWon.setText("Goats Won: "+ goatsWonZ); 
                        gamesZ++; 
                        games.setText("Games Played: "+ gamesZ); 
                        if(choice!=3) 
                        { 
                        switchesZ++; 
                        switches.setText("Switches: "+ switchesZ); 
                        } 
                        door3.setEnabled(false); 
                    } 
                     
                     
                } 
            } 
        } 
    } 
     
 public static void main(String[]args) 
    { 
        MonteHall frame=new MonteHall(); 
        frame.setVisible(true); 
        frame.setResizable(true); 
    } 
} 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
