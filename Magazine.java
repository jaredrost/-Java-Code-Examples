//Jared Rostkowski
import java.util.*;
public class Magazine extends Publication 
{
  String publicationUnit;
  
  public Magazine()
  {
    super();
    publicationUnit = "";
  }
   public Magazine(String publisher,int pages,double price,String title,String publicationUnit)
  {
     super(publisher,pages,price,title);
     this.publicationUnit = publicationUnit;
   }
   public String toString()
   {
      return "The publisher is " + publisher + " The number of pages is " + pages + " The price is " + price + " The title is " + title + " It is published " + publicationUnit;
   }
}
   
  