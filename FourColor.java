//Jared Rostkowski
import java.util.*;
import java.io.*;
public class FourColor
{
private static final int[] color = {1,2,3,4};

//this color array is meant to represent 4 colors like red, blue, green, orange etc.

private static int[][] map = {{0,1,1,0,1,1,0},{1,0,0,1,1,0,1},{1,0,0,1,1,1,0},{0,1,1,0,1,0,1},{1,1,1,1,0,0,0},{1,0,1,0,0,0,1},{0,1,0,1,0,1,0}};
//this is the adjacency matrix showing which countries are next to each other

private static int[] countryColor = new int[7];
//this is the array that holds the color values for each country

private static boolean colorMap(int country ){
    System.out.println("Checking Country "+ country);
    boolean check;
        for(int j= 0;j< countryColor.length; j++){
            if(useColor(country,color[j]) == true)
                countryColor[country] = color[j];
            if(country == countryColor.length-1)
                return true;                       
            check = colorMap(country+1);
            System.out.println(check);
            if(check == true)
                return true;
            countryColor[country]=0;
        }   
    return false;
}

private static boolean useColor(int country, int color){
    for(int i = 0; i < map.length;i++){
        if(map[country][i] == 1&& countryColor[i]==color){
            System.out.println("Nah country " + country +" cant be "+color );
            return false;
        }
    }
    return true;
}
public static void main(String[] args)
{
  FourColor f = new FourColor();
}
}