//Bryan Boyle, Alexander Montano, Jared Rostkowski 
import java.util.*; 
public class EuclidIterative 
{ 
    public int GCD(int a, int b) 
    { 
        int newA; 
        while(b!=0) 
        { 
            newA = a % b; 
            a = b; 
            b = newA; 
        } 
        return a; 
         
         
    } 
    public static void main(String args[]) 
    { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a: "); 
        int a = input.nextInt(); 
        System.out.print("Enter b: "); 
        int b = input.nextInt(); 
        //
        EuclidIterative c = new EuclidIterative(); 
        //
        System.out.println(c.GCD(a,b)); 
    } 
}