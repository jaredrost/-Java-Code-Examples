//Jared Rostkowski
import java.io.*;  
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  

  
public class MapQuestGUI extends JFrame  
{  
  JPanel selectionPanel;  
  JPanel buttonPanel;  
  JPanel centerPanel;  
  JPanel mileagePanel;  
  JList startList;  
  JList endList;  
  JTextArea path;  
  JTextField mileage = new JTextField();  
  JLabel startLabel = new JLabel("From:");  
  JLabel endLabel = new JLabel("To:");  
  JLabel mileageLabel = new JLabel("Mileage");  
  JButton resetButton = new JButton("Reset");;  
  JButton computeButton = new JButton("Compute");  
  JButton exitButton = new JButton("Exit");  
  JScrollPane startScrollPane;  
  JScrollPane endScrollPane;  
  JScrollPane pathScrollPane;  
  Stack<String> stack = new Stack<String>();  
    
  MapQuest mapQuest;  
   
  public MapQuestGUI() throws IOException  
  {  
    mapQuest = new MapQuest();  
      
    startList = new JList(mapQuest.cities);  
    endList = new JList(mapQuest.cities);  
      
    startList.setSelectionMode(1);  
    endList.setSelectionMode(1);  
   
    path = new JTextArea(15,25);  
      
    path.setEditable(false);  
    startScrollPane = new JScrollPane(startList);  
    endScrollPane = new JScrollPane(endList);  
    pathScrollPane = new JScrollPane(path);  
      
    add(pathScrollPane,BorderLayout.SOUTH);  
      
    mileage.setEditable(false);  
    centerPanel = new JPanel();  
    mileagePanel = new JPanel();  
    mileagePanel.setLayout(new GridLayout(2,1));  
    mileagePanel.add(mileageLabel);  
    mileagePanel.add(mileage);  
      
    centerPanel.setLayout(new GridLayout(2,1));  
    centerPanel.add(mileagePanel);  
      
    buttonPanel = new JPanel();  
    buttonPanel.add(resetButton);  
    buttonPanel.add(computeButton);  
    buttonPanel.add(exitButton);  
      
    centerPanel.add(buttonPanel);  
      
    add(centerPanel,BorderLayout.CENTER);  
      
    selectionPanel = new JPanel();  
    selectionPanel.setLayout(new GridLayout(1,4));  
    selectionPanel.add(startLabel);  
    selectionPanel.add(startScrollPane);  
    selectionPanel.add(endLabel);  
    selectionPanel.add(endScrollPane);  
    add(selectionPanel,BorderLayout.NORTH);  
      
    resetButton.addActionListener(new MapQuestListener());  
    computeButton.addActionListener( new MapQuestListener());  
    exitButton.addActionListener(new MapQuestListener());  
      
  }  
   private class MapQuestListener implements ActionListener  
  {  
    public void actionPerformed(ActionEvent e)  
    {  
      if(e.getSource()== resetButton)  
      {  
        mileage.setText("");  
        path.setText("");  
      }  
      if(e.getSource() == computeButton)  
      {  
        try  
        {  
         int startIndex = startList.getSelectedIndex();  
         int endIndex =   endList.getSelectedIndex();  
           
         mapQuest = new MapQuest();  
           
        stack=mapQuest.findPath(startIndex,endIndex);  
          
        int miles = 0;  
          
         miles= mapQuest.getTotalMiles(endIndex);  
          
        mileage.setText("Total Miles: " + miles);  
          
        while(!stack.empty())  
        {  
          path.append(stack.pop()+"\n");  
        }  
        }  
        catch(IOException a)  
        {  
        }  
      }  
      if(e.getSource() == exitButton)  
      {  
        System.exit(0);  
      }  
    }  
  }  
  public static void main(String[] args) throws IOException  
  {  
    JFrame frame = new MapQuestGUI();  
    frame.setBounds(400,100,500,500);  
    frame.setVisible(true);  
    frame.setResizable(true);  
      
  }  
}  
