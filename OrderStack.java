//Jared Rostkowski, Bryan Boyle, Patrick Doherty
import java.util.*; 
public class OrderStack 
{ 
    private Stack<Integer>b; 
     
    public static void order(Stack<Integer>s) 
    { 
       
        Stack<Integer>b=new Stack<Integer>(100); 
        int temp=0; 
    
        b.push(s.pop()); 
        while (!s.empty()) 
       { 
             
               temp=s.pop(); 
               
                if(!b.empty()&&b.peek()>temp) 
                { 
                    b.push(temp); 
                     
                } 
                else 
                { 
                   while (!b.empty()&&b.peek()<temp) 
                   {     
                        s.push(b.pop()); 
                     
                   } 
                   b.push(temp); 
                }   
               
            } 
            while(!b.empty()) 
            { 
                s.push(b.pop()); 
                
                
            } 
          
        } 
 
     
     
    public static void main(String[] args) 
    { 
        Stack<Integer> s = new Stack<Integer>(100); 
        s.push(3); 
        s.push(7); 
        s.push(2); 
        s.push(1); 
        s.push(4); 
        s.push(6); 
        s.push(5); 
         
        order(s); 
        while(!s.empty()) 
            System.out.println(s.pop()); 
    } 
} 
