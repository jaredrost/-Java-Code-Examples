//Jared Rostkowski 
import java.util.*; 
import javax.swing.*; 
import java.awt.*; 
public class CheckerBoard2 extends JFrame 
{ 
     
    public CheckerBoard2() 
    { 
        super("CheckerBoard"); 
        setLayout(new GridLayout(8,8)); //make the grid 
        //int[][] board=new int[8][8];//making a mirroring array....not needed 
        for(int r=0;r<8;r++) 
        { 
            for(int c=0;c<8;c++) 
            { 
                if((c+r)%2==0) 
                { 
                    //boolean white=true; 
                    JPanel panel=new JPanel(new GridLayout(0,1)); 
                    panel.setBackground(Color.WHITE); 
                     
                    add(panel); 
                     
                     
                     
                     
                } 
                else 
                { 
                    //boolean green=true; 
                    JPanel panel=new JPanel(new GridLayout(0,1)); 
                    if(r==0||r==1) 
                    { 
                        panel.add(new redChecker()); 
                    } 
                    else if(r==6||r==7) 
                    { 
                        panel.add(new blackChecker()); 
                    } 
                     
                     
                    panel.setBackground(Color.GREEN); 
                    add(panel); 
                     
                     
                     
                } 
                 
            } 
        } 
    } 
     
     
     
     
    public static void main(String []args) 
    { 
        JFrame f=new CheckerBoard2(); 
        f.setVisible(true); 
        f.setBounds(0,0,2500,2000); 
         
    } 
     
    public class blackChecker extends JComponent 
    { 
         
        public void paintComponent(Graphics g)  
        { 
            super.paintComponent(g); 
            g.setColor(Color.BLACK); 
            g.fillOval(80,50,150,150); 
             
        } 
    } 
    public class redChecker extends JComponent 
    { 
         
        public void paintComponent(Graphics g)  
        { 
            super.paintComponent(g); 
            g.setColor(Color.RED); 
            g.fillOval(80,50,150,150); 
        } 
    } 
} 
 
 
 
 
 
