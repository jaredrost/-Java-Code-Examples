//Jared Rostkowski
import java.util.*;
import java.io.*;
public class TestPublication
{
  public static void main(String[] args) throws IOException
  {
    Publication[] p = new Publication[10];
    String[]x = new String[6];
    File file = new File("publications.txt");
    if(!file.exists())
    {
      System.out.println("File does not exist");
      System.exit(0);
    }
    Scanner input = new Scanner(file);
    
    while(input.hasNext())
    {
      int i = 0;
      String s = input.nextLine();
      String[]parts = s.split(" ");
      int w = Integer.parseInt(parts[0]);
     
        if(w == 1)
        {
          int d = Integer.parseInt(parts[2]);
          double q = Double.parseDouble(parts[3]);
          p[i] = new Book(parts[1],d,q, parts[4], parts[5]);
          System.out.println(p[i].toString());
        }
        
        else if(w == 2)
        {
          int a = Integer.parseInt(parts[2]);
          double b = Double.parseDouble(parts[3]);
          p[i] = new Magazine(parts[1],a,b, parts[4], parts[5]);
          System.out.println(p[i].toString());
        }
        
        else if(w == 3)
        {
          int c = Integer.parseInt(parts[2]);
          double e = Double.parseDouble(parts[3]);
          int f = Integer.parseInt(parts[5]);
          p[i] = new KidsMagazine(parts[1],c,e, parts[4],f);
          System.out.println(p[i].toString());
        }
        else
          System.out.println("Error");
        
        i++;
      }
     input.close();
    }

    
    
  }













