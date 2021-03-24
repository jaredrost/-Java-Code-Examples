import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Framer
{
   public static void main(String[] args)
  {
     Scanner input = new Scanner(System.in);
     System.out.print("How many rectangles: ");
     int num = input.nextInt();

    JFrame f = new JFrame();
    f.setBounds(0,0,300,300);     // you figure that out

    JPanel p = new TunnelVision(num);
    f.add(p);  // add panel to center of frame

    f.setVisible(true);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
}