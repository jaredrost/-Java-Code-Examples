//Bryan Boyle, Alexander Montano, Jared Rostkowski 
import java.util.*; 
public class Program7 
{ 
    public Triple GCD(int a, int b) 
    { 
         
        Triple n = new Triple(a,1,0); 
        if(b==0) 
        { 
             
            return n; 
        } 
        else 
        { 
           Triple t = GCD(b, a%b); 
           Triple tn = new Triple(t.gcd, t.y, t.x-(t.y*(a/b))); 
       
           return tn; 
        } 
 
    } 
    public static void main(String args[]) 
    { 
        Scanner input = new Scanner(System.in); 
        Program7 p7 =new Program7(); 
        System.out.print("Enter a: "); 
        int a = input.nextInt(); 
        System.out.print("Enter b: "); 
        int b = input.nextInt(); 
        Triple answer = p7.GCD(a,b); 
        answer.printTriple(); 
      
        
    } 
}