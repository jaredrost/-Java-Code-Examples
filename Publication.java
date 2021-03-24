//Jared Rostkowski
import java.util.*;
public abstract class Publication
{
  String publisher;
  int pages;
  double price;
  String title;
  
  public Publication()
  {
    publisher = "";
    pages = 0;
    price = 0;
    title = "";
  }
  public Publication(String publisher,int pages,double price,String title)
  {
    this.publisher = publisher;
    this.pages = pages;
    this.price = price;
    this.title = title;
  }
  public String toString()
  {
    return "The publisher is " + publisher + " The number of pages is " + pages + " The price is " + price + " The title is " + title;
  }
}
  

  
  