import java.util.*;
public class DoubleArray
{
  public int[]comb;
  public int[]code;
 public DoubleArray()
 {
    comb = new int[3];
    code = new int[2];
 }
 public static void printDoubleArray(DoubleArray a)
 {
   for(int i = 0; i < 3;i++)
   {
     System.out.print(a.comb[i] + "     ");
   }
   for(int j = 0; j < 2;j++)
   {
     System.out.print(a.code[j]);
   }
   System.out.println();
 }
   
}


  