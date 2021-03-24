//Jared Rostkowski
public abstract class Item 
{ 
    int id; 
    String title; 
    double price; 
    int status; 
    String name; 
     
    public Item() 
    { 
        id = 0; 
        title = ""; 
        price = 0.0; 
        status = 0; 
        name = ""; 
    } 
     
    public Item(int id, String title, double price, int status, String name) 
    { 
        this.id = id; 
        this.title = title; 
        this.price = price; 
        this.status = status; 
        this.name = name; 
    } 
     
    public int getId() 
    { 
        return id; 
    } 
     
    public String getTitle() 
    { 
        return title; 
    } 
     
    public double getPrice() 
    { 
        return price; 
    } 
     
    public int getStatus() 
    { 
        return status; 
    } 
     
    public void setStatus(int s) 
    { 
        status = s;    
    } 
     
    public String getName() 
    { 
        return name; 
    } 
     
    public void display() 
    { 
        System.out.println("Not applicable."); 
    } 
} 
            