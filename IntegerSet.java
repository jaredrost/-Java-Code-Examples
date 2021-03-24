//Jared Rostkowski 
import java.util.*; 
public class IntegerSet implements Mergeable 
{    
    private int[] list; 
    private int size; 
     
    public IntegerSet() 
    { 
        list = new int[1000]; 
        size = 0; 
    } 
     
    public IntegerSet(int[] list, int size) 
    { 
         this.list = new int[1000]; 
         
        this.size = 0; 
   
      for(int i=0;i<size;i++) 
      { 
          if(!elementOf(list[i])) 
          { 
              add(list[i]); 
          } 
         
 
     
     
                             
                    
     
    } 
    } 
     
    public void printElements() 
    { 
        for(int i = 0; i<size; i++) 
        { 
            System.out.print(list[i]); 
        } 
    } 
     
    public int size() 
    { 
        return size; 
    } 
     
    public boolean elementOf(int x) 
    { 
         
        for(int i = 0; i<size; i++) 
        { 
            if(x == list[i]) 
                return true; 
     
        } 
        return false; 
    } 
     
    public void add(int x) 
   { 
//        boolean output = false; 
//        for(int i = 0; i<size; i++) 
//        { 
//            if(x == list[i]) 
//                output = true; 
//            else 
//                output = false; 
//        } 
//        if(output)  
//            list[size] = x; 
//        Selectionsort.selectionsort(list, size); 
        if(!elementOf(x)) 
    {  
        list[size]=x; 
        size++; 
        SelectionSort1.sort(list,size); 
    } 
    } 
 
         
     
     
    public boolean equals(Object o) 
    { 
        boolean answer = true; 
        for(int i = 0; i<((IntegerSet)o).size; i++) 
        { 
            if(list[i] == ((IntegerSet)o).list[i]) 
                answer = true; 
            else 
                answer = false; 
        } 
        return answer; 
    } 
     
    public int[] getArray() 
    { 
        return list; 
    } 
     
    public Object merge(Object o) 
    { 
         
        if(list.equals(((IntegerSet)o))) 
        { 
             
            return o; 
        } 
        else 
        { 
            for(int i = 0; i<((IntegerSet)o).size; i++) 
            { 
                if(!elementOf(((IntegerSet)o).list[i])) 
                { 
                    add(((IntegerSet)o).list[i]); 
                } 
            } 
            IntegerSet is = new IntegerSet(list, size); 
            return is; 
                        
        } 
    } 
} 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
