////////////////////////////////////////////////////////////////////////////////
//lab06-Smile Generator
//Danelia Changeux 
//CSE 002
//02/20/2015
//This Program will generate a random number of smiley faces 
//first compile the program 
//      javac SmileGenerator.java
//run the program 
//  java SmileGenerator//

// define a class
public class SmileGenerator{
    
//add main method required for every Java program 
public static void main( String[] args) {
    int s = 0;
    while (s < 5){
    System.out.print(":)");
    s++;
    }
    System.out.println();
    
    double sa = ((double)(Math.random()*99) +1);
    while (sa < 100){
    System.out.print(":)");
    sa++;
    
    }
    System.out.println();
    
     
    double sb =((double)(Math.random()*+ 29)+1);
    while (sb < 30){
    System.out.print(":)");
    sb++;
    }
    System.out.println();
    
    }
}   
    