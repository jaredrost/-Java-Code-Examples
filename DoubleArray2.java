import java.util.*;
public class DoubleArray2
{
  public int[]comb;
  public int[]code;
 public DoubleArray2()
 {
    comb = new int[5];
    code = new int[4];
 }
 public static void printsDoubleArray(DoubleArray2 a)
 {
   for(int i = 0; i < 5;i++)
   {
     System.out.print(a.comb[i] + "     ");
   }
   for(int j = 0; j < 4;j++)
   {
     System.out.print(a.code[j]);
   }
   System.out.println();
 }
   
}


  