//Jared Rostkowski
import java.util.*; 
public class BinaryDigits 
{ 
    public static void bitChecker(String bits) 
    { 
         
        Stack s = new Stack(); 
        char zero = '0'; 
        for(int i = 0; i < bits.length(); i++) 
        { 
            if(bits.charAt(i)==zero) 
            { 
                s.push(bits.charAt(i)); 
            } 
            else if(s.empty()) 
            { 
                if(bits.charAt(i)=='0' || bits.charAt(i)=='1') 
                { 
                    zero = bits.charAt(i); 
                    s.push(zero); 
                } 
                else 
                { 
                    System.out.println("Not a 1 or a 0."); 
                    System.exit(0); 
                } 
            } 
            else 
            { 
                s.pop(); 
            } 
             
        } 
        int diff = s.size(); 
        if(diff == 0) 
        { 
            System.out.println("There is the same amount of 1's and 0's."); 
        } 
        else 
        System.out.println("There is a different number of 0's and 1's. " +s.size() + " additional " +zero + "'s."); 
         
    } 
     
    public static void main(String[] args) 
    { 
         
         
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a string of bits. Enter 11111 to exit: "); 
         
         
        String bits = input.nextLine(); 
        while (!bits.equals("11111")) 
        { 
           bitChecker(bits); 
            System.out.print("Enter a string of bits. Enter 11111 to exit: "); 
            bits = input.nextLine(); 
             
        } 
         
    } 
     
}