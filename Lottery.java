//Jared Rostkowski 
public class Lottery 
{ 
    public static void main(String[] args) 
    { 
    IntegerSet[] x = new IntegerSet[5]; 
    int []list = {1,4,7,11,12}; 
    x[0] = new IntegerSet(list,5); 
    int[]list1 = {2,3}; 
    x[1] = new IntegerSet(list1,2); 
    int[]list2 = {3,8,9,34}; 
    x[2] = new IntegerSet(list2,4); 
    IntegerSet temp = ((IntegerSet)x[0].merge(x[2])); 
    IntegerSet last = ((IntegerSet)temp.merge(x[1])); 
    last.printElements(); 
    System.out.println(); 
    System.out.println("You will need to pay " + last.size()+ " dollars"); 
    } 
} 
     
        
     
        