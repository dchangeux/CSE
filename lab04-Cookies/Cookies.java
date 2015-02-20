//////////////////////////////////////////////////////////////////////////////
//Danelia Changeux
//lab04-Cookies
//2-11-2015
//Cookies Java Program 
//
import java.util.Scanner;
//first compile the program 
//      javac Cookies.java
//run the program 
//      java Cookies//

import java.util.Scanner;//define a class
public class Cookies{
        
// add main method required for every Java program
 public static void main(String[] args){
     Scanner myScanner = new Scanner (System.in);
        
        int npeople = myScanner.nextInt();
        
        if (myScanner.hasNextInt()){
        System.out.println("Enter the number of people: ");
         }
         
         if( npeople < 0) {
            System.out.println("You did not enter an int > 0");
            }
        
        else { 
            System.out.println("You did not enter an int ");
            }
        
        int ncookies = myScanner.nextInt();
        
        if (myScanner.hasNextInt()) {
        System.out.println("Enter the number of cookies you are planning to buy: ");
        }
        
         if( ncookies < 0) {
            System.out.println("You did not enter an int > 0");
           
            }
        else { 
            System.out.println("You did not enter an int ");
          
            }
        int nCOOKIES = myScanner.nextInt();
        
        if(myScanner.hasNextInt()){
        System.out.println("How many cookies do you want each person to get? ");
        }
         if( nCOOKIES < 0) {
            System.out.println("You did not enter an int > 0");
           
            }
        else { 
            System.out.println("You did not enter an int ");
          }
        int morecookies= (npeople*nCOOKIES)-ncookies;
        if(ncookies%npeople ==0 ){
        System.out.println("You have enough cookies for each person and the amount will divide evenly.");
         }
        if(ncookies%npeople!=0){
            System.out.println("You have enough but they will not divide evenly.");
        }
         else{
        System.out.println("You will not have enough cookies. You need to buy at least "+morecookies+" more.");
        }
        
        
    }
}