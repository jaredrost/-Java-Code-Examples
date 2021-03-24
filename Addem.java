//Patrick Doherty, Jared Rostkowski, Bryan Boyle 
import java.util.*; 
import java.io.*; 
public class Addem 
{ 
  public static void main(String[] args) 
  {    
 
    Addem a = new Addem(); 
     
    Scanner input = new Scanner (System.in); 
     
    System.out.print(" Enter the input  file name: "); 
     
    String inputFileName = input.next(); 
     
    System.out.print(" Enter the output  file name: "); 
     
    String outputFileName = input.next(); 
     
    a.add(inputFileName,outputFileName); 
     
  } 
   
  public void add(String inputFileName, String outputFileName) 
  { 
    Scanner input = null; 
    PrintWriter pw = null; 
     
    try // try block for scanner 
    {  
      //Create a Scanner that reads from inputfileName -- the Scanner has already been DECLARED 
      File f = new File (inputFileName); 
      input = new Scanner(f); 
       File g = new File (outputFileName); 
      pw = new PrintWriter(g); 
    } 
     
    catch( FileNotFoundException e) 
    { 
      //print a message to screen and exit 
      System.out.println("Bad file, can not be found"); 
      System.exit(0); 
       
    } 
     
    int lineNumber = 0; 
     
    while(input.hasNext()) 
    { 
      lineNumber++; 
        //read two strings 
        String name1 = input.next(); 
        String name2 = input.next(); 
         
        try  // try for parseInt 
      { 
        //make two ints and get sum and write out sum 
          int num = Integer.parseInt(name1); 
          int num1 = Integer.parseInt(name2); 
          pw.println(name1 + "+" + name2 + "=" + (num + num1));  
      } 
        catch(NumberFormatException e)  
        { 
         pw.println("Error on line" + lineNumber); 
        } 
    } 
    //close the Printwriter and the Scanner 
    input.close(); 
    pw.close(); 
  } 
   
} 
