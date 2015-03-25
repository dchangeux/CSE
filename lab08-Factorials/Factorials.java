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
public class Factorials{ 

    
    //add the main method required for every java program 
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a positive Integer: ");
        int input =scan.nextInt();
        int sum =0;
        
        for(int i=1 ; i <= input; i++){
            sum += factorial(i);
            
        }
        System.out.println("The factorial of " + input + " is " +sum);
    }    
    
    public static int factorial(int key){
        int mul=1;
        for(int i=1; i<= key; i++){
            mul *= i;
        }
        System.out.println(mul);
        return mul;
    }
    
    public static void print(int num){
        System.out.println("The super factorial is equal to "+num);
    }
}
   