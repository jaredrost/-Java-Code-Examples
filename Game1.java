//Jared Rostkowski
public class Game1 extends Item 
{ 
    int age; 
     
    public Game1() 
    { 
        super(); 
        age = 0; 
    } 
     
    public Game1(int id, String title, double price, int status, String name, int age) 
    { 
        super(id, title, price, status, name); 
        this.age = age; 
    } 
     
    public void display() 
    { 
        System.out.println("ID: " + id + "Title: " + title + "Price: " + price + "Status: " + status + "Name: " + name + "Age: " + age); 
    } 
}