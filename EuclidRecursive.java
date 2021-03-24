//Bryan Boyle, Alexander Montano, Jared Rostkowski 
import java.util.*; 
public class EuclidRecursive 
{ 
    public int GCD(int a, int b) 
    { 
        if(b==0) 
        { 
            return a; 
        } 
        else if(b==1) 
        { 
            return 1; 
        } 
        
         
        return GCD(b,a%b); 
           
         
         
    } 
    public static void main(String args[]) 
    { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a: "); 
        int a = input.nextInt(); 
        System.out.print("Enter b: "); 
        int b = input.nextInt(); 
        EuclidRecursive c = new EuclidRecursive(); 
        System.out.println(c.GCD(a,b)); 
    } 
}