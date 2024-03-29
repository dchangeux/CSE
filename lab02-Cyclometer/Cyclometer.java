///////////////////////////////////////////////////////////////////////////////
//Danelia Changeux
//Lab 02
//1-30-2015
//Cyclometer Java Program 
//
// first compile the program 
//     javac Cyclometer.java
// run the program 
//     java Cyclometer//

// define a class
public class Cyclometer{

// add main method required for every Java program 
 public static void main(String[] args) {
     int secsTrip1=480;  // number of seconds in trip one 
     int secsTrip2=3220;  // number of seconds in trip two 
     int countsTrip1=1561;  // number of counts in trip one 
     int countsTrip2=9037;  // number of counts in trip two 
     double wheelDiamter=27.0,  // makes the diameter of the wheel into a decimal  
     PI=3.14159,  // the value of PI 
     feetPerMile=5280,  // the amount of feet per mile 
     inchesPerFoot=12,  // the amount of inches per foot
     secondsPerMinute=60;  // the amount of seconds per minute 
     double distanceTrip1, distanceTrip2, totalDistance;  // makes the values of the distance of trip one, two and the total distance into decimals
// print the numbers stored in the variables that store the number of seconds and the counts 
   System.out.println("Trip 1 took "+
   (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+"counts.");
   System.out.println("Trip 2 took"+(secsTrip2/secondsPerMinute)+" minutes and had "+ 
   countsTrip2+" counts.");
   //run the following calculations 
   distanceTrip1=countsTrip1*wheelDiamter*PI;
   //above gives distance in inches
   //(for each count, a rotation of the wheel travels 
   //the diameter in inches times PI)
   distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
   distanceTrip2=countsTrip2*wheelDiamter*PI/inchesPerFoot/feetPerMile;
   totalDistance=distanceTrip1+distanceTrip2;
   System.out.println("Trip 1 was "+distanceTrip1+" miles");
   System.out.println("Trip 2 was "+distanceTrip2+" miles");
   System.out.println("The total distance was "+totalDistance+"miles");
  }
} 