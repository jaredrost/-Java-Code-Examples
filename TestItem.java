//Jared Rostkowski
import java.util.*; 
import java.io.*; 
 
public class TestItem 
{ 
    public static int size; 
    public static void checkOut(Item[] array) 
    { 
        Scanner input = new Scanner(System.in); 
        System.out.println("Please enter the ID number: "); 
        int idnum = input.nextInt(); 
        System.out.println("Enter renter's name: "); 
        String person = input.next(); 
        for(int i = 0; i< size; i++) 
        { 
            if(idnum == array[i].getId()) 
            { 
                if(array[i].getStatus() == 1) 
                { 
                    array[i].setStatus(0); 
                    System.out.println("You checked out " + array[i].getTitle()); 
                } 
                else 
                    System.out.println(array[i].getTitle() + " is already checked out.");       
            }    
        } 
    } 
    public static void checkIn(Item[] array) 
    { 
        Scanner input = new Scanner(System.in); 
        System.out.println("Please enter the ID number: "); 
        int idnum = input.nextInt(); 
        for(int i = 0; i < size; i++) 
        { 
            if(idnum == array[i].getId()) 
            { 
                if(array[i].getStatus() == 0) 
                { 
                    array[i].setStatus(1); 
                    System.out.println("You checked in " + array[i].getTitle()); 
                } 
                else 
                    System.out.println(array[i].getTitle() + " is already checked in."); 
            } 
        } 
    } 
    public static void idSearch(Item[] array) 
    { 
        Scanner input = new Scanner(System.in); 
        System.out.println("Please enter the ID number: "); 
        int idnum = input.nextInt(); 
        for(int i = 0; i< size; i++) 
        { 
            if(idnum == array[i].getId()) 
            { 
                if(array[i].getStatus() == 1) 
                { 
                    System.out.println(array[i].getTitle() + " is in stock"); 
                } 
                else 
                    System.out.println(array[i].getTitle() + " is not in stock"); 
            } 
        } 
    } 
    public static void titleSearch(Item[] array) 
    { 
        Scanner input = new Scanner(System.in); 
        System.out.println("Please enter the title: "); 
        String tit = input.next(); 
        for(int i = 0; i< size; i++) 
        { 
            if(tit.equals(array[i].getTitle())) 
            { 
                if(array[i].getStatus() == 1) 
                { 
                    System.out.println(array[i].getTitle() + " is in stock"); 
                } 
                else 
                    System.out.println(array[i].getTitle() + " is not in stock"); 
            } 
        } 
    } 
    public static void inventoryDisplay(Item[] array) 
    { 
        for(int i = 0; i< size; i++) 
        { 
            System.out.println(array[i].getTitle()); 
        } 
    } 
    public static void add(Item[] array) 
    { 
       Scanner input = new Scanner(System.in); 
       System.out.println("Please enter M for movie or G for Game: ");  
       String type = input.next(); 
       if(type.equals("M")) 
       { 
           System.out.println("Enter id: "); 
           int idd = input.nextInt(); 
           System.out.println("Enter Title with no spaces: "); 
           String t = input.next(); 
           System.out.println("Enter price: "); 
           double p = input.nextDouble(); 
           System.out.println("Enter status: "); 
           int s = input.nextInt(); 
           System.out.println("Enter name (last,first): "); 
           String n = input.next(); 
           System.out.println("Enter length in minutes: "); 
           int m = input.nextInt(); 
           System.out.println("Enter rating: "); 
           String r = input.next(); 
           System.out.println("Enter format: "); 
           String f = input.next(); 
            
           Movie movie = new Movie(idd,t,p,s,n,m,r,f); 
           array[size+1] = movie; 
           TestItem.size++; 
       } 
       else 
       { 
           System.out.println("Enter id: "); 
           int idd = input.nextInt(); 
           System.out.println("Enter Title with no spaces: "); 
           String t = input.next(); 
           System.out.println("Enter price: "); 
           double p = input.nextDouble(); 
           System.out.println("Enter status: "); 
           int s = input.nextInt(); 
           System.out.println("Enter name (last,first): "); 
           String n = input.next(); 
           System.out.println("Enter age recommendation: "); 
           int a = input.nextInt(); 
            
           Game game = new Game(idd,t,p,s,n,a); 
           array[size] = game; 
           TestItem.size++; 
       } 
    } 
    public static void delete(Item[] array) 
    { 
        Scanner input = new Scanner(System.in); 
        System.out.println("Please enter the ID number: "); 
        int idnum = input.nextInt(); 
        for(int i = 0; i < size; i++) 
        { 
        if(idnum == array[i].getId()) 
        { 
            for(int j = i; j < size; j++) 
            { 
                array[j] = array[j+1]; 
            } 
            array[size] = null; 
            TestItem.size--; 
        } 
        else 
            System.out.println("Id is not valid"); 
         
    } 
    } 
    public static void menu(Item[] array) 
    { 
        int num = 1; 
        while(num!=9) 
        { 
            Scanner input = new Scanner(System.in); 
             
            System.out.println("Press 1 to check out an item."); 
            System.out.println("Press 2 to check in an item."); 
            System.out.println("Press 3 to search by ID number."); 
            System.out.println("Press 4 to search by title."); 
            System.out.println("Press 5 to display the inventory."); 
            System.out.println("Press 6 to add to the inventory."); 
            System.out.println("Press 7 to delete an item from the inventory."); 
            System.out.println("Press 8 to display this menu again."); 
            System.out.println("Press 9 to exit."); 
            num = input.nextInt(); 
            if(num == 1) 
                checkOut(array); 
            else if(num == 2) 
                checkIn(array); 
            else if(num == 3) 
                idSearch(array); 
            else if(num == 4) 
                titleSearch(array); 
            else if(num == 5) 
                inventoryDisplay(array); 
            else if(num == 6) 
                add(array); 
            else if(num == 7) 
                delete(array); 
            else if(num == 8) 
                menu(array); 
        } 
    } 
     
    public static void main(String[] args) throws Exception 
    { 
        Item[] array = new Item[30]; 
        File file = new File("data.txt"); 
        if(!file.exists()) 
        { 
            System.out.println("File does not exist"); 
            System.exit(0); 
        } 
        Scanner input = new Scanner(file); 
        
        size = 0; 
        while(input.hasNext()) 
        { 
            String type = input.next(); 
            if(type.charAt(0) == 'G') 
            { 
                int id = input.nextInt(); 
                String title = input.next(); 
                Double price = input.nextDouble(); 
                int status = input.nextInt(); 
                String name = input.next(); 
                int age = input.nextInt(); 
                 
                array[size] = new Game(id, title, price, status, name, age); 
                size++; 
                 
            } 
            else 
            { 
                int id = input.nextInt(); 
                String title = input.next(); 
                double price = input.nextDouble(); 
                int status = input.nextInt(); 
                String name = input.next(); 
                int minutes = input.nextInt(); 
                String rating = input.next(); 
                String format = input.next(); 
                 
                array[size] = new Movie(id, title, price, status, name, minutes, rating, format); 
                size++; 
            } 
             
//            menu(array); 
//            System.out.println("Enter a number"); 
//            input = new Scanner(System.in); 
//            int num = input.nextInt(); 
            
             
        } 
        menu(array); 
        //System.out.println("Enter a number"); 
      //  input = new Scanner(System.in); 
       // int num = input.nextInt(); 
        input.close(); 
    }  
} 
   
        