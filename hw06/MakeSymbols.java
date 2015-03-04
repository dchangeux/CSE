////////////////////////////////////////////////////////////////////////////////
//Hw 06
//Danelia Changeux 
//CSE 002
//03/03/2015
//This Program will compute a random number of symbols based on whether an even or odd number is randomly selected 
//first compile the program 
//      javac MakeSymbols.java
//run the program 
//  java MakeSymbols

// define a class
public class MakeSymbols{
    
//add main method required for every Java program 
    public static void main( String[] args) {
        int sym = (int)(Math.random()*100); //sets the random number count from 0-100
        System.out.println("Random number generated: "+sym);
        System.out.print("The output pattern: ");
        boolean even = (sym % 2) == 0; //the modulus will define whether the number divided by two comes out with a 0 remainder and if so it is even
        do{ 
            if(even){
                System.out.print('*'); // if the number is even a "*" will be printed
            }    
            else{
                System.out.print('&'); //if the number is odd a "&" will be printed 
            }
            sym--;
        }while(sym>0);
    }    
}    

    
    
    
    
    