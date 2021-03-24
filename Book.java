//Jared Rostkowski
import java.util.*;
public class Book extends Publication
{
  String author;
  
  public Book()
  {
    super();
    author = "";
  }
   public Book(String publisher,int pages,double price,String title,String author)
   {
      super(publisher,pages,price,title);
      this.author = author;
   }
   public String toString()
   {
      return "The publisher is " + publisher + " The number of pages is " + pages + " The price is " + price + " The title is " + title + " The author is " + author;
   }
}