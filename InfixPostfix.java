//Jared Rostkowski
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class InfixPostfix extends JFrame
{
  private JButton postfixButton;
  private JButton evaluateButton;
  private JButton clearButton;
  private JButton exitButton;
  private JTextField infixField;
  private JTextField postfixField;
  private JTextField resultField;  
  
  public InfixPostfix()
  {
    super("Convert to Postfix");
     setBounds(0,0,800,400);
    JPanel panel = new JPanel();
    JLabel first = new JLabel();
    first.setFont(new Font("Courier",Font.BOLD,12));
    first.setText("Infix");
    infixField = new JTextField(10);
    panel.add(first);
    panel.add(infixField);
    
    JLabel output = new JLabel();
    output.setFont(new Font("Courier",Font.BOLD,12));
    output.setText("Postfix");
    postfixField = new JTextField(10);
    panel.add(output);
    panel.add(postfixField);
    postfixField.setEditable(false);
    
    JLabel result = new JLabel();
    result.setFont(new Font("Courier",Font.BOLD,12));
    result.setText("Result");
    resultField = new JTextField(10);
    panel.add(result);
    panel.add(resultField);
    resultField.setEditable(false);
    
    add(panel, BorderLayout.CENTER);
    
    JPanel buttonPanel = new JPanel();
    postfixButton = new JButton("Postfix");
    buttonPanel.add(postfixButton);
    add(buttonPanel, BorderLayout.SOUTH);
    
    
    evaluateButton = new JButton("Evaluate");
    buttonPanel.add(evaluateButton);
    add(buttonPanel, BorderLayout.SOUTH);
    
    clearButton = new JButton("Clear");
    buttonPanel.add(clearButton);
    add(buttonPanel, BorderLayout.SOUTH);
    
   exitButton = new JButton("Exit");
    buttonPanel.add(exitButton);
    add(buttonPanel, BorderLayout.SOUTH);
    
    postfixButton.addActionListener(new ButtonHandler());
    evaluateButton.addActionListener(new ButtonHandler());
    clearButton.addActionListener(new ButtonHandler());
    exitButton.addActionListener(new ButtonHandler());
    
    setResizable(false);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
   private class ButtonHandler implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      if(e.getSource() == postfixButton)
      {
      }
      if(e.getSource() == evaluateButton)
      {
      }
      if(e.getSource() == clearButton)
      {
        infixField = "";
        postfixField = "";
        resultField = ""; 
      }
       if(e.getSource() == exitButton)
       {
         System.exit(0);
       }
    }
   }
public static void main(String[] args)
  {
    InfixPostfix i = new InfixPostfix();
}
}
    
    