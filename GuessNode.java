//Jared Rostkowski
import java.io.*; 
import java.util.*; 
public class GuessNode implements Serializable 
{ 
String data; 
  GuessNode yes; 
  GuessNode no; 
 
  public GuessNode(String data) 
  { 
    this.data=data; 
  } 
} 
  