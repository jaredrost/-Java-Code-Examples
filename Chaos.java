//Jared Rostkowski, Bryan Boyle, Patrick Doherty
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class Chaos extends JPanel
{
  
  private Point[] points;
  private Point mid,v,w;
  
  public Chaos(Point[] p)
  {
    points = p;
    mid = null;
    v = null;
    w = null;
  }
  public void paintComponent(Graphics g)
  {
    setBackground (Color.RED);
    g.setColor(Color.YELLOW);
    Random r = new Random();
    int rn = r.nextInt(3);
    w = points[rn];
    for (int i = 0; i <= 1000000; i++)
    {
      rn = r.nextInt(3);
      v = points[rn];
      int mx =(v.x + w.x)/2;
      int my = (v.y + w.y)/2;
      mid = new Point(mx,my);
      g.drawRect(mx,my,1,1);
       w = mid;
 
   
    }
  }
  public static void main(String[] args)
{

    JFrame f = new JFrame("Chaos"); // get a frame

     f.setBounds(0,0, 450,450);

    Point [] points = new Point[3]; // make an array of three points

    points [0] = new Point ( 210,10);

    points[1] = new Point ( 10,410);

    points [2] = new Point ( 410,410);

    Chaos c = new Chaos(points);        // the JPanel that you write

      f.add(c); // add the panel to the frame

      f.setVisible(true);

}
}
      