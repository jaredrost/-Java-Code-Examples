//Jared Rostkowski
public class Movie extends Item 
{ 
    int minutes; 
    String rating; 
    String format; 
     
    public Movie() 
    { 
        super(); 
        minutes = 0; 
        rating = ""; 
        format = ""; 
    } 
     
    public Movie(int id, String title, double price, int status, String name, int minutes, String rating, String format) 
    { 
        super(id, title, price, status, name); 
        this.minutes = minutes; 
        this.rating = rating; 
        this.format = format; 
    } 
     
    public void display() 
    { 
        System.out.print("ID: " + id + "Title: " + title + "Price: " + price + "Status: " + status + "Name: " + name + "Length: " + minutes + "Rating: " + rating + "Format: " + format); 
    } 
} 
        