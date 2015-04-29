///////////////////////////////////////////////////////////////////////////////
//lab 09
//Danelia Changeux 
//CSE 002

import java.util.Random;
import java.util.Scanner;
// first complie the program 
 //javac lab9.java
//Then run the program 
    // java lab9
/*This program generates a sentence using a random number generator
to chose adjectives, nouns, and verbs */
public class lab9{
    //main method
    public static void main(String[] arg) {
        //declare random generator
        Random randomGenerator = new Random();
        //declare and construct Scanner
        Scanner scan = new Scanner(System.in);
        //set yes values
        String yes1 = "y";
        String yes2 = "Y";
        String answer;
        
        while(true) {
            //print sentence
            System.out.println("The " + adj(randomGenerator) + " " + 
                adj(randomGenerator) + " " + noun1(randomGenerator) + " " + 
                verb(randomGenerator) + " the " + adj(randomGenerator) + " " +
                noun2(randomGenerator) + ".");
            //ask if user wants to generate new sentence
            System.out.print(" Enter y or Y to generate another sentence" + 
                " (anything else is to quit): ");
            //save answer
            answer = scan.nextLine();
            //if user wants to continue 
            if(answer.equals(yes1) | answer.equals(yes2)) {
                //exit iteration of loop
                continue;
            }
            //if user wants to quit
            else {
                //exit loop
                break;
            }
        }
        
        
    } //end main method
    
    //adj method
    public static String adj(Random randomGenerator) {
        int n = randomGenerator.nextInt(10);
        String s;
        switch(n) {
            //if n = 0
            case 0 : {
                //save adjective
                s = "big";
                //break statement
                break;
            }
            //if n = 1
            case 1 : {
                //save adjective
                s = "small";
                //break statement
                break;
            }
            //if n = 2
            case 2 : {
                //save adjective
                s = "lazy";
                //break statement
                break;
            }
            //if n = 3
            case 3 : {
                //save adjective
                s = "fat";
                //break statement
                break;
            }
            //if n = 4
            case 4 : {
                //save adjective
                s = "athletic";
                //break statement
                break;
            }
            //if n = 5
            case 5 : {
                //save adjective
                s = "beautiful";
                //break statement
                break;
            }
            //if n = 6
            case 6 : {
                s = "strong";
                //break statement
                break;
            }
            //if n = 7
            case 7 : {
                //save adjective
                s = "pretty";
                //break statement
                break;
            }
            //if n = 8
            case 8 : {
                //save adjective
                s = "smart";
                //break statement
                break;
            }
            //if n = 9
            case 9 : {
                //save adjective
                s = "short";
                //break statement
                break;
            }
            //default case
            default : {
                //save adjective
                s = "tall";
                //break statement
                break;
            }
        }
        return s;
    } //end adj method
    
    //noun1 method
    public static String noun1(Random randomGenerator) {
        int n = randomGenerator.nextInt(10);
        String s;
        switch(n) {
            //if n = 0
            case 0 : {
                //save adjective
                s = "apple";
                //break statement
                break;
            }
            //if n = 1
            case 1 : {
                //save adjective
                s = "cat";
                //break statement
                break;
            }
            //if n = 2
            case 2 : {
                //save adjective
                s = "grape";
                //break statement
                break;
            }
            //if n = 3
            case 3 : {
                //save adjective
                s = "fish";
                //break statement
                break;
            }
            //if n = 4
            case 4 : {
                //save adjective
                s = "ostritch";
                //break statement
                break;
            }
            //if n = 5
            case 5 : {
                //save adjective
                s = "bear";
                //break statement
                break;
            }
            //if n = 6
            case 6 : {
                s = "lion";
                //break statement
                break;
            }
            //if n = 7
            case 7 : {
                //save adjective
                s = "snake";
                //break statement
                break;
            }
            //if n = 8
            case 8 : {
                //save adjective
                s = "elephant";
                //break statement
                break;
            }
            //if n = 9
            case 9 : {
                //save adjective
                s = "snake";
                //break statement
                break;
            }
            //default case
            default : {
                //save adjective
                s = "rat";
                //break statement
                break;
            }
            
        }
        return s;
    } //end noun1 method
    
    //verb method
    public static String verb(Random randomGenerator) {
        int n = randomGenerator.nextInt(10);
        String s;
        switch(n) {
            //if n = 0
            case 0 : {
                //save adjective
                s = "knew";
                //break statement
                break;
            }
            //if n = 1
            case 1 : {
                //save adjective
                s = "passed";
                //break statement
                break;
            }
            //if n = 2
            case 2 : {
                //save adjective
                s = "saved";
                //break statement
                break;
            }
            //if n = 3
            case 3 : {
                //save adjective
                s = "ate";
                //break statement
                break;
            }
            //if n = 4
            case 4 : {
                //save adjective
                s = "attacked";
                //break statement
                break;
            }
            //if n = 5
            case 5 : {
                //save adjective
                s = "saw";
                //break statement
                break;
            }
            //if n = 6
            case 6 : {
                s = "missed";
                //break statement
                break;
            }
            //if n = 7
            case 7 : {
                //save adjective
                s = "loved";
                //break statement
                break;
            }
            //if n = 8
            case 8 : {
                //save adjective
                s = "hated";
                //break statement
                break;
            }
            //if n = 9
            case 9 : {
                //save adjective
                s = "hit";
                //break statement
                break;
            }
            //default case
            default : {
                //save adjective
                s = "hugged";
                //break statement
                break;
            }
        }
        return s;
    } //end verb method
    
    //noun2 method
    public static String noun2(Random randomGenerator) {
        int n = randomGenerator.nextInt(10);
        String s;
        switch(n) {
            //if n = 0
            case 0 : {
                //save adjective
                s = "tiger";
                //break statement
                break;
            }
            //if n = 1
            case 1 : {
                //save adjective
                s = "sheep";
                //break statement
                break;
            }
            //if n = 2
            case 2 : {
                //save adjective
                s = "lamb";
                //break statement
                break;
            }
            //if n = 3
            case 3 : {
                //save adjective
                s = "rooster";
                //break statement
                break;
            }
            //if n = 4
            case 4 : {
                //save adjective
                s = "jaguar";
                //break statement
                break;
            }
            //if n = 5
            case 5 : {
                //save adjective
                s = "deer";
                //break statement
                break;
            }
            //if n = 6
            case 6 : {
                s = "monkey";
                //break statement
                break;
            }
            //if n = 7
            case 7 : {
                //save adjective
                s = "lion";
                //break statement
                break;
            }
            //if n = 8
            case 8 : {
                //save adjective
                s = "eagle";
                //break statement
                break;
            }
            //if n = 9
            case 9 : {
                //save adjective
                s = "anaconda";
                //break statement
                break;
            }
            //default case
            default : {
                //save adjective
                s = "gopher";
                //break statement
                break;
            }
            
        }
        return s;
    } 

} 