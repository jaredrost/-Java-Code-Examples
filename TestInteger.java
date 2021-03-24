//Jared Rostkowski 
public class TestInteger 
{ 
public static void main(String[] args) 
  { 
     int[] list = {1,2,3,4,5,5,5}; 
     IntegerSet s = new IntegerSet(list,7); 
     IntegerSet t = new IntegerSet();  //empty set 
 
     Object mergedSet; // a merged set, notice the type is Object 
 
     for (int i = 10; i >= 3; i--) 
          t.add(i); 
 
     System.out.println("The elements of set s are "); 
     s.printElements(); 
     System.out.println(); 
     System.out.println("The elements of set t are "); 
     t.printElements(); 
     System.out.println(); 
 
     mergedSet = s.merge(t); 
     System.out.println("The merged sets: "); 
     ((IntegerSet)mergedSet).printElements(); // notice the downcast 
 
     int [] list1 = {1,2,3,4,5}; 
     IntegerSet w = new IntegerSet(list1,5); 
     System.out.println("s equals w: " +s.equals(w)); 
     System.out.println("s equals t: " +s.equals(t)); 
} 
}