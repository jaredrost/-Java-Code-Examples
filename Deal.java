//Jared Rostkowski
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.event.*; 
public class Deal extends JFrame 
{ 
    private int buttonsPressed = 0; 
    private String s = ""; 
    private JPanel panel = new JPanel(); 
    private JButton [] button=new JButton[26]; 
    private String amounts[]={"$0.01", "$1", "$5", "$10", "$25", "$50", "$75", "$100", "$200", "$300", "$400", "$500", "$750", "$1,000", "$5,000", "$10,000", "$25,000","$50,000","$75,000","$100,000", "$200,000", "$300,000", "$400,000", "$500,000", "$750,000", "$1,000,000"};  
     
    public Deal() 
    { 
         
        setTitle("Deal or no Deal"); 
        setBounds(100,100, 1000, 1000); 
        setBackground(Color.YELLOW); 
         
        JFrame frame=new JFrame(); 
        JPanel panel=new JPanel(); 
        setLayout(new GridLayout(6,5)); 
         
        button[0]=new JButton(" 1 "); 
        button[1]=new JButton(" 2 "); 
        button[2]=new JButton(" 3 "); 
        button[3]=new JButton(" 4 "); 
        button[4]=new JButton(" 5 "); 
        button[5]=new JButton(" 6 "); 
        button[6]=new JButton(" 7 "); 
        button[7]=new JButton(" 8 "); 
        button[8]=new JButton(" 9 "); 
        button[9]=new JButton(" 10 "); 
        button[10]=new JButton(" 11 "); 
        button[11]=new JButton(" 12 "); 
        button[12]=new JButton(" 13 "); 
        button[13]=new JButton(" 14 "); 
        button[14]=new JButton(" 15 "); 
        button[15]=new JButton(" 16 "); 
        button[16]=new JButton(" 17 "); 
        button[17]=new JButton(" 18 "); 
        button[18]=new JButton(" 19 "); 
        button[19]=new JButton(" 20 "); 
        button[20]=new JButton(" 21 "); 
        button[21]=new JButton(" 22 "); 
        button[22]=new JButton(" 23 "); 
        button[23]=new JButton(" 24 "); 
        button[24]=new JButton(" 25 "); 
        button[25]=new JButton(" 26 "); 
         
        for(int i=0;i<button.length;i++) 
        { 
             
            button[i].setFont(new Font("Arial", Font.BOLD, 30)); 
        } 
         
        for(int i=0;i<button.length;i++) 
        { 
             
            add(button[i]); 
             
        } 
        button[0].addActionListener(new ButtonHandler()); 
        button[1].addActionListener(new ButtonHandler()); 
        button[2].addActionListener(new ButtonHandler()); 
        button[3].addActionListener(new ButtonHandler()); 
        button[4].addActionListener(new ButtonHandler()); 
        button[5].addActionListener(new ButtonHandler()); 
        button[6].addActionListener(new ButtonHandler()); 
        button[7].addActionListener(new ButtonHandler()); 
        button[8].addActionListener(new ButtonHandler()); 
        button[9].addActionListener(new ButtonHandler()); 
        button[10].addActionListener(new ButtonHandler()); 
        button[11].addActionListener(new ButtonHandler()); 
        button[12].addActionListener(new ButtonHandler()); 
        button[13].addActionListener(new ButtonHandler()); 
        button[14].addActionListener(new ButtonHandler()); 
        button[15].addActionListener(new ButtonHandler()); 
        button[16].addActionListener(new ButtonHandler()); 
        button[17].addActionListener(new ButtonHandler()); 
        button[18].addActionListener(new ButtonHandler()); 
        button[19].addActionListener(new ButtonHandler()); 
        button[20].addActionListener(new ButtonHandler()); 
        button[21].addActionListener(new ButtonHandler()); 
        button[22].addActionListener(new ButtonHandler()); 
        button[23].addActionListener(new ButtonHandler()); 
        button[24].addActionListener(new ButtonHandler()); 
        button[25].addActionListener(new ButtonHandler()); 
         
    } 
    private class ButtonHandler implements ActionListener 
    { 
         
