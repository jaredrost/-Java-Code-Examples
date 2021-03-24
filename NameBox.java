//Jared Rostkowski 
import java.util.*; 
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*;
import java.io.*;
import javax.swing.event.*;
public class NameBox extends JFrame 
{ 
     
    private JList nameList;  
    private String[] names = new String[11]; 
    private String[] numbers = new String[11];
    private JPanel panel=new JPanel(); 
    private JPanel panel1= new JPanel();
    private File file;
    private JLabel label;
 
     
    public NameBox() throws IOException
         
    {  
      
      file = new File("namenumber.txt");
      if(!file.exists())
      {
        System.out.println("File does not exist");
        System.exit(0);
      }
      int num = 0;
      Scanner input = new Scanner(file);
        while(input.hasNext())
      {
        names[num] = input.next();
        numbers[num] = input.nextLine();
        num++;
      }
      input.close();
        
        JFrame frame=new JFrame(); 
        
        panel.setBackground(Color.YELLOW); 
        panel1.setBackground(Color.YELLOW);
        nameList = new JList(names); 
        JScrollPane sp = new JScrollPane(nameList);  
        panel.add(sp); 
      label = new JLabel();
      
      label.setVisible(true);
      panel.add(label);
   
        
   
        frame.add(panel); 

        nameList.addListSelectionListener(new ListSelectionListener() 
            {
          public void valueChanged(ListSelectionEvent evt) 
          {

            if (evt.getValueIsAdjusting())
              
           label.setText(names[nameList.getSelectedIndex()] + numbers[nameList.getSelectedIndex()]);
          }
        });
        frame.setVisible(true); 
        frame.setBounds(0,0,500,500); 
        nameList.setVisibleRowCount(5);
         
    }

    public static void main(String[]args) throws IOException
    { 
        NameBox b =new NameBox(); 
 
         
    } 
} 
             
                 
                 
        