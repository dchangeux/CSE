////////////////////////////////////////////////////////////////////////////////
//Hw 06
//Danelia Changeux 
//CSE 002
//03/03/2015
import java.util.Scanner;
//This Program will generate and calculate factorials 
//first compile the program 
//      javac RunFactorial.java
//run the program 
//  java RunFactorial//

// define a class
public class RunFactorial{
    
//add main method required for every Java program 
public static void main( String[] args) {
       Scanner myScanner;     
        myScanner = new Scanner( System.in ); 
        //the folloowing are initialized counters
        int fact =0;
        int result = 1;
        int realfact = 0;
        System.out.println("Please enter an integer that is between 9 and 16: "); // asks the person to enter an integer between 9 and 16
    
        String input = myScanner.next();
        // the next two lines will check to see if a random word or letter is put then it is not an integer 
        char carlast = input.charAt(input.length()-1);
        if (carlast < '0' || carlast >'9'){
            System.out.println("Invalid Input, enter again!");
        
        }
        else{
            int integer = Integer.parseInt(input); //parseint will change the character into an integer and see if it is an integer
            if(integer > 16 || integer < 9){
                System.out.println("Invalid Input, enter again!");
                
            }
            else{
            fact+= Integer.parseInt(input); 
            realfact=fact;
             }
            
        }
    while( fact>= 1){
        result *= fact;
        fact--;
    }
    System.out.println("Input accepted "+realfact+"! = "+result);
        
}
}        
    