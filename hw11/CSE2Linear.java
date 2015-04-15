/////////////////////////////////////////////////////////////////////////////////
//Danelia Changeux 
//04/14/2015
//hw11: CSE2Linear.java
import java.util.Scanner;
import java.util.Arrays;
//First Compile the program 
//javac CSE2Linear.java
//Then run the program
//java CSE2Linear

public class CSE2Linear{
//add the main method 
  public static void main(String []args){
    
    int FG [] =new int [15];
    int idx = 0;
    Scanner scan=new Scanner(System.in); //Declare the scanner that will allow the user to enter an input
    //Use a while loop in order to check for the 15 integers
    while(idx<15){
        System.out.println("Enter 15 ints for final grades in CSE2: ");
        String input = scan.next();
        char carlast = input.charAt(input.length()-1);
        if (carlast >= '0' && carlast <='9'){
            int userInt = Integer.parseInt(input);
            
            if(userInt>= 0 && userInt <= 100){
                if(idx == 0){
                    FG[idx] =userInt;
                    idx++;
                }
                    else {
                    if (userInt < FG [idx-1]){
                        FG[idx] =userInt;
                        idx ++;
                        
                    }
                    }
                }
            }
        
        }
        
    

      System.out.print("Enter a grade to search for: ");
      int GS = scan.nextInt();
      Arrays.sort(FG);
      
      int[] found = binarySearch(FG, GS);
      if(found[0] >= 0){
          System.out.println(GS+" was found in the list with "+found[1]);
      }
      else{ 
  System.out.println(GS+" was not found in the list with " +found[1]);
      
     }
    scrambleAry(FG);     
    System.out.print("Enter a grade to search for: ");
    GS = scan.nextInt();
    int iteration = 0;
    boolean foundagain = false;
    
    for(int i = 0; i < FG.length; i++){
    iteration++;
        if (FG[i]==GS){
            foundagain = true; 
            System.out.println(GS+" was found in the list with "+iteration);
        }
    }
 if (!foundagain){
 System.out.println(GS+"was not found in the list with "+iteration+" iterations");
     
     }
      
  }



//The following is a scrambling array method
public static void scrambleAry(int[] scramble){
    for(int i=0; i<10; i++){
        int one = (int)(Math.random ()*15);
        int two = (int)(Math.random ()*15);
        int temp =scramble[one]; //get the value at int one
         scramble[one] =scramble[two];// override the value of int one into two
         scramble[two] =temp;
    }
}




//The follwing id the binary search method 
public static int [] binarySearch( int[] list, int key) {
        int low =0;
        int iteration = 0;
        
        int high =list.length -1;
           while(low <= high ){
               
           int mid =low+(high-low)/2;
            
            if(key <list[mid]){
            high =mid-1;
            iteration++;
            }
                else if (key == list[mid]){
                    int [] newArray ={mid,iteration};
                        return newArray;
            }
                else{
                    low =mid +1;
                    iteration++;
                }
           }
         int [] secondArray ={-1, iteration};
    return secondArray; 
        
    }
}



















