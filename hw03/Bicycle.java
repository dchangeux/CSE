///////////////////////////////////////////////////////////////////////////////
//Danelia Changeux
//hw 03 
//2-10-2015
//Bicycle Java Program 
//
import java.util.Scanner;
//first compile the program 
//    javac Bicycle.java 
//run the program 
//    java Bicycle//

//define a class
    public class Bicycle {
        
// add main method required for every Java program 
 public static void main(String[] args) {
    Scanner myScanner;     
    myScanner = new Scanner( System.in ); 
    // the following are conversions or information needed to soleve problem 
    double wheelDiameter=27.0;   
    double SecondsPerMinute=60; 
    double feetPerMile=5280; 
    double inchesPerFoot=12; 
    double PI=3.14159;  
    
    // print the numbers
    System.out.println("Enter the number of seconds (an integer > 0) : ");
        int nseconds = myScanner.nextInt();
    System.out.println("Enter the number of counts (an integer > 0) : ");
        int ncounts = myScanner.nextInt();
    //run the calculations 
        double Minutes = (nseconds/SecondsPerMinute);
        double Distance = (ncounts*wheelDiameter*PI/inchesPerFoot/feetPerMile);
        Distance*= 100;
        int DistanceAsInt = (int) Distance;
        Distance = DistanceAsInt*.01;
        
        double avemph = Distance/(Minutes/60);
    //print the following
        System.out.println("The distance was "+Distance+" and took " +Minutes+ " minutes");
        System.out.println("The average mph was " +avemph);
        
        }
    }