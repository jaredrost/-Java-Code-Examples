//Jared Rostkowski
import java.io.*; 
public class FirstTree implements Serializable 
{ 
GuessNode root; 
 
public FirstTree() 
{  
root = new GuessNode("Is it a human?");  
root.yes = new GuessNode("Is it Tom Brady ");  
root.no = new GuessNode("Is it a giraffe ?"); 
 } 
public static void main(String[]args) throws IOException 
{ 
FirstTree root = new FirstTree(); 
ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("GuessingTree.dat")); 
output.writeObject(root); 
} 
} 
