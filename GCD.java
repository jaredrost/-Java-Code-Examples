//Jared Rostkowski, Bryan Boyle, Zander Montano
import java.util.*;
public class GCD
{
public static void main(String[] args)
{
  System.out.println("Enter two numbers");
  Scanner input = new Scanner(System.in);
  int num1 = input.nextInt();
  int num2 = input.nextInt();
  long startTime = System.nanoTime();
  GCD g = new GCD();
  g.findGCD(num1,num2);
  long endTime = System.nanoTime();
  long duration = (endTime - startTime);
  System.out.print("The time is " + duration + " nanoseconds");
}
public static void findGCD(int num1, int num2)
{
  
  
  if(num1 > num2)
  {
    for(int i = num2; i > 0; i--)
    {
      if(num2%i == 0 && num1%i == 0)
      {
        System.out.println(i);
        break;
      }
  
}
}
  if(num2 > num1)
  {
    for(int i = num1; i > 0; i--)
    {
      if(num2%i == 0 && num1%i == 0)
      {
        System.out.println(i);
        break;
      }
  
}
}
}
}
    