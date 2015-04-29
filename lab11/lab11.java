///////////////////////////////////////////////////////////////////////////////
//lab 08
//Danelia Changeux 
//CSE 002
//03/20/2015
// This program generates two arrays of random integers and then performs linearsearches on one and binary searches on the other 
import java.util.Scanner;
// first complie the program 
 //javac lab11.java
//Then run the program 
    // java lab11

public class Lab11 {
  
    public static void main(String[] args) {
   
        Scanner scan = new Scanner(System.in);
        
        
        int[] array1 = new int[50];
        int[] array2 = new int[50];
        //fill array1
        for(int i = 0; i < 50; i++) {
           
            array1[i] = (int)(Math.random() * 101);
        }
        int number = (int)(Math.random() * 101);
        
        for(int j = 0; j < 50; j++) {
            number += (int)(Math.random() * 11);
            array2[j] = number;
        }
        
        //print statements
        System.out.println("The maximum of array1 is: " + linMax(array1));
        System.out.println("The minimum of array1 is: " + linMin(array1));
        
        //print statements
        System.out.println("The maximum of array2 is: " + array2[49]);
        System.out.println("The minimum of array2 is: " + array2[0]);
        
      
        System.out.print("Enter an int >= 0: ");
        if(!scan.hasNextInt()) {
            //print statement
            System.out.println("You did not enter an int");
            //end program
            return;
        }
        int input = scan.nextInt();
      
        if(input < array2[0] | input > array2[49]) {
            
            System.out.println("You did not enter a valid int");
           
            return;
        }
      
        if(input < 0) {
       
            System.out.println("You did not enter an int >= 0");
          
            return;
        }
        
        binSearch(input, array2);
        
    } 
    
    public static int linMax(int[] array) {
        
        int max = 0;
    
        for(int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
         
        return max;
    } 
    
    //linMin method
    public static int linMin(int[] array) {
        int min = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
       
        return min;
    } 
    
    //binSearch method
    public static void binSearch(int num, int[] array) {
       
        int length = array.length;
        int first = 0;
        int last = length - 1;
        int middle = (first + last) / 2;

        //loop to find num value
        while(first <= last) {
           
            if(array[middle] < num) {
               
                first = middle + 1;
            }
         
            else if(array[middle] > num) {
                
                last = middle - 1;
            }
           
            else if(array[middle] == num) {
              
                System.out.println(num + " was found in the list");
                
                return;
            }
           
            middle = (first + last) / 2;
        }
        //print statements
        System.out.println(num + " was not found in the list");
        System.out.println("The number above the key was " + array[first]);
        System.out.println("The number below the key was " + array[first - 1]);
        
      
        return;
        
    } 
    
}