///////////////////////////////////////////////////////////////////////////////
//Danelia Changeux
//hw05
//2-24-2015
//To Hex Java Program 
//
import java.util.Scanner;
//first compile the program 
//      javac ToHex.java
//run the program 
//      java ToHex//

public class ToHex{
        
// add main method required for every Java program
 public static void main(String[] args){
     Scanner myScanner = new Scanner (System.in);
     int R,G,B;
     
     // ask for user input 
     System.out.println("Please enter three numbers representing RGB values: ");
     R = myScanner.nextInt();
     G = myScanner.nextInt();
     B = myScanner.nextInt();
     
     // if input is less than 0 or greater than 255 print the following. 
     if(R<0 || R>255 || G<0 || G>255 || B<0 || G>255){
        System.out.println("Sorry, you must enter values between 0-255"); 
     }
     // if no error, continue with rest of program 
     else{
        //declare and initiate the following varibles for calculation/ conversion. 
     int RA, RB, GA, GB, BA, BB; 
     RA = R/16;     
     RB = R%16;
     GA = G/16;
     GB = G%16;
     BA = B/16;
     BB = B%16;
    
    //declare and initiate the following variables to be used later  
    String hexRA = "", hexGA = "", hexBA = "", hexRB = "", hexGB = "", hexBB = ""; 
    
    //Switch statements  
    switch(RA){
        case 0:
            hexRA = "0"; 
            break; 
        case 1: 
             hexRA = "1";
             break;
        case 2:
             hexRA = "2"; 
             break;
        case 3:
             hexRA = "3"; 
             break;
        case 4:
             hexRA = "4"; 
             break;
        case 5:
             hexRA = "5"; 
             break;
        case 6:
             hexRA = "6"; 
             break;
        case 7:
             hexRA = "7"; 
             break;
        case 8:
             hexRA = "8"; 
             break;
        case 9:
             hexRA = "9"; 
             break;
        case 10: 
             hexRA = "A"; 
             break; 
        case 11: 
            hexRA = "B"; 
            break; 
        case 12: 
            hexRA = "C"; 
            break; 
        case 13: 
            hexRA = "D"; 
            break; 
        case 14: 
            hexRA = "E"; 
            break; 
        case 15: 
            hexRA = "F"; 
            break; 
                                
     }
     
     switch(RB){
         case 0:
            hexRB = "0"; 
            break; 
        case 1: 
             hexRB = "1";
             break;
        case 2:
             hexRB = "2"; 
             break;
        case 3:
             hexRB = "3"; 
             break;
        case 4:
             hexRB = "4"; 
             break;
        case 5:
             hexRB = "5"; 
             break;
        case 6:
             hexRB = "6"; 
             break;
        case 7:
             hexRB = "7"; 
             break;
        case 8:
             hexRB = "8"; 
             break;
        case 9:
             hexRB = "9"; 
             break;
         case 10:
             hexRB = "A";
             break;
         case 11:
             hexRB = "B";
             break;
         case 12:
             hexRB = "C";
             break;
         case 13:
             hexRB = "D";
             break;
         case 14:
             hexRB = "E";
             break;
         case 15:
             hexRB = "F";
            break;
        
     }
    switch (GA){
        case 0:
            hexGA = "0"; 
            break; 
        case 1: 
             hexGA = "1";
             break;
        case 2:
             hexGA = "2"; 
             break;
        case 3:
             hexGA = "3"; 
             break;
        case 4:
             hexGA = "4"; 
             break;
        case 5:
             hexGA = "5"; 
             break;
        case 6:
             hexGA = "6"; 
             break;
        case 7:
             hexGA = "7"; 
             break;
        case 8:
             hexGA = "8"; 
             break;
        case 9:
             hexGA = "9"; 
             break;
        case 10:
             hexGA = "A";
             break;
         case 11:
             hexGA = "B";
             break;
         case 12:
             hexGA = "C";
             break;
         case 13:
             hexGA = "D";
             break;
         case 14:
             hexGA = "E";
             break;
         case 15:
             hexGA = "F";
            break;
    }
    switch(GB){
        case 0:
            hexGB = "0"; 
            break; 
        case 1: 
             hexGB = "1";
             break;
        case 2:
             hexGB = "2"; 
             break;
        case 3:
             hexGB = "3"; 
             break;
        case 4:
             hexGB = "4"; 
             break;
        case 5:
             hexGB = "5"; 
             break;
        case 6:
             hexGB = "6"; 
             break;
        case 7:
             hexGB = "7"; 
             break;
        case 8:
             hexGB = "8"; 
             break;
        case 9:
             hexGB = "9"; 
             break;
        case 10:
             hexGB = "A";
             break;
         case 11:
             hexGB = "B";
             break;
         case 12:
             hexGB = "C";
             break;
         case 13:
             hexGB = "D";
             break;
         case 14:
             hexGB = "E";
             break;
         case 15:
             hexGB = "F";
            break;
         
     }
     switch(BA){
         case 0:
            hexBA = "0"; 
            break; 
        case 1: 
             hexBA = "1";
             break;
        case 2:
             hexBA = "2"; 
             break;
        case 3:
             hexBA = "3"; 
             break;
        case 4:
             hexBA = "4"; 
             break;
        case 5:
             hexBA = "5"; 
             break;
        case 6:
             hexBA = "6"; 
             break;
        case 7:
             hexBA = "7"; 
             break;
        case 8:
             hexBA = "8"; 
             break;
        case 9:
             hexBA = "9"; 
             break;
        case 10:
             hexBA = "A";
             break;
         case 11:
             hexBA = "B";
             break;
         case 12:
             hexBA = "C";
             break;
         case 13:
             hexBA = "D";
             break;
         case 14:
             hexBA = "E";
             break;
         case 15:
             hexBA = "F";
            break;
     }
     switch(BB){
        case 0:
            hexBB = "0"; 
            break; 
        case 1: 
             hexBB = "1";
             break;
        case 2:
             hexBB = "2"; 
             break;
        case 3:
             hexBB = "3"; 
             break;
        case 4:
             hexBB = "4"; 
             break;
        case 5:
             hexBB = "5"; 
             break;
        case 6:
             hexBB = "6"; 
             break;
        case 7:
             hexBB = "7"; 
             break;
        case 8:
             hexBB = "8"; 
             break;
        case 9:
             hexBB = "9"; 
             break;
         case 10:
             hexBB = "A";
             break;
         case 11:
             hexBB = "B";
             break;
         case 12:
             hexBB = "C";
             break;
         case 13:
             hexBB = "D";
             break;
         case 14:
             hexBB = "E";
             break;
         case 15:
             hexBB = "F";
            break;
     }
     
    System.out.println("The decimal numbers R: " +R+"G: " +G+ "B: "+B+ " is represented by hexidecimal as: "+hexRA+hexRB+hexGA+hexGB+hexBA+hexBB);
     }
    }
}
        
        
        
        
        
        
        
        
        
        
    