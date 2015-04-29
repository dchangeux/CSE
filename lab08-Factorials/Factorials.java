///////////////////////////////////////////////////////////////////////////////
//lab 08
//Danelia Changeux 
//CSE 002
//03/20/2015
// This program will create number waves depending on the number you input between the integer 1 and 30 
import java.util.Scanner;
// first complie the program 
 //javac Factorials.java
//Then run the program 
    // java Factorials
    
//define a class 

public class Factorial {
  
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        int x;
        
        //ask user to enter an integer
        System.out.print("Enter a postive int: ");
        while(!scan.hasNextInt()) {
           
            System.out.print("Invalid input. Enter a positive int: ");
            scan.next();
        }

        x = scan.nextInt();
        while(x < 0) {
            if (x < 0) {
               
                System.out.print("Invalid input. Enter a postive int: ");
            }
            while(!scan.hasNextInt()) {
                System.out.print("Invalid input. Enter a positive int: ");
                scan.next();
            }
            x = scan.nextInt();
        }
        
        int fact = factorial(n);
        print(x, fact);
    }
    //factorial method
    public static int factorial(int input) {
        int factorial = 1;
        int total = 0;
        for(int i = input; i > 0; i--) {
            for(int j = i; j > 0; j--) {
               
                factorial *= j;
            }
            total += factorial;
           
            factorial = 1;
        }

        return total;
    } 
    
  
    public static void print(int input, int sum) {
       
        System.out.println("The super factorial of " + input + " is " +
            sum);
    } 
} 