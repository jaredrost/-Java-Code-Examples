//Jared Rostkowski
import java.util.*;
import java.io.*;
public class Jack
{
  public static void printState(int num)
  {
   if(num == 0)
     System.out.println("Minnesota");
    if(num == 1)
     System.out.println("Utah");
     if(num == 2)
     System.out.println("Nevada");
      if(num == 3)
     System.out.println("California");
      if(num == 4)
     System.out.println("NewMexico");
      if(num == 5)
     System.out.println("Arizona");
      if(num == 6)
     System.out.println("Texas");
      if(num == 7)
     System.out.println("Colorado");
      if(num == 8)
     System.out.println("Oklahoma");
      if(num == 9)
     System.out.println("Kansas");
      if(num == 10)
     System.out.println("Oregon");
      if(num == 11)
     System.out.println("Washington");
      if(num == 12)
     System.out.println("SouthDakota");
      if(num == 13)
     System.out.println("Wyoming");
      if(num == 14)
     System.out.println("Idaho");
      if(num == 15)
     System.out.println("Nebraska");
      if(num == 16)
     System.out.println("Montana");
      if(num == 17)
     System.out.println("NorthDakota");
      if(num == 18)
     System.out.println("Illinois");
      if(num == 19)
     System.out.println("Kentucky");
      if(num == 20)
     System.out.println("Mississippi");
      if(num == 21)
     System.out.println("Louisiana");
      if(num == 22)
     System.out.println("Arkansas");
      if(num == 23)
     System.out.println("Missouri");
      if(num == 24)
     System.out.println("Tennessee");
      if(num == 25)
     System.out.println("Georgia");
      if(num == 26)
     System.out.println("Alabama");
      if(num == 27)
     System.out.println("Florida");
      if(num == 28)
     System.out.println("NorthCarolina");
      if(num == 29)
     System.out.println("SouthCarolina");
      if(num == 30)
     System.out.println("Virginia");
      if(num == 31)
     System.out.println("Pennsylvania");
      if(num == 32)
     System.out.println("Ohio");
      if(num == 33)
     System.out.println("Indiana");
      if(num == 34)
     System.out.println("WestVirginia");
      if(num == 35)
     System.out.println("Iowa");
      if(num == 36)
     System.out.println("Michigan");
      if(num == 37)
     System.out.println("Wisconsin");
      if(num == 38)
     System.out.println("DC");
      if(num == 39)
     System.out.println("Maryland");
      if(num == 40)
     System.out.println("NewYork");
      if(num == 41)
     System.out.println("Delaware");
      if(num == 42)
     System.out.println("NewJersey");
      if(num == 43)
     System.out.println("Vermont");
      if(num == 44)
     System.out.println("Connecticut");
      if(num == 45)
     System.out.println("Massachusetts");
      if(num == 46)
     System.out.println("NewHampshire");
      if(num == 47)
     System.out.println("Maine");
      if(num == 48)
     System.out.println("RhodeIsland");
                        
                        }
          
  
  public static void main(String[] args) throws IOException
  {
     File stateFile = new File("states.txt");
    if(!stateFile.exists())
    {
      System.out.println("File does not exist");
      System.exit(0);
    }
     Scanner input = new Scanner(stateFile);
     char[][] state = new char[49][49];
       
       String line = "A";
     int y1 = 0;
     while(input.hasNext())
     {
       line = input.nextLine();
       for(int x = 0; x < line.length(); x++)
       {
         state[y1][x] = line.charAt(x);
       }
       y1++;
     }
      Stack<Integer> s = new Stack<Integer>(48);
      
      s.push(47);
      for(int i = 0; i < 49; i++)
      {
        state[i][47] = '0';
      }
      
      while(s.empty() == false)
      {
        int current = s.peek();
        boolean flag = true;
       for(int i = 0; i < 49; i++)
       {
         if(state[current][i] == '1')
         { 
           for(int j = 0; j < 49; j++)
           {
     
           state[j][i] = '0';
             
         }
           printState(i);
           //System.out.println(i);
           s.push(i);
           flag = false;
           break;
         }
         
       }
       if(flag == true)
       {
         
         //System.out.println(s.peek());
       s.pop();
       }
      }
  }
}
      
           
       
      
          
      
      