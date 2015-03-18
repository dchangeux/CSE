////////////////////////////////////////////////////////////////////////////////
//Lab07-zigzag
//Danelia Changeux 
//CSE 002
//03/06/2015
//This Program will print out stars in a zig zag pattern
import java.util.Scanner;

//first compile the program 
//      javac zigzag.java
//run the program 
//  java zigzag

// define a class
public class zigzag{
    
//add main method required for every Java program 
    public static void main( String[] args) {
    Scanner myScanner;     
    myScanner = new Scanner( System.in ); 
    
    int nStars = 10;
    System.out.print("Please enter an int betweeen 3 and 33: ");
    for( nStars=0; nStars<10; nStars++){
    System.out.print('*');
    }
    
    int i= 0, j=0;
    system.out.println("");
    for(i = 0; i<10;i++){
        System.out.println("*");
        for(j=0;j>i;j++){
            System.out.println(" ");
            
    }
    }
    System.out.println(" ");
}