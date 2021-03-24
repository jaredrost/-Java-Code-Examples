//Jared Rostkowski, Bryan Boyle, Patrick Doherty 
import javax.swing.*;
import java.awt.*;
public class Faces extends JFrame
{
  public Faces()
  { 
    super("BorderLayout"); 
            add(new JButton("Peter Griffin"), BorderLayout.NORTH); 
         add(new JButton("Spongebob"), BorderLayout.NORTH); 
         add(new JButton("Cosmo"), BorderLayout.NORTH); 
         int random = (int)(Math.random()*3 + 1); 
         if(random == 1) 
         { 
             add(new JLabel(new ImageIcon("Peter Griffin")), BorderLayout.CENTER); 
         } 
         else if(random == 2)
         {
           add(new JLabel(new ImageIcon("Spongebob")), BorderLayout.CENTER); 
         }
         else if(random == 3)
         {
           add(new JLabel(new ImageIcon("Cosmo")), BorderLayout.CENTER); 
     }
          setBounds(710, 315, 500, 450); 
        setResizable(false); 
        setVisible(true); 
       
  }
      
     public static void main(String[] args)
     { 
         JFrame stuff = new Faces(); 
         
       
        stuff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    } 
}