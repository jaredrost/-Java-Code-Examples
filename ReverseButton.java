//Jared Rostkowski, Bryan Boyle, Patrick Doherty 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class ReverseButton extends JFrame
{
  private JButton reverseButton;
  private JTextField stringField;
  private JTextField reverseField;
    
    
  public ReverseButton()
  {
    super("Reverse String");
    setBounds(0,0,175,175);
    JPanel panel = new JPanel();
    JLabel first = new JLabel();
    first.setFont(new Font("Courier",Font.BOLD,12));
    first.setText("Enter your string");
    stringField = new JTextField(10);
    panel.add(first);
    panel.add(stringField);
    
    JLabel reverse = new JLabel();
    reverse.setFont(new Font("Courier",Font.BOLD,12));
    reverse.setText("Reverse");
    reverseField = new JTextField(10);
    panel.add(reverse);
    panel.add(reverseField);
    reverseField.setEditable(false);
    
    add(panel, BorderLayout.CENTER);
    
    JPanel buttonPanel = new JPanel();
    reverseButton = new JButton("Reverse");
    buttonPanel.add(reverseButton);
    add(buttonPanel, BorderLayout.SOUTH);
    
    reverseButton.addActionListener(new ButtonHandler());
    
    setResizable(false);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  private class ButtonHandler implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      if(e.getSource() == reverseButton)
      {
        String s = stringField.getText();
        String r = "";
     
        for(int i = s.length() -1 ; i>=0;i--)
        {
          r = r + s.charAt(i);
          
        }
        reverseField.setText(r);
      }
    }
  }
          
        
        
  public static void main(String[] args)
  {
    ReverseButton b = new ReverseButton();
}
}
  
  