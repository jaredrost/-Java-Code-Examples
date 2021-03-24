//Jared Rostkowski //TA helped 
import java.util.*;
import java.io.*;
public class Soccer
{
  public static void main(String[] args) throws IOException
  {
    File soccer = new File("soccer.txt");
    if(!soccer.exists())
    {
      System.out.println("File does not exist");
      System.exit(0);
    }
     Scanner input = new Scanner(soccer);
    
    File outputFile = new File ("results.txt");
    PrintWriter pw = new PrintWriter(outputFile);
    
    int tigersWins = 0;
    int tigersLoses = 0;
    int panthersWins = 0;
    int panthersLoses = 0;
    int lionsWins = 0;
    int lionsLoses = 0;
    int skyWins = 0;
    int skyLoses = 0;
    
   String teams = input.nextLine();
    while(input.hasNext())
    {
    String team1 = input.next();
    int score1 = Integer.parseInt(input.next(),10);
    String team2 = input.next();
    int score2 = Integer.parseInt(input.next(),10);
    if(score1 < score2)
    {
      if(team2.equals("Tigers"))
        tigersWins++;
      else if(team2.equals("Panthers"))
        panthersWins++;
      else if(team2.equals("Lions"))
        lionsWins++;
      else if(team2.equals("Sky"))
        skyWins++;
      if(team1.equals("Tigers"))
        tigersLoses++;
      else if(team1.equals("Panthers"))
        panthersLoses++;
      else if(team1.equals("Lions"))
        lionsLoses++;
      else if(team1.equals("Sky"))
        skyLoses++;
    }
    else
    {
      if(team2.equals("Tigers"))
        tigersLoses++;
      else if(team2.equals("Panthers"))
        panthersLoses++;
      else if(team2.equals("Lions"))
        lionsLoses++;
      else if(team2.equals("Sky"))
        skyLoses++;
      if(team1.equals("Tigers"))
        tigersWins++;
      else if(team1.equals("Panthers"))
        panthersWins++;
      else if(team1.equals("Lions"))
        lionsWins++;
      else if(team1.equals("Sky"))
        skyWins++;
}
    
    
    
    }
    pw.write("Lions' wins: " + lionsWins + "    Lions' loses: " + lionsLoses);
    pw.write("                                                           Panthers' wins: " + panthersWins + "    Panthers' loses: " + panthersLoses);
    pw.write("                                                     Sky's wins: " + skyWins + "    Sky's loses: " + skyLoses);
    pw.write("                                                         Tigers' wins: " + tigersWins + "    Tigers' loses: " + tigersLoses);
    
    
    
    input.close();
    pw.close();
  }
}
  