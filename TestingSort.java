 public class TestingSort
 {
public static int[] doSelectionSort(int[] arr)
{ 
  for (int i = 0; i < arr.length - 1; i++) 
  { int index = i; 
    for (int j = i + 1; j < arr.length; j++) 
      if (arr[j] < arr[index]) 
      index = j; 
    int smallerNumber = arr[index]; 
    arr[index] = arr[i]; 
    arr[i] = smallerNumber; } 
  return arr; } 
public static void main(String[] args)
{
  int[] a = new int[10];
  a[0] = 10;
   a[1] = 24;
    a[2] = 3;
     a[3] = 55;
      a[4] = 43;
       a[5] = 67;
        a[6] = 14;
         a[7] = 98;
          a[8] = 58;
           a[9] = 33;
         doSelectionSort(a);
           
           for(int i = 0; i < 10; i++)
           {
             System.out.println(a[i]);
           }
}
    
    
  
  
  
  
  
  
  
  
  

 }