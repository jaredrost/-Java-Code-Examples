//Bryan Boyle, Alexander Montano, Jared Rostkowski 
import javax.swing.*; 
import java.awt.*; 
import java.util.*; 
public class JuliaSet extends JPanel 
{ 
    public Complex f(Complex z) 
    { 
        Complex c = new Complex(.81,-.32); 
        return (((((((((((z.mul(z)).mul(z)).mul(z)).mul(z)).mul(z)).mul(z)).mul(z)).mul(z)).mul(z)).mul(z)).add(c)); 
    } 
     
    public void paintComponent(Graphics g) 
    { 
       int count=0; 
         
        int gx = 0; 
        for(double x = -2  ; x < 2; x+=.005) 
        { 
            int gy = 0; 
            for(double y = 2; y>=-2; y-=.005) 
            { 
               // System.out.println(x); 
               // System.out.println(y); 
                Complex z = new Complex(x,y); 
                for(int i = 0; i < 50; i++) 
                { 
                    count = i; 
                     
                    z = f(z); 
                     
                    if(z.abs()>=2 ) break; 
                  
                }  
                //System.out.println(count); 
                float red =(count*6%630)/630.0f; 
                float green= (count*5%319)/319.0f;         // 53 44 39    11 20 9 
                float blue = (count*4%187)/187.0f; 
                 
                Color color = new Color(red, green, blue); 
                g.setColor(color); 
                g.drawRect(gx,gy,1,1); 
                gy++; 
                 
            } 
            gx++; 
        } 
        
       
             
             
    } 
    public static void main(String[] args) 
    { 
         JFrame f = new JFrame("Julia Set"); 
         f.setBounds(0,0, 800,800); 
         JuliaSet c = new JuliaSet(); 
         f.add(c); // add the panel to the frame 
         f.setVisible(true); 
} 
} 
