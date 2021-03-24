//Bryan Boyle, Alexander Montano, Jared Rostkowski 
import java.util.*; 
public class Decode 
{ 
 
    public void translate(String message) 
    { 
        String code = "harambe"; 
        int length = code.length(); 
         
        for(int i = 0; i<message.length();i++) 
        { 
             
            int ascii = message.charAt(i); 
            int asciit = (code.charAt(i%code.length()))-'a'; 
            int finalc = ascii - asciit; 
             
            
             
            if(finalc > 122) 
            { 
                finalc = finalc -26; 
                char character = (char)finalc; 
                System.out.print(character); 
                 
            } 
              else if(finalc<97) 
            { 
                finalc = finalc + 26; 
                char character = (char)finalc; 
                System.out.print(character); 
            } 
            else  
            { 
                char character2 = (char)finalc; 
                System.out.print(character2); 
               
            } 
        } 
        
          
    } 
    public static void main (String args []) 
     { 
          Scanner input = new Scanner(System.in); 
          System.out.print("Enter an encrypted message on one line: "); 
          String message = input.nextLine(); 
          Decode c = new Decode(); 
          c.translate(message); 
    } 
}