        public void actionPerformed(ActionEvent e) 
        { 
            String myCase = ""; 
             
            if(buttonsPressed == 0) 
            { 
                int ran = (int)(Math.random()*amounts.length); 
                myCase = amounts[ran]; 
                amounts[ran] = "0"; 
                s = myCase; 
                 
                if(e.getSource()==button[0]) 
                { 
                     
                    button[0].setBackground(Color.YELLOW); 
                    button[0].setText("Your Case!"); 
                    button[0].setEnabled(false); 
                    buttonsPressed++; 
                } 
                else if(e.getSource()==button[1]) 
                { 
                    button[1].setBackground(Color.YELLOW); 
                    button[1].setText("Your Case!"); 
                    button[1].setEnabled(false); 
                    buttonsPressed++; 
                } 
                else if(e.getSource()==button[2]) 
                { 
                    button[2].setBackground(Color.YELLOW); 
                    button[2].setText("Your Case!"); 
                    button[2].setEnabled(false); 
                    buttonsPressed++; 
                } 
                else if(e.getSource()==button[3]) 
                { 
                    button[3].setBackground(Color.YELLOW); 
                    button[3].setText("Your Case!"); 
                    button[3].setEnabled(false); 
                    buttonsPressed++; 
                } 
                else if(e.getSource()==button[4]) 
                { 
                    button[4].setBackground(Color.YELLOW); 
                    button[4].setText("Your Case!"); 
                    button[4].setEnabled(false); 
                    buttonsPressed++; 
                } 
                else if(e.getSource()==button[5]) 
                { 
                    button[5].setBackground(Color.YELLOW); 
                    button[5].setText("Your Case!"); 
                    button[5].setEnabled(false); 
                    buttonsPressed++; 
                } 
                else if(e.getSource()==button[6]) 
                { 
                    button[6].setBackground(Color.YELLOW); 
                    button[6].setText("Your Case!"); 
                    button[6].setEnabled(false); 
                    buttonsPressed++; 
                } 
                else if(e.getSource()==button[7]) 
                { 
                    button[7].setBackground(Color.YELLOW); 
                    button[7].setText("Your Case!"); 
                    button[7].setEnabled(false); 
                    buttonsPressed++; 
                } 
                else if(e.getSource()==button[8]) 
                { 
                    button[8].setBackground(Color.YELLOW); 
                    button[8].setText("Your Case!"); 
                    button[8].setEnabled(false); 
                    buttonsPressed++; 
                } 
                else if(e.getSource()==button[9]) 
                { 
                    button[9].setBackground(Color.YELLOW); 
                    button[9].setText("Your Case!"); 
                    button[9].setEnabled(false); 
                    buttonsPressed++; 
                } 
                else if(e.getSource()==button[10]) 
                { 
                    button[10].setBackground(Color.YELLOW); 
                    button[10].setText("Your Case!"); 
                    button[10].setEnabled(false); 
                    buttonsPressed++; 
                } 
                else if(e.getSource()==button[11]) 
                { 
                    button[11].setBackground(Color.YELLOW); 
                    button[11].setText("Your Case!"); 
                    button[11].setEnabled(false); 
                    buttonsPressed++; 
                } 
                else if(e.getSource()==button[12]) 
                { 
                    button[12].setBackground(Color.YELLOW); 
                    button[12].setText("Your Case!"); 
                    button[12].setEnabled(false); 
                    buttonsPressed++; 
                } 
                else if(e.getSource()==button[13]) 
                { 
                    button[13].setBackground(Color.YELLOW); 
                    button[13].setText("Your Case!"); 
                    button[13].setEnabled(false); 
                    buttonsPressed++; 
                } 
                else if(e.getSource()==button[14]) 
                { 
                    button[14].setBackground(Color.YELLOW); 
                    button[14].setText("Your Case!"); 
                    button[14].setEnabled(false); 
                    buttonsPressed++; 
                } 
                else if(e.getSource()==button[15]) 
                { 
                    button[15].setBackground(Color.YELLOW); 
                    button[15].setText("Your Case!"); 
                    button[15].setEnabled(false); 
                    buttonsPressed++; 
                } 
                else if(e.getSource()==button[16]) 
                { 
                    button[16].setBackground(Color.YELLOW); 
                    button[16].setText("Your Case!"); 
                    button[16].setEnabled(false); 
                    buttonsPressed++; 
                } 
                else if(e.getSource()==button[17]) 
                { 
                    button[17].setBackground(Color.YELLOW); 
                    button[17].setText("Your Case!"); 
                    button[17].setEnabled(false); 
                    buttonsPressed++; 
                } 
                else if(e.getSource()==button[18]) 
                { 
                    button[18].setBackground(Color.YELLOW); 
                    button[18].setText("Your Case!"); 
                    button[18].setEnabled(false); 
                    buttonsPressed++; 
                } 
                else if(e.getSource()==button[19]) 
                { 
                    button[19].setBackground(Color.YELLOW); 
                    button[19].setText("Your Case!"); 
                    button[19].setEnabled(false); 
                    buttonsPressed++; 
                } 
                else if(e.getSource()==button[20]) 
                { 
                    button[20].setBackground(Color.YELLOW); 
                    button[20].setText("Your Case!"); 
                    button[20].setEnabled(false); 
                    buttonsPressed++; 
                } 
                else if(e.getSource()==button[21]) 
                { 
                    button[21].setBackground(Color.YELLOW); 
                    button[21].setText("Your Case!"); 
                    button[21].setEnabled(false); 
                    buttonsPressed++; 
                } 
                else if(e.getSource()==button[22]) 
                { 
                    button[22].setBackground(Color.YELLOW); 
                    button[22].setText("Your Case!"); 
                    button[22].setEnabled(false); 
                    buttonsPressed++; 
                } 
                else if(e.getSource()==button[23]) 
                { 
                    button[23].setBackground(Color.YELLOW); 
                    button[23].setText("Your Case!"); 
                    button[23].setEnabled(false); 
                    buttonsPressed++; 
                } 
                else if(e.getSource()==button[24]) 
                { 
                    button[24].setBackground(Color.YELLOW); 
                    button[24].setText("Your Case!"); 
                    button[24].setEnabled(false); 
                    buttonsPressed++; 
                } 
                else if(e.getSource()==button[25]) 
                { 
                    button[25].setBackground(Color.YELLOW); 
                    button[25].setText("Your Case!"); 
                    button[25].setEnabled(false); 
                    buttonsPressed++; 
                } 
                 
            } 
            else 
            { 
                if(e.getSource()==button[0]) 
                { 
                    int ran; 
                    do  
                    { 
                        ran = (int)(Math.random()*amounts.length); 
                        button[0].setText(amounts[ran]); 
                    }  
                    while(amounts[ran].equals("0")); 
                    amounts[ran] = "0"; 
                    button[0].setEnabled(false); 
                    buttonsPressed++; 
                    System.out.println("Hi"); 
                    if(buttonsPressed == 7 || buttonsPressed== 12 ||buttonsPressed== 16 ||buttonsPressed== 19 ||buttonsPressed== 21 ||buttonsPressed== 22 ||buttonsPressed== 23 || buttonsPressed==24 || buttonsPressed==25) 
                    { 
                        double total = 0; 
                        for(int i = 0; i < amounts.length; i++) 
                        { 
                            if(!amounts[i].equals("0")) { 
                                total = total + Double.parseDouble(amounts[i].substring(1).replace(",","")); 
                            } 
                        } 
                        String[] buttons = { "Accept", "Decline" }; 
                        int returnValue = JOptionPane.showOptionDialog(null, "Banker's offer: $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100, "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                        System.out.println(returnValue); 
                        if(returnValue == 0) 
                        { 
                            JOptionPane.showMessageDialog(null,"You won $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100); 
                            JOptionPane.showMessageDialog(null,"Your case had " +s); 
                            System.exit(0); 
                             
                        } 
                         
                    } 
                     
                     
                } 
                else if(e.getSource()==button[1]) 
                { 
                    int ran; 
                    do  
                    { 
                        ran = (int)(Math.random()*amounts.length); 
                        button[1].setText(amounts[ran]); 
                    }  
                    while(amounts[ran].equals("0")); 
                    amounts[ran] = "0"; 
                    button[1].setEnabled(false); 
                    buttonsPressed++;  
                     
                    if(buttonsPressed == 7 || buttonsPressed== 12 ||buttonsPressed== 16 ||buttonsPressed== 19 ||buttonsPressed== 21 ||buttonsPressed== 22 ||buttonsPressed== 23 || buttonsPressed==24 || buttonsPressed==25) 
                    { 
                        double total = 0; 
                        for(int i = 0; i < amounts.length; i++) 
                        { 
                            if(!amounts[i].equals("0")) { 
                                total = total + Double.parseDouble(amounts[i].substring(1).replace(",","")); 
                            } 
                        } 
                         
                        String[] buttons = { "Accept", "Decline" }; 
                        int returnValue = JOptionPane.showOptionDialog(null, "Banker's offer: $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100, "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                        System.out.println(returnValue); 
                        if(returnValue == 0) 
                        { 
                            JOptionPane.showMessageDialog(null,"You won $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100); 
                            JOptionPane.showMessageDialog(null,"Your case had " +s); 
                            System.exit(0); 
                             
                        } 
                         
                    } 
                } 
                else if(e.getSource()==button[2]) 
                { 
                    int ran; 
                    do  
                    { 
                        ran = (int)(Math.random()*amounts.length); 
                        button[2].setText(amounts[ran]); 
                    }  
                    while(amounts[ran].equals("0")); 
                    amounts[ran] = "0"; 
                    button[2].setEnabled(false); 
                    buttonsPressed++;  
                     
                    if(buttonsPressed == 7 || buttonsPressed== 12 ||buttonsPressed== 16 ||buttonsPressed== 19 ||buttonsPressed== 21 ||buttonsPressed== 22 ||buttonsPressed== 23 || buttonsPressed==24 || buttonsPressed==25) 
                    { 
                        double total = 0; 
                        for(int i = 0; i < amounts.length; i++) 
                        { 
                            if(!amounts[i].equals("0")) { 
                                total = total + Double.parseDouble(amounts[i].substring(1).replace(",","")); 
                            } 
                        } 
                        String[] buttons = { "Accept", "Decline" }; 
                        int returnValue = JOptionPane.showOptionDialog(null, "Banker's offer: $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100, "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                        System.out.println(returnValue); 
                        if(returnValue == 0) 
                        { 
                            JOptionPane.showMessageDialog(null,"You won $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100); 
                            JOptionPane.showMessageDialog(null,"Your case had " +s); 
                            System.exit(0); 
                             
                        } 
                         
                    } 
                } 
                else if(e.getSource()==button[3]) 
                { 
                    int ran; 
                    do  
                    { 
                        ran = (int)(Math.random()*amounts.length); 
                        button[3].setText(amounts[ran]); 
                    }  
                    while(amounts[ran].equals("0")); 
                    amounts[ran] = "0"; 
                    button[3].setEnabled(false); 
                    buttonsPressed++;  
                     
                    if(buttonsPressed == 7 || buttonsPressed== 12 ||buttonsPressed== 16 ||buttonsPressed== 19 ||buttonsPressed== 21 ||buttonsPressed== 22 ||buttonsPressed== 23 || buttonsPressed==24 || buttonsPressed==25) 
                    { 
                        double total = 0; 
                        for(int i = 0; i < amounts.length; i++) 
                        { 
                            if(!amounts[i].equals("0")) { 
                                total = total + Double.parseDouble(amounts[i].substring(1).replace(",","")); 
                            } 
                        } 
                        String[] buttons = { "Accept", "Decline" }; 
                        int returnValue = JOptionPane.showOptionDialog(null, "Banker's offer: $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100, "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                        System.out.println(returnValue); 
                        if(returnValue == 0) 
                        { 
                            JOptionPane.showMessageDialog(null,"You won $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100); 
                            JOptionPane.showMessageDialog(null,"Your case had " +s); 
                            System.exit(0); 
                             
                        } 
                         
                    } 
                } 
                else if(e.getSource()==button[4]) 
                { 
                    int ran; 
                    do  
                    { 
                        ran = (int)(Math.random()*amounts.length); 
                        button[4].setText(amounts[ran]); 
                    }  
                    while(amounts[ran].equals("0")); 
                    amounts[ran] = "0"; 
                    button[4].setEnabled(false); 
                    buttonsPressed++;  
                     
                    if(buttonsPressed == 7 || buttonsPressed== 12 ||buttonsPressed== 16 ||buttonsPressed== 19 ||buttonsPressed== 21 ||buttonsPressed== 22 ||buttonsPressed== 23 || buttonsPressed==24|| buttonsPressed==25) 
                    { 
                        double total = 0; 
                        for(int i = 0; i < amounts.length; i++) 
                        { 
                            if(!amounts[i].equals("0")) { 
                                total = total + Double.parseDouble(amounts[i].substring(1).replace(",","")); 
                            } 
                        } 
                        String[] buttons = { "Accept", "Decline" }; 
                        int returnValue = JOptionPane.showOptionDialog(null, "Banker's offer: $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100, "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                        System.out.println(returnValue); 
                        if(returnValue == 0) 
                        { 
                            JOptionPane.showMessageDialog(null,"You won $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100); 
                            JOptionPane.showMessageDialog(null,"Your case had " +s); 
                            System.exit(0); 
                             
                        } 
                    } 
                } 
                else if(e.getSource()==button[5]) 
                { 
                    int ran; 
                    do  
                    { 
                        ran = (int)(Math.random()*amounts.length); 
                        button[5].setText(amounts[ran]); 
                    }  
                    while(amounts[ran].equals("0")); 
                    amounts[ran] = "0"; 
                    button[5].setEnabled(false); 
                    buttonsPressed++;  
                     
                    if(buttonsPressed == 7 || buttonsPressed== 12 ||buttonsPressed== 16 ||buttonsPressed== 19 ||buttonsPressed== 21 ||buttonsPressed== 22 ||buttonsPressed== 23 || buttonsPressed==24|| buttonsPressed==25) 
                    { 
                        double total = 0; 
                        for(int i = 0; i < amounts.length; i++) 
                        { 
                            if(!amounts[i].equals("0")) { 
                                total = total + Double.parseDouble(amounts[i].substring(1).replace(",","")); 
                            } 
                        } 
                        String[] buttons = { "Accept", "Decline" }; 
                        int returnValue = JOptionPane.showOptionDialog(null, "Banker's offer: $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100, "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                        System.out.println(returnValue); 
                        if(returnValue == 0) 
                        { 
                            JOptionPane.showMessageDialog(null,"You won $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100); 
                            JOptionPane.showMessageDialog(null,"Your case had " +s); 
                            System.exit(0); 
                             
                        } 
                    } 
                } 
                else if(e.getSource()==button[6]) 
                { 
                    int ran; 
                    do  
                    { 
                        ran = (int)(Math.random()*amounts.length); 
                        button[6].setText(amounts[ran]); 
                    }  
                    while(amounts[ran].equals("0")); 
                    amounts[ran] = "0"; 
                    button[6].setEnabled(false); 
                    buttonsPressed++; 
                     
                    if(buttonsPressed == 7 || buttonsPressed== 12 ||buttonsPressed== 16 ||buttonsPressed== 19 ||buttonsPressed== 21 ||buttonsPressed== 22 ||buttonsPressed== 23 || buttonsPressed==24|| buttonsPressed==25) 
                    { 
                        double total = 0; 
                        for(int i = 0; i < amounts.length; i++) 
                        { 
                            if(!amounts[i].equals("0")) { 
                                total = total + Double.parseDouble(amounts[i].substring(1).replace(",","")); 
                            } 
                        } 
                        String[] buttons = { "Accept", "Decline" }; 
                        int returnValue = JOptionPane.showOptionDialog(null, "Banker's offer: $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100, "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                        System.out.println(returnValue); 
                        if(returnValue == 0) 
                        { 
                            JOptionPane.showMessageDialog(null,"You won $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100); 
                            JOptionPane.showMessageDialog(null,"Your case had " +s); 
                            System.exit(0); 
                             
                        } 
                         
                    } 
                } 
                else if(e.getSource()==button[7]) 
                { 
                    int ran; 
                    do  
                    { 
                        ran = (int)(Math.random()*amounts.length); 
                        button[7].setText(amounts[ran]); 
                    }  
                    while(amounts[ran].equals("0")); 
                    amounts[ran] = "0"; 
                    button[7].setEnabled(false); 
                    buttonsPressed++;  
                     
                    if(buttonsPressed == 7 || buttonsPressed== 12 ||buttonsPressed== 16 ||buttonsPressed== 19 ||buttonsPressed== 21 ||buttonsPressed== 22 ||buttonsPressed== 23 || buttonsPressed==24|| buttonsPressed==25) 
                    { 
                        double total = 0; 
                        for(int i = 0; i < amounts.length; i++) 
                        { 
                            if(!amounts[i].equals("0")) { 
                                total = total + Double.parseDouble(amounts[i].substring(1).replace(",","")); 
                            } 
                        } 
                        String[] buttons = { "Accept", "Decline" }; 
                        int returnValue = JOptionPane.showOptionDialog(null, "Banker's offer: $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100, "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                        System.out.println(returnValue); 
                        if(returnValue == 0) 
                        { 
                            JOptionPane.showMessageDialog(null,"You won $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100); 
                            JOptionPane.showMessageDialog(null,"Your case had " +s); 
                            System.exit(0); 
                             
                        } 
                         
                    } 
                } 
                else if(e.getSource()==button[8]) 
                { 
                    int ran; 
                    do  
                    { 
                        ran = (int)(Math.random()*amounts.length); 
                        button[8].setText(amounts[ran]); 
                    }  
                    while(amounts[ran].equals("0")); 
                    amounts[ran] = "0"; 
                    button[8].setEnabled(false); 
                    buttonsPressed++;  
                    if(buttonsPressed == 7 || buttonsPressed== 12 ||buttonsPressed== 16 ||buttonsPressed== 19 ||buttonsPressed== 21 ||buttonsPressed== 22 ||buttonsPressed== 23 || buttonsPressed==24|| buttonsPressed==25) 
                    { 
                        double total = 0; 
                        for(int i = 0; i < amounts.length; i++) 
                        { 
                            if(!amounts[i].equals("0")) { 
                                total = total + Double.parseDouble(amounts[i].substring(1).replace(",","")); 
                            } 
                        } 
                        String[] buttons = { "Accept", "Decline" }; 
                        int returnValue = JOptionPane.showOptionDialog(null, "Banker's offer: $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100, "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                        System.out.println(returnValue); 
                        if(returnValue == 0) 
                        { 
                            JOptionPane.showMessageDialog(null,"You won $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100); 
                            JOptionPane.showMessageDialog(null,"Your case had " +s); 
                            System.exit(0); 
                             
                        } 
                         
                    } 
                } 
                else if(e.getSource()==button[9]) 
                { 
                    int ran; 
                    do  
                    { 
                        ran = (int)(Math.random()*amounts.length); 
                        button[9].setText(amounts[ran]); 
                    }  
                    while(amounts[ran].equals("0")); 
                    amounts[ran] = "0"; 
                    button[9].setEnabled(false); 
                    buttonsPressed++;  
                     
                    if(buttonsPressed == 7 || buttonsPressed== 12 ||buttonsPressed== 16 ||buttonsPressed== 19 ||buttonsPressed== 21 ||buttonsPressed== 22 ||buttonsPressed== 23 || buttonsPressed==24|| buttonsPressed==25) 
                    { 
                        double total = 0; 
                        for(int i = 0; i < amounts.length; i++) 
                        { 
                            if(!amounts[i].equals("0")) { 
                                total = total + Double.parseDouble(amounts[i].substring(1).replace(",","")); 
                            } 
                        } 
                        String[] buttons = { "Accept", "Decline" }; 
                        int returnValue = JOptionPane.showOptionDialog(null, "Banker's offer: $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100, "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                        System.out.println(returnValue); 
                        if(returnValue == 0) 
                        { 
                            JOptionPane.showMessageDialog(null,"You won $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100); 
                            JOptionPane.showMessageDialog(null,"Your case had " +s); 
                            System.exit(0); 
                             
                        } 
                         
                    } 
                } 
                else if(e.getSource()==button[10]) 
                { 
                    int ran; 
                    do  
                    { 
                        ran = (int)(Math.random()*amounts.length); 
                        button[10].setText(amounts[ran]); 
                    }  
                    while(amounts[ran].equals("0")); 
                    amounts[ran] = "0"; 
                    button[10].setEnabled(false); 
                    buttonsPressed++;  
                     
                    if(buttonsPressed == 7 || buttonsPressed== 12 ||buttonsPressed== 16 ||buttonsPressed== 19 ||buttonsPressed== 21 ||buttonsPressed== 22 ||buttonsPressed== 23 || buttonsPressed==24|| buttonsPressed==25) 
                    { 
                        double total = 0; 
                        for(int i = 0; i < amounts.length; i++) 
                        { 
                            if(!amounts[i].equals("0")) { 
                                total = total + Double.parseDouble(amounts[i].substring(1).replace(",","")); 
                            } 
                        } 
                        String[] buttons = { "Accept", "Decline" }; 
                        int returnValue = JOptionPane.showOptionDialog(null, "Banker's offer: $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100, "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                        System.out.println(returnValue); 
                        if(returnValue == 0) 
                        { 
                            JOptionPane.showMessageDialog(null,"You won $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100); 
                            JOptionPane.showMessageDialog(null,"Your case had " +s); 
                            System.exit(0); 
                             
                        } 
                         
                    } 
                } 
                else if(e.getSource()==button[11]) 
                { 
                    int ran; 
                    do  
                    { 
                        ran = (int)(Math.random()*amounts.length); 
                        button[11].setText(amounts[ran]); 
                    }  
                    while(amounts[ran].equals("0")); 
                    amounts[ran] = "0"; 
                    button[11].setEnabled(false); 
                    buttonsPressed++;  
                     
                    if(buttonsPressed == 7 || buttonsPressed== 12 ||buttonsPressed== 16 ||buttonsPressed== 19 ||buttonsPressed== 21 ||buttonsPressed== 22 ||buttonsPressed== 23 || buttonsPressed==24|| buttonsPressed==25) 
                    { 
                        double total = 0; 
                        for(int i = 0; i < amounts.length; i++) 
                        { 
                            if(!amounts[i].equals("0")) { 
                                total = total + Double.parseDouble(amounts[i].substring(1).replace(",","")); 
                            } 
                        } 
                        String[] buttons = { "Accept", "Decline" }; 
                        int returnValue = JOptionPane.showOptionDialog(null, "Banker's offer: $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100, "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                        System.out.println(returnValue); 
                        if(returnValue == 0) 
                        { 
                            JOptionPane.showMessageDialog(null,"You won $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100); 
                            JOptionPane.showMessageDialog(null,"Your case had " +s); 
                            System.exit(0); 
                             
                        } 
                         
                    } 
                } 
                else if(e.getSource()==button[12]) 
                { 
                    int ran; 
                    do  
                    { 
                        ran = (int)(Math.random()*amounts.length); 
                        button[12].setText(amounts[ran]); 
                    }  
                    while(amounts[ran].equals("0")); 
                    amounts[ran] = "0"; 
                    button[12].setEnabled(false); 
                    buttonsPressed++; 
                     
                    if(buttonsPressed == 7 || buttonsPressed== 12 ||buttonsPressed== 16 ||buttonsPressed== 19 ||buttonsPressed== 21 ||buttonsPressed== 22 ||buttonsPressed== 23 || buttonsPressed==24|| buttonsPressed==25) 
                    { 
                        double total = 0; 
                        for(int i = 0; i < amounts.length; i++) 
                        { 
                            if(!amounts[i].equals("0")) { 
                                total = total + Double.parseDouble(amounts[i].substring(1).replace(",","")); 
                            } 
                        } 
                        String[] buttons = { "Accept", "Decline" }; 
                        int returnValue = JOptionPane.showOptionDialog(null, "Banker's offer: $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100, "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                        System.out.println(returnValue); 
                        if(returnValue == 0) 
                        { 
                            JOptionPane.showMessageDialog(null,"You won $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100); 
                            JOptionPane.showMessageDialog(null,"Your case had " +s); 
                            System.exit(0); 
                             
                        } 
                         
                    } 
                     
                } 
                else if(e.getSource()==button[13]) 
                { 
                    int ran; 
                    do  
                    { 
                        ran = (int)(Math.random()*amounts.length); 
                        button[13].setText(amounts[ran]); 
                    }  
                    while(amounts[ran].equals("0")); 
                    amounts[ran] = "0"; 
                    button[13].setEnabled(false); 
                    buttonsPressed++;  
                     
                    if(buttonsPressed == 7 || buttonsPressed== 12 ||buttonsPressed== 16 ||buttonsPressed== 19 ||buttonsPressed== 21 ||buttonsPressed== 22 ||buttonsPressed== 23 || buttonsPressed==24|| buttonsPressed==25) 
                    { 
                        double total = 0; 
                        for(int i = 0; i < amounts.length; i++) 
                        { 
                            if(!amounts[i].equals("0")) { 
                                total = total + Double.parseDouble(amounts[i].substring(1).replace(",","")); 
                            } 
                        } 
                        String[] buttons = { "Accept", "Decline" }; 
                        int returnValue = JOptionPane.showOptionDialog(null, "Banker's offer: $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100, "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                        System.out.println(returnValue); 
                        if(returnValue == 0) 
                        { 
                            JOptionPane.showMessageDialog(null,"You won $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100); 
                            JOptionPane.showMessageDialog(null,"Your case had " +s); 
                            System.exit(0); 
                             
                        } 
                         
                    } 
                } 
                else if(e.getSource()==button[14]) 
                { 
                    int ran; 
                    do  
                    { 
                        ran = (int)(Math.random()*amounts.length); 
                        button[14].setText(amounts[ran]); 
                    }  
                    while(amounts[ran].equals("0")); 
                    amounts[ran] = "0"; 
                    button[14].setEnabled(false); 
                    buttonsPressed++;  
                     
                    if(buttonsPressed == 7 || buttonsPressed== 12 ||buttonsPressed== 16 ||buttonsPressed== 19 ||buttonsPressed== 21 ||buttonsPressed== 22 ||buttonsPressed== 23 || buttonsPressed==24|| buttonsPressed==25) 
                    { 
                        double total = 0; 
                        for(int i = 0; i < amounts.length; i++) 
                        { 
                            if(!amounts[i].equals("0")) { 
                                total = total + Double.parseDouble(amounts[i].substring(1).replace(",","")); 
                            } 
                        } 
                        String[] buttons = { "Accept", "Decline" }; 
                        int returnValue = JOptionPane.showOptionDialog(null, "Banker's offer: $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100, "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                        System.out.println(returnValue); 
                        if(returnValue == 0) 
                        { 
                            JOptionPane.showMessageDialog(null,"You won $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100); 
                            JOptionPane.showMessageDialog(null,"Your case had " +s); 
                            System.exit(0); 
                             
                        } 
                         
                    } 
                } 
                else if(e.getSource()==button[15]) 
                { 
                    int ran; 
                    do  
                    { 
                        ran = (int)(Math.random()*amounts.length); 
                        button[15].setText(amounts[ran]); 
                    }  
                    while(amounts[ran].equals("0")); 
                    amounts[ran] = "0"; 
                    button[15].setEnabled(false); 
                    buttonsPressed++;  
                     
                    if(buttonsPressed == 7 || buttonsPressed== 12 ||buttonsPressed== 16 ||buttonsPressed== 19 ||buttonsPressed== 21 ||buttonsPressed== 22 ||buttonsPressed== 23 || buttonsPressed==24|| buttonsPressed==25) 
                    { 
                        double total = 0; 
                        for(int i = 0; i < amounts.length; i++) 
                        { 
                            if(!amounts[i].equals("0")) { 
                                total = total + Double.parseDouble(amounts[i].substring(1).replace(",","")); 
                            } 
                        } 
                        String[] buttons = { "Accept", "Decline" }; 
                        int returnValue = JOptionPane.showOptionDialog(null, "Banker's offer: $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100, "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                        System.out.println(returnValue); 
                        if(returnValue == 0) 
                        { 
                            JOptionPane.showMessageDialog(null,"You won $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100); 
                            JOptionPane.showMessageDialog(null,"Your case had " +s); 
                            System.exit(0); 
                             
                        } 
                         
                    } 
                     
                     
                } 
                else if(e.getSource()==button[16]) 
                { 
                    int ran; 
                    do  
                    { 
                        ran = (int)(Math.random()*amounts.length); 
                        button[16].setText(amounts[ran]); 
                    }  
                    while(amounts[ran].equals("0")); 
                    amounts[ran] = "0"; 
                    button[16].setEnabled(false); 
                    buttonsPressed++; 
                     
                    if(buttonsPressed == 7 || buttonsPressed== 12 ||buttonsPressed== 16 ||buttonsPressed== 19 ||buttonsPressed== 21 ||buttonsPressed== 22 ||buttonsPressed== 23 || buttonsPressed==24|| buttonsPressed==25) 
                    { 
                        double total = 0; 
                        for(int i = 0; i < amounts.length; i++) 
                        { 
                            if(!amounts[i].equals("0")) { 
                                total = total + Double.parseDouble(amounts[i].substring(1).replace(",","")); 
                            } 
                        } 
                        String[] buttons = { "Accept", "Decline" }; 
                        int returnValue = JOptionPane.showOptionDialog(null, "Banker's offer: $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100, "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                        System.out.println(returnValue); 
                        if(returnValue == 0) 
                        { 
                            JOptionPane.showMessageDialog(null,"You won $"+(total/(25-buttonsPressed))*.25); 
                            JOptionPane.showMessageDialog(null,"Your case had " +s); 
                            System.exit(0); 
                             
                        } 
                         
                    } 
                } 
                else if(e.getSource()==button[17]) 
                { 
                    int ran; 
                    do  
                    { 
                        ran = (int)(Math.random()*amounts.length); 
                        button[17].setText(amounts[ran]); 
                    }  
                    while(amounts[ran].equals("0")); 
                    amounts[ran] = "0"; 
                    button[17].setEnabled(false); 
                    buttonsPressed++;  
                     
                    if(buttonsPressed == 7 || buttonsPressed== 12 ||buttonsPressed== 16 ||buttonsPressed== 19 ||buttonsPressed== 21 ||buttonsPressed== 22 ||buttonsPressed== 23 || buttonsPressed==24|| buttonsPressed==25) 
                    { 
                        double total = 0; 
                        for(int i = 0; i < amounts.length; i++) 
                        { 
                            if(!amounts[i].equals("0")) { 
                                total = total + Double.parseDouble(amounts[i].substring(1).replace(",","")); 
                            } 
                        } 
                        String[] buttons = { "Accept", "Decline" }; 
                        int returnValue = JOptionPane.showOptionDialog(null, "Banker's offer: $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100, "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                        System.out.println(returnValue); 
                        if(returnValue == 0) 
                        { 
                            JOptionPane.showMessageDialog(null,"You won $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100); 
                            JOptionPane.showMessageDialog(null,"Your case had " +s); 
                            System.exit(0); 
                             
                        } 
                         
                    } 
                     
                } 
                else if(e.getSource()==button[18]) 
                { 
                    int ran; 
                    do  
                    { 
                        ran = (int)(Math.random()*amounts.length); 
                        button[18].setText(amounts[ran]); 
                    }  
                    while(amounts[ran].equals("0")); 
                    amounts[ran] = "0"; 
                    button[18].setEnabled(false); 
                    buttonsPressed++;  
                     
                    if(buttonsPressed == 7 || buttonsPressed== 12 ||buttonsPressed== 16 ||buttonsPressed== 19 ||buttonsPressed== 21 ||buttonsPressed== 22 ||buttonsPressed== 23 || buttonsPressed==24|| buttonsPressed==25) 
                    { 
                        double total = 0; 
                        for(int i = 0; i < amounts.length; i++) 
                        { 
                            if(!amounts[i].equals("0")) { 
                                total = total + Double.parseDouble(amounts[i].substring(1).replace(",","")); 
                            } 
                        } 
                        String[] buttons = { "Accept", "Decline" }; 
                        int returnValue = JOptionPane.showOptionDialog(null, "Banker's offer: $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100, "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                        System.out.println(returnValue); 
                        if(returnValue == 0) 
                        { 
                            JOptionPane.showMessageDialog(null,"You won $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100); 
                            JOptionPane.showMessageDialog(null,"Your case had " +s); 
                            System.exit(0); 
                             
                        } 
                         
                    } 
                } 
                else if(e.getSource()==button[19]) 
                { 
                    int ran; 
                    do  
                    { 
                        ran = (int)(Math.random()*amounts.length); 
                        button[19].setText(amounts[ran]); 
                    }  
                    while(amounts[ran].equals("0")); 
                    amounts[ran] = "0"; 
                    button[19].setEnabled(false); 
                    buttonsPressed++;  
                    if(buttonsPressed == 7 || buttonsPressed== 12 ||buttonsPressed== 16 ||buttonsPressed== 19 ||buttonsPressed== 21 ||buttonsPressed== 22 ||buttonsPressed== 23 || buttonsPressed==24|| buttonsPressed==25) 
                    { 
                        double total = 0; 
                        for(int i = 0; i < amounts.length; i++) 
                        { 
                            if(!amounts[i].equals("0")) { 
                                total = total + Double.parseDouble(amounts[i].substring(1).replace(",","")); 
                            } 
                        } 
                        String[] buttons = { "Accept", "Decline" }; 
                        int returnValue = JOptionPane.showOptionDialog(null, "Banker's offer: $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100, "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                        System.out.println(returnValue); 
                        if(returnValue == 0) 
                        { 
                            JOptionPane.showMessageDialog(null,"You won $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100); 
                            JOptionPane.showMessageDialog(null,"Your case had " +s); 
                            System.exit(0); 
                             
                        } 
                         
                    } 
                } 
                else if(e.getSource()==button[20]) 
                { 
                    int ran; 
                    do  
                    { 
                        ran = (int)(Math.random()*amounts.length); 
                        button[20].setText(amounts[ran]); 
                    }  
                    while(amounts[ran].equals("0")); 
                    amounts[ran] = "0"; 
                    button[20].setEnabled(false); 
                    buttonsPressed++; 
                     
                    if(buttonsPressed == 7 || buttonsPressed== 12 ||buttonsPressed== 16 ||buttonsPressed== 19 ||buttonsPressed== 21 ||buttonsPressed== 22 ||buttonsPressed== 23 || buttonsPressed==24|| buttonsPressed==25) 
                    { 
                        double total = 0; 
                        for(int i = 0; i < amounts.length; i++) 
                        { 
                            if(!amounts[i].equals("0")) { 
                                total = total + Double.parseDouble(amounts[i].substring(1).replace(",","")); 
                            } 
                        } 
                        String[] buttons = { "Accept", "Decline" }; 
                        int returnValue = JOptionPane.showOptionDialog(null, "Banker's offer: $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100, "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                        System.out.println(returnValue); 
                        if(returnValue == 0) 
                        { 
                            JOptionPane.showMessageDialog(null,"You won $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100); 
                            JOptionPane.showMessageDialog(null,"Your case had " +s); 
                            System.exit(0); 
                             
                        } 
                         
                    } 
                } 
                else if(e.getSource()==button[21]) 
                { 
                    int ran; 
                    do  
                    { 
                        ran = (int)(Math.random()*amounts.length); 
                        button[21].setText(amounts[ran]); 
                    }  
                    while(amounts[ran].equals("0")); 
                    amounts[ran] = "0"; 
                    button[21].setEnabled(false); 
                    buttonsPressed++;  
                     
                    if(buttonsPressed == 7 || buttonsPressed== 12 ||buttonsPressed== 16 ||buttonsPressed== 19 ||buttonsPressed== 21 ||buttonsPressed== 22 ||buttonsPressed== 23 || buttonsPressed==24|| buttonsPressed==25) 
                    { 
                        double total = 0; 
                        for(int i = 0; i < amounts.length; i++) 
                        { 
                            if(!amounts[i].equals("0")) { 
                                total = total + Double.parseDouble(amounts[i].substring(1).replace(",","")); 
                            } 
                        } 
                        String[] buttons = { "Accept", "Decline" }; 
                        int returnValue = JOptionPane.showOptionDialog(null, "Banker's offer: $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100, "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                        System.out.println(returnValue); 
                        if(returnValue == 0) 
                        { 
                            JOptionPane.showMessageDialog(null,"You won $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100); 
                            JOptionPane.showMessageDialog(null,"Your case had " +s); 
                            System.exit(0); 
                             
                        } 
                         
                    } 
                } 
                else if(e.getSource()==button[22]) 
                { 
                    int ran; 
                    do  
                    { 
                        ran = (int)(Math.random()*amounts.length); 
                        button[22].setText(amounts[ran]); 
                    }  
                    while(amounts[ran].equals("0")); 
                    amounts[ran] = "0"; 
                    button[22].setEnabled(false); 
                    buttonsPressed++;  
                     
                    if(buttonsPressed == 7 || buttonsPressed== 12 ||buttonsPressed== 16 ||buttonsPressed== 19 ||buttonsPressed== 21 ||buttonsPressed== 22 ||buttonsPressed== 23 || buttonsPressed==24|| buttonsPressed==25) 
                    { 
                        double total = 0; 
                        for(int i = 0; i < amounts.length; i++) 
                        { 
                            if(!amounts[i].equals("0")) { 
                                total = total + Double.parseDouble(amounts[i].substring(1).replace(",","")); 
                            } 
                        } 
                        String[] buttons = { "Accept", "Decline" }; 
                        int returnValue = JOptionPane.showOptionDialog(null, "Banker's offer: $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100, "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                        System.out.println(returnValue); 
                        if(returnValue == 0) 
                        { 
                            JOptionPane.showMessageDialog(null,"You won $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100); 
                            JOptionPane.showMessageDialog(null,"Your case had " +s); 
                            System.exit(0); 
                             
                        } 
                         
                    } 
                } 
                else if(e.getSource()==button[23]) 
                { 
                    int ran; 
                    do  
                    { 
                        ran = (int)(Math.random()*amounts.length); 
                        button[23].setText(amounts[ran]); 
                    }  
                    while(amounts[ran].equals("0")); 
                    amounts[ran] = "0"; 
                    button[23].setEnabled(false); 
                    buttonsPressed++;  
                     
                    if(buttonsPressed == 7 || buttonsPressed== 12 ||buttonsPressed== 16 ||buttonsPressed== 19 ||buttonsPressed== 21 ||buttonsPressed== 22 ||buttonsPressed== 23 || buttonsPressed==24|| buttonsPressed==25) 
                    { 
                        double total = 0; 
                        for(int i = 0; i < amounts.length; i++) 
                        { 
                            if(!amounts[i].equals("0")) { 
                                total = total + Double.parseDouble(amounts[i].substring(1).replace(",","")); 
                            } 
                        } 
                        String[] buttons = { "Accept", "Decline" }; 
                        int returnValue = JOptionPane.showOptionDialog(null, "Banker's offer: $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100, "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                        System.out.println(returnValue); 
                        if(returnValue == 0) 
                        { 
                            JOptionPane.showMessageDialog(null,"You won $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100); 
                            JOptionPane.showMessageDialog(null,"Your case had " +s); 
                            System.exit(0); 
                             
                        } 
                         
                    } 
                } 
                else if(e.getSource()==button[24]) 
                { 
                    int ran; 
                    do  
                    { 
                        ran = (int)(Math.random()*amounts.length); 
                        button[24].setText(amounts[ran]); 
                    }  
                    while(amounts[ran].equals("0")); 
                    amounts[ran] = "0"; 
                    button[24].setEnabled(false); 
                    buttonsPressed++;  
                    if(buttonsPressed == 7 || buttonsPressed== 12 ||buttonsPressed== 16 ||buttonsPressed== 19 ||buttonsPressed== 21 ||buttonsPressed== 22 ||buttonsPressed== 23 || buttonsPressed==24|| buttonsPressed==25) 
                    { 
                        double total = 0; 
                        for(int i = 0; i < amounts.length; i++) 
                        { 
                            if(!amounts[i].equals("0")) { 
                                total = total + Double.parseDouble(amounts[i].substring(1).replace(",","")); 
                            } 
                        } 
                        String[] buttons = { "Accept", "Decline" }; 
                        int returnValue = JOptionPane.showOptionDialog(null, "Banker's offer: $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100, "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                        System.out.println(returnValue); 
                        if(returnValue == 0) 
                        { 
                            JOptionPane.showMessageDialog(null,"You won $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100); 
                            JOptionPane.showMessageDialog(null,"Your case had " +s); 
                            System.exit(0); 
                             
                        } 
                         
                    } 
                } 
                else if(e.getSource()==button[25]) 
                { 
                    int ran; 
                    do  
                    { 
                        ran = (int)(Math.random()*amounts.length); 
                        button[25].setText(amounts[ran]); 
                    }  
                    while(amounts[ran].equals("0")); 
                    amounts[ran] = "0"; 
                    button[25].setEnabled(false); 
                    buttonsPressed++;  
                     
                    if(buttonsPressed == 7 || buttonsPressed== 12 ||buttonsPressed== 16 ||buttonsPressed== 19 ||buttonsPressed== 21 ||buttonsPressed== 22 ||buttonsPressed== 23 || buttonsPressed==24|| buttonsPressed==25) 
                    { 
                        double total = 0; 
                        for(int i = 0; i < amounts.length; i++) 
                        { 
                            if(!amounts[i].equals("0")) { 
                                total = total + Double.parseDouble(amounts[i].substring(1).replace(",","")); 
                            } 
                        } 
                        String[] buttons = { "Accept", "Decline" }; 
                        int returnValue = JOptionPane.showOptionDialog(null, "Banker's offer: $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100, "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                        System.out.println(returnValue); 
                        if(returnValue == 0) 
                        { 
                            JOptionPane.showMessageDialog(null,"You won $"+(double)Math.round(((total/(26-buttonsPressed))*.25)*100)/100); 
                            JOptionPane.showMessageDialog(null,"Your case had " +s); 
                            System.exit(0); 
                             
                        } 
                         
                    } 
                } 
                if(buttonsPressed==25) 
                { 
                    double total = 0; 
                    int ran; 
                    String[] buttons = { "Accept", "Decline" }; 
                    int returnValue = JOptionPane.showOptionDialog(null, "Would you like to switch your case?", "Keep Playing?", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]); 
                    System.out.println(returnValue); 
                    if(returnValue == 0) 
                    {   
                        JOptionPane.showMessageDialog(null,"You won "+s); 
                        System.exit(0); 
                    } 
                    else 
                    { 
                        JOptionPane.showMessageDialog(null,"Your case had " +s); 
                        System.exit(0); 
                    } 
                     
                } 
            } 
             
             
            if(buttonsPressed==26) 
            { 
                System.out.println(myCase); 
                JOptionPane.showMessageDialog(null,"Your case had " +s); 
                 
            }                                  
        } 
    } 
     
     
    public static void main(String[] args) 
    {     
        JFrame frame= new Deal(); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setVisible(true); 
        JOptionPane.showMessageDialog(null,"Select a suitcase. This will be YOUR suitcase."); 
         
    } 
}