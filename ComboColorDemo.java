//Jared Rostkowski 
import java.util.*; 
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
public class ComboColorDemo extends JFrame 
{ 
     
    private JComboBox colorOption;  
    private String[] colors = new String[4];  
    private JPanel panel=new JPanel(); 
    // other stuff 
     
    public ComboColorDemo() 
         
    {  
        JFrame frame=new JFrame(); 
        
        panel.setBackground(Color.RED); 
         
        colors[0] = "Red";  // initialize names to be displayed  
        colors[1] = "Blue";  
        colors[2] = "Green";  
        colors[3] = "Yellow"; 
         
        colorOption = new JComboBox(colors); 
        panel.add(colorOption); 
        frame.add(panel); 
        colorOption.addActionListener(new ButtonListener()); 
        frame.setVisible(true); 
        frame.setBounds(0,0,500,500); 
         
    } 
       
    private class ButtonListener implements ActionListener  
    { 
       
        public void actionPerformed(ActionEvent e) 
        { 
            if(((String)colorOption.getSelectedItem()).equals("Red")) 
                panel.setBackground(Color.RED); 
            else if(((String)colorOption.getSelectedItem()).equals("Blue")) 
                panel.setBackground(Color.BLUE); 
            else if(((String)colorOption.getSelectedItem()).equals("Green")) 
                panel.setBackground(Color.GREEN); 
            else if(((String)colorOption.getSelectedItem()).equals("Yellow")) 
                panel.setBackground(Color.YELLOW); 
        } 
    } 
     
    public static void main(String[]args) 
    { 
        ComboColorDemo ccd=new ComboColorDemo(); 
 
         
    } 
} 
             
                 
                 
        