//Jared Rostkowski
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class TunnelVision1 extends JPanel
{
  Point a,b,c,d;
  int count;
  
  public TunnelVision1(int count)
  {
    a = new Point(0,0);
    b = new Point(0,200);
    c = new Point(200,200);
    d = new Point(200,0);
    this.count = count;
  }
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    draw(count, g);
  }
  void draw(int count, Graphics g)
  {
    g.drawRect(0,0,200,200);
      
    if(count == 0)
    {
    }
    else
    {

   
      
      Point mid1 = new Point(a.x,a.y);
      Point mid2 = new Point(b.x,b.y);
      Point mid3 = new Point(c.x,c.y);
      Point mid4 = new Point(d.x,d.y);
       g.drawLine(mid1.x,mid1.y,mid2.x,mid2.y);
       g.drawLine(mid2.x,mid2.y,mid3.x,mid3.y);
       g.drawLine(mid3.x,mid3.y,mid4.x,mid4.y);
       g.drawLine(mid4.x,mid4.y,mid1.x,mid1.y);
         a.x = (mid1.x + mid2.x)/2;       
         a.y = (mid1.y + mid2.y)/2;       
         b.x = (mid2.x + mid3.x)/2;       
         b.y = (mid2.y + mid3.y)/2;       
         c.x = (mid3.x + mid4.x)/2;      
         c.y = (mid3.y + mid4.y)/2;      
         d.x = (mid4.x + mid1.x)/2;      
         d.y = (mid4.y + mid1.y)/2; 
         count--;
         draw(count,g);
         

      
       
        
         
      
    }
  }
}
      
      
      
      
      