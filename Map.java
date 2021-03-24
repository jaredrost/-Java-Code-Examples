//Jared Rostkowski
import java.util.*; 
import java.io.*; 
public class Map  
{ 
    public static String states[][]= new String[49][49]; 
    public static  int colors[]= new int[49];  
    public static String names[]=new String[49]; 
     
    public static void main (String[] args) throws IOException 
    { 
        Map m=new Map(); 
        m.color(0);   
    } 
     
    public Map() throws IOException 
    { 
     
        File matrixFile=new File("matrix.txt"); 
        File statesFile=new File("states.txt"); 
         
  
        Scanner input=new Scanner(matrixFile); 
        Scanner input2=new Scanner(statesFile); 
        String zeros; 
        while(input.hasNext()) 
        { 
            for(int i=0;i<49;i++) 
            { 
              zeros = input.nextLine(); 
              for (int j = 0; j< 49; j++) 
                  states[i][j] = ""+zeros.charAt(j); 
            } 
       } 
         

        for(int i=0;i<49;i++) 
        { 
            colors[i]=-1; 
        } 
         
        
         
         
         
        while(input2.hasNext()) 
        { 
            for(int i=0;i<49;i++) 
            { 
                names[i]=input2.next(); 
                
                 
            } 
        } 
    } 
     
     
     public static boolean isSafe( int row,int color) 
    { 
         
         
        for(int col=0;col<49;col++) 
        { 
            if(states[row][col].equals("1") && colors[col] == color)
            { 
                return false; 
            } 
        } 
        return true; 
    } 
    
    
    
    public void color(int state) 
    { 
         
        if(state==49) 
        { 
            
            for(int i=0;i<49;i++) 
            {    
                System.out.print(names[i]+" "); 
                switch (colors[i])  
                { 
                case 0 : System.out.println("Red");break; 
                case 1 : System.out.println("Blue");break; 
                case 2 : System.out.println("Green");break; 
                case 3 : System.out.println("Yellow");break; 
                } 
            } 
            System.exit(0); 
        } 
        
        for(int color=0;color<4;color++) 
        { 
            if(isSafe(state,color)) 
            { 
                 
               colors[state]= color; 
               color(state+1); 
               colors[state]= -1; 
            } 
        } 
    }
}
     
     
     
   
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
