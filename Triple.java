public class Triple 
{ 
    int gcd; 
    int x; 
    int y; 
     
     
    public Triple() 
    {  
        this.gcd = 0; 
        this.x = 0;  
        this.y = 0; 
    } 
     
    public Triple(int gcd, int x, int y) 
    { 
        this.gcd = gcd; 
        this.x = x; 
        this.y = y; 
         
    } 
     
    public  void printTriple ()  
    {  
        System.out.println (gcd + ", " + x + ", " + y);  
    } 
    public int getY()
    { 
      return x;
    }
     
     
} 
 
 
