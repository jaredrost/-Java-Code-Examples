//Jared Rostkowski
import java.util.*; 
import java.io.*; 
public class Grid 
{ 
   
     
    public static int doGrid( String maze[][], int i,int j) 
    { 
         
    
        if(maze[i][j].equals("b")) 
            return 0; 
         
       
        else 
        { 
            maze[i][j]="b"; 
            return (1+(doGrid(maze,i+1,j)+doGrid(maze,i-1,j)+doGrid(maze,i,j+1)+doGrid(maze,i,j-1))); 
             
        } 
    }
     public static void main(String []args) throws IOException 
    { 
         
       
        File gFile = new File("grid.txt"); 
        if(!gFile.exists()) 
        { 
            System.out.println("File does not exist"); 
            System.exit(0); 
        } 
         
      
        Scanner input = new Scanner(gFile); 
        String maze[][] = new String[10][10]; 
        int size=maze[0].length; 
        int num=0; 
         
       
        while(input.hasNext()) 
        { 
            for(int i=0;i<size;i++) 
            { 
                for(int j=0;j<size;j++) 
                { 
                    maze[i][j]=input.next(); 
                } 
            } 
        } 
         
 
        for(int row=0;row<size;row++) 
        { 
            for(int col=0;col<size;col++) 
            { 
                num= doGrid(maze,row,col); 
                 
                if(num>0) 
                    System.out.println("White area contains: "+num+ " cells"); 
            } 
        } 
         
    } 
    
    
    
    
    
    
    
    
    
    
} 
 
