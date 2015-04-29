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
//This program prints out a zig zag pattern

public class zigzag{
    
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
    
        int nStars = -1;
        int counter = 1;
        String yes1 = new String ("y");
        String yes2 = new String ("Y");
        
        while(true) {
            //tell user to enter an int between 3 and 33
            System.out.print("Enter an int between 3 and 33: ");
            
            //check if input is an integer
            while(!scan.hasNextInt()) {
                //tell user to enter another value
                System.out.print("Invalid input. Enter an int between 3" +
                    " and 33: ");
                //scan for next input
                scan.next();
            }
            nStars = scan.nextInt();
            
            //check if input is an between 3 and 33
            while(nStars < 3 | nStars > 33) {
                //tell user to enter again
                if (nStars < 3 | nStars > 33) {
                System.out.print("Invalid input. Enter an int between 3 " +
                    "and 33: ");
                }
                //check if input is an integer    
                while(!scan.hasNextInt()) {
                    //tell user to enter another value
                    System.out.print("Invalid input. Enter an int between 3" +
                        " and 33: ");
                    //scan for next input
                    scan.next();
                }
                //initialize nStars to entered value
                nStars = scan.nextInt();
            } 
    
            //print pattern
            for(int i = 1; i <= nStars; i++) {
                //if i equals 1 or nStars, print a row of n stars
                if (i == 1 | i == nStars) {
                    //print out n stars
                    for (int j = 1; j <= nStars; j++) {
                        //print star
                        System.out.print("*");
                    }
                    //print line break
                    System.out.println();
                }
                //print inside pattern
                else {
                    //print out correct number of spaces
                    while(counter > 0) {
                        //print a space
                        System.out.print(" ");
                        //decrease the counter by one
                        counter--;
                    }
                    //print a star
                    System.out.print("*");
                    //if counter equals zero
                    if (counter == 0) {
                        //set counter value equal to i
                        counter = i;
                    }
                    //print a line break
                    System.out.println();
                }
            } 
            
            
            System.out.print("Enter y or Y to go again: ");
                String answer = scan.next();
           
            if (answer.equals(yes1) | answer.equals(yes2)) {
                //reset counter
                counter = 1;
                //print line break
                System.out.println();
             
                continue;
            }
            //if not yes
            else {
                //print line break
                System.out.println();
                //end loop
                break;
            }
            
        } 
        
    } 
    
} 