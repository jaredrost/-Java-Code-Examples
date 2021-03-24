//Jared Rostkowski
import java.util.*;
public class KidsMagazine extends Publication
{
  int recommendedAge;
  
  public KidsMagazine()
  {
    super();
    recommendedAge = 0;
  }
  public KidsMagazine(String publisher,int pages,double price,String title,int recommendedAge)
  {
    super(publisher,pages,price,title);
    this.recommendedAge = recommendedAge;
  }
  public String toString()
  {
    return "The publisher is " + publisher + " The number of pages is " + pages + " The price is " + price + " The title is " + title + " The recommended age is " + recommendedAge; 
  }
}
  
  