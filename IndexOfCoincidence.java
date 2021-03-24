//ALexander Montano,Bryan Boyle, Jared Rostkowiski 
import java.util.*; 
public class IndexOfCoincidence 
{ 
     public void translate(String message) 
    { 
        String code = "harambe"; 
        int length = code.length(); 
        String s = ""; 
        for(int i = 0; i<message.length();i++) 
        { 
             
            int ascii = message.charAt(i); 
            int asciit = (code.charAt(i%code.length()))-'a'; 
            int finalc = ascii + asciit; 
            
            
             
            if(finalc > 122) 
            { 
                finalc = finalc -26; 
                char character = (char)finalc; 
                //System.out.print(character); 
                s = s+character; 
                 
            } 
            else  
            { 
                char character2 = (char)finalc; 
                //System.out.print(character2); 
                s= s+character2; 
               
            } 
        } 
        //System.out.println(s); 
        for (int i=1;i<=50;i++) 
        { 
        rotate(s,i); 
        System.out.println(i); 
        } 
     } 
    public static void Coincidence(String original, String encoded) 
    { 
        double same=0.0; 
        for(int i=0;i<original.length();i++) 
        { 
            { 
                if(original.charAt(i)==encoded.charAt(i)) 
                { 
                    same++; 
                } 
            } 
        } 
        double percent=(double)(same/original.length())*100; 
        System.out.println("");   
        System.out.println(percent);  
    } 
     
    public static void rotate(String sentence, int num) 
    { 
        int length = sentence.length(); 
        String q = sentence.substring(0,length-num); 
        String t = sentence.substring(length-num); 
         
        String f = (t + q); 
        //sentence="abcde";      //used to test 
        //f="ebcad"; 
         
        Coincidence(sentence,f); 
    } 
    public static void main (String args []) 
    { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter an encrypted message on one line: "); 
        String sentence = input.nextLine(); 
        IndexOfCoincidence c = new IndexOfCoincidence(); 
        c.translate(sentence); 
    } 
} 
 
 
 
 
 
