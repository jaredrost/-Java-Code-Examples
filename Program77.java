//Bryan Boyle, Alexander Montano, Jared Rostkowski 
import java.util.*; 
public class Program77 
{ 
    public Triple GCD7(int a, int b) 
    { 
         
        Triple n = new Triple(a,1,0); 
        if(b==0) 
        { 
             
            return n; 
        } 
        else 
        { 
           Triple t = GCD7(b, a%b); 
           Triple tn = new Triple(t.gcd, t.y, t.x-(t.y*(a/b))); 
         return t.y;
          
            
        } 
 
    } 
      
    public static void main(String args[]) 
    { 
        Scanner input = new Scanner(System.in); 
        Program77 p7 =new Program7(); 
        System.out.print("Enter a: "); 
        int a = input.nextInt(); 
        System.out.print("Enter b: "); 
        int b = input.nextInt(); 
        Triple answer = p7.GCD7(a,b); 
        answer.printTriple(); 
    } 
}