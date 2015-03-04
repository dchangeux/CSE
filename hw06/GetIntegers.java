////////////////////////////////////////////////////////////////////////////////
//Hw 06
//Danelia Changeux 
//CSE 002
//03/03/2015
//This Program will ask for five integer and make sure they are integers and then calculate the sum
import java.util.Scanner;

//first compile the program 
//      javac GetIntegers.java
//run the program 
//  java GetIntegers//

// define a class
public class GetIntegers{
    
//add main method required for every Java program 
    public static void main( String[] args) {
        Scanner myScanner;     
        myScanner = new Scanner( System.in ); 
        int total =0;
        System.out.println("Please enter 5 non-negative integers: ");
        for( int i=0; i<5; i++){
            String input = myScanner.next();
            char carlast = input.charAt(input.length()-1);
            if (carlast < '0' || carlast >'9'){
                System.out.println("Invalid Input, enter again");
                i--;
            }
            else{
                int integer = Integer.parseInt(input);
                if(integer<0){
                    System.out.println("Invalid Input, enter again");
                    i--;
                }
                else{
                total+= Integer.parseInt(input);
                 }
            }
        } 
        System.out.println("Sum is:" +total);
            
    }
}        
    
    
    
    
    