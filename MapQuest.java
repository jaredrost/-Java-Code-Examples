//Jared Rostkowski
import java.util.*;  
import java.io.*;  
public class MapQuest  
{  
    
  String[] cities = new String[325];  
  Data[] graph = new Data[325];  
  Scanner input;  
  File file;  
  File file2;  
  Stack<String> stack = new Stack<String>();  
   
  public MapQuest() throws IOException  
  {  
    for(int i=0;i<325;i++)  
      graph[i]=new Data();  
      
    file = new File("cityNames.txt");  
    int count =0;  
      
    if(!file.exists())  
    {  
      System.out.println("cityNames.txt not found");  
      System.exit(0);  
    }  
      
    input = new Scanner(file);  
    String city="";  
    while(input.hasNext())  
    {  
      city = input.next();  
      cities[count]=city;  
      count++;  
    }   
      
    file2= new File("distances.txt");  
      
    if(file2.exists())  
    {  
      System.out.println("distances.txt not found");  
      System.exit(0);  
    }  
      
    String cityOne="";  
    String cityTwo="";  
    int distance=0;  
     
      
    input = new Scanner(file2);  
      
    while(input.hasNext())  
    {  
      cityOne = input.next();  
      cityTwo = input.next();  
      distance = input.nextInt();  
        
      int index = binarySearch(cityOne);  
      int index2 = binarySearch(cityTwo);  
        
      Edge edge = new Edge(index2,distance);  
      graph[index].addEdge(edge);  
      graph[index].cityNumber=index;  
        
      edge = new Edge(index,distance);  
      graph[index2].addEdge(edge);  
      graph[index2].cityNumber=index2;  
    }  
      
     
  }   
  public void printGraph()  
  {  
     Edge x = new Edge();  
      
     for(int i=0;i<325;i++)  
   {  
       x=graph[i].list;  
     System.out.print(cities[i] + "-->");  
     while(!(x==null))  
     {  
       System.out.print(cities[x.vertex] + "("+x.distance+") -->");  
      x=x.next;  
     }  
     System.out.println("End");  
   }  
  }  
  private class Data implements Comparable  
  {  
    int distanceToStart;  
    int parent;  
    int marker;  
    int cityNumber;  
    Edge list;  
      
    public Data()  
    {  
      distanceToStart=0;  
      parent=0;  
      marker=3;  
      cityNumber=0;  
      list=null;  
    }   
      public Data(int city)  
      {  
        distanceToStart=0;  
        parent=0;  
        marker=3;  
        cityNumber = city;  
        list = null;  
    }  
      
    public void addEdge(Edge edge)  
    {  
      if(list==null)  
      {  
        list = edge;  
      }  
      else  
      {  
        Edge x = list;  
        while(x.next!=null)  
        {  
          x=x.next;  
        }  
        x.next = edge;  
      }  
    }  
  public int getDistanceToStart()  
  {  
    return distanceToStart;  
  }  
  public int getMarker()  
  {  
    return marker;  
  }  
    public int compareTo(Object object)  
    {  
      if(((Data)object).getDistanceToStart() > getDistanceToStart())  
        return 1;  
      else if (((Data)object).getDistanceToStart() < getDistanceToStart())  
        return -1;  
      else  
        return 0;  
    }  
  }  
  private class Edge  
  {  
    int vertex;  
    int distance;  
    Edge next;  
      
    public Edge()  
    {  
      vertex=0;  
      distance=0;  
      next=null;  
    }  
    public Edge(int city, int distance)  
    {  
      vertex=city;  
      this.distance=distance;  
      next=null;  
    }  
  }  
  public  int binarySearch(String string)  
  {  
    int lower =0;  
    int upper=325;  
    int middle = (lower+upper)/2;  
      
    while(lower<=upper)  
    {  
      if(string.compareTo(cities[middle])>0)  
      {  
        lower = middle+1;  
      }  
      else if(string.compareTo(cities[middle])<0)  
      {  
        upper = middle-1;  
      }  
      else  
      {  
        return middle;  
      }  
      middle=(upper+lower)/2;  
    }  
   return middle;  
  }  
 public Stack findPath(int startIndex, int endIndex)  
 {  
     
     
       
   Data v = null;  
   Data w = null;  
   v = graph[startIndex];  
   v.parent = startIndex;  
   w = graph[endIndex];  
     
     
   v.marker=1;
     
   v.distanceToStart = 0; 
     
   for(int i=0;i<325;i++)
   {  
     if(graph[i]==v)  
     {  
     }                                 
     else  
     {  
       graph[i].marker=3;  
     }  
   }
    
   Data x = null;  
   x = v;  
     
   while(x!=w)  
   {  
      Data y = new Data();  
      Edge pointer = new Edge();  
      
      pointer = x.list;  
      
     while(!(pointer==null))  
     {  
        y=graph[pointer.vertex];  
          
     if(y.marker==2 && (x.distanceToStart + pointer.distance < y.distanceToStart))  
     {  
       y.parent = x.cityNumber;  
       y.distanceToStart = (x.distanceToStart + pointer.distance);  
     }  
      
     if(y.marker==3)  
     {  
       y.marker = 2;  
       y.parent = x.cityNumber;  
       y.distanceToStart = (x.distanceToStart + pointer.distance);  
     }  
       
       
     pointer=pointer.next;  
        
     }  
     int count=0;  
     Data temp = new Data();  
     temp.distanceToStart=10000000;  
     Stack<Data> stack = new Stack<Data>();  
     for(int k=0;k<325;k++)  
     {  
       if(graph[k].getMarker()==2)  
       {  
        if(graph[k].getDistanceToStart() < temp.getDistanceToStart())  
        {  
          temp=graph[k];  
        }  
       }  
     }  
     y=temp;  
      
    
       
     y.marker=1;  
       
       
    
    x=y;  
       
   }  
     
     
     
     

    
     

  Data temp = new Data();  
    
   while(x!=v)  
   {  
     temp = x;  
     x=graph[x.parent];  
       
     stack.push(cities[x.cityNumber] + " ---> " + cities[temp.cityNumber] + " " + getPartialMiles(x.cityNumber,temp.cityNumber));  
      
   }  
     
   return stack;  
   }  
 public int getPartialMiles(int start, int end)  
 {  
   Edge x = graph[start].list;  
     
   while(x.vertex != end)  
   {  
     x=x.next;  
   }  
   return x.distance;  
 }  
  public  int getTotalMiles(int endIndex)  
  {  
    return graph[endIndex].distanceToStart;  
  }  
  public static void main(String[] args) throws IOException  
  {  
    Scanner input = new Scanner(System.in);  
  
   MapQuest mapQuest = new MapQuest();  
     
   System.out.println("What city will you start from?");  
   String start = input.next();  
     
   System.out.println("What city will you end at?");  
   String end = input.next();  
     
 
    
  }  
}