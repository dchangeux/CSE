///////////////////////////////////////////////////////////////////////////////
//lab 10
//Danelia Changeux 
//CSE 002
// This lab asks the user to enter the size of an array and then asks the user to fill the array with integers
import java.util.Scanner;
// first complie the program 
 //javac ArrayInputs.java
//Then run the program 
    // java ArrayInputs
    public class ArrayInputs {
   
    public static void main(String [] args) {
       
        Scanner scan = new Scanner(System.in);
        
       
        int [] inputs;
      
        int counter = 0;
        int i;
        
      
        System.out.print("Please enter an integer for the size of an array: ");
      
        int size = scan.nextInt();
        size = isPositive(scan, size);
      
        inputs = new int [size];
       
        System.out.print("Please enter " + size + " positive integers: ");
        //scan for input
        scan.nextLine();
        while(counter < size) {
            //check if input is an integer
            while(!scan.hasNextInt()) {
                //tell user they didn't enter an integer
                System.out.println("Sorry you didn't enter an integer.");
                //tell user to enter integer
                System.out.print("Please enter a positive integer: ");
                scan.nextLine();
            }
            //save i value
            i = scan.nextInt();
            //check if i is positive
            i = isPositive(scan, i);
            //save i to array
            inputs[counter] = i;
            //increase counter
            counter++;
            
        }
        //print statement 
        System.out.println("The array is: ");
        for(int j = 0; j < size; j++) {
            //print out array
            System.out.println(inputs[j]);
        }
    }
    
  
    public static int isPositive(Scanner scan, int x){
        if (x >= 0) {
            return x;
        }
        else {
            //print statement 
            System.out.println("Sorry, the number you entered is negative.");
            //tell user to enter again
            System.out.print("Please enter a positive integer: ");
            //scan for input
            scan.nextLine();
            //check if input is an integer
            while(!scan.hasNextInt()) {
                //tell user they didn't enter an integer
                System.out.println("Sorry you didn't enter an integer.");
                //tell user to enter integer
                System.out.print("Please enter a positive integer: ");
                scan.nextLine();
            }
         
            x = scan.nextInt();
            x =  isPositive(scan,x);
            return x;
        }
    } 
    
    
} 