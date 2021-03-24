//Jared Rostkowski
import java.util.*;
import java.io.*;
public class Mouse
{
  public static void main(String[] args) throws IOException
  {
     File mazeFile = new File("maze.txt");
    if(!mazeFile.exists())
    {
      System.out.println("File does not exist");
      System.exit(0);
    }
     Scanner input = new Scanner(mazeFile);
     char maze[][] = new char[10][10];
     String line = "A";
     int y1 = 0;
     while(input.hasNext())
     {
       line = input.nextLine();
       for(int x = 0; x < line.length(); x++)
       {
         maze[y1][x] = line.charAt(x);
       }
       y1++;
     }

     Stack<Integer> s = new Stack<Integer>(100);
     Stack<Integer> y = new Stack<Integer>(100);
     for(int i = 0;i < 10; i++)
     {
       for(int j = 0; j < 10; j++)
           {
         if(maze[i][j] == 'm')
         {
           s.push(i);
           y.push(j);
         }

       }
     }
      boolean done = false;
     
     while( done == false)
     { 
    if(s.empty() == true && y.empty() == true)
        {
          System.out.println("No way out");
            System.exit(0);
        }
    
     int row = s.peek();
     int col = y.peek();
    
     
     if(maze[row][col] == 'e')
     {
       done = true;
     }
     else
     {
   
    
     if(maze[row-1][col] == '0' || maze[row-1][col] == 'e' )
     {
       s.push(row-1);
       y.push(col);
       maze[row][col] = 'x';
     }
     else if(maze[row][col - 1] == '0' || maze[row][col-1] == 'e' )
     {
       s.push(row);
       y.push(col-1);
       maze[row][col] = 'x';
     }
      else if(maze[row + 1][col] == '0' || maze[row+1][col] == 'e' )
     {
       s.push(row + 1);
       y.push(col);
       maze[row][col] = 'x';
     }
       else if(maze[row][col + 1] == '0' ||  maze[row][col+1] == 'e' )
     {
       s.push(row);
       y.push(col + 1);
       maze[row][col] = 'x';
     }
      else
      {
        if(s.empty() == true && y.empty() == true)
        {
          System.out.println("No way out");
            System.exit(0);
        }
        
        s.pop();
        y.pop();
        maze[row][col] = 'O';
        
      }
     }

     }
     for(int i = 0; i<10; i++)
     {
       for(int j = 0; j<10; j++)
       {
         System.out.print(maze[i][j]);
       }
       System.out.println();
     }
  }
}
        
      
      
     
       
         
  