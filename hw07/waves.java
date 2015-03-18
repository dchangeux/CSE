///////////////////////////////////////////////////////////////////////////////
//Hw07
//Danelia Changeux 
//CSE 002
//03/17/2015
// This program will create number waves depending on the number you input between the integer 1 and 30 
import java.util.Scanner;
// first complie the program 
 //javac waves.java
//Then run the program 
    // java waves
    
//define a class 
public class waves{ 

    
    //add the main method required for every java program 
    public static void main (String[] args){
        Scanner myScanner;     
        myScanner = new Scanner( System.in ); 
    System.out.print("Enter a number between 1 and 30: ");
    String input = myScanner.next(); //stores input into string object 
    int input2 = input.length();// checks String length
    char input3; 
    int num;
    
    
    for (int i=0; i<input2; i++){
    input3 = input.charAt(i);
        if (input3 < '0' || input3 >'9'){
            System.out.println("Invalid Input!");
            System.exit(0);//
        }
     
    }
    num = Integer.parseInt(input);// will covert the string into an integer 
    if (!( num>=1 && num <=30)){
        System.exit(0);
    }
    String output;
    System.out.println("For Loop: ");
    
    for(int i =1; i <= num; i++ ){
        output ="";
        if (i%2 == 0){
            for(int j = 0; j < i; j++){
              output += i;
                System.out.println(output);
            }
            
        }
        else{
            for(int j = i; j > 0; j--){
              for (int k = j; k>0; k--){
                  System.out.print(i);
              }
                System.out.println();
            }
                
                
        }
    }
    
    System.out.println("While Loop: ");
   
       int i = 1;
    while (i <= num){
        output ="";
        if(i%2==0){
            int j= 0;
            while(j<i){
            output += i;
            System.out.println(output);
            j++;
            }
            
        }
        else {
            int j = i;
            while( j > 0){
                int k =j;
                while(k>0){
                    System.out.print(i);
                    k--;
                }
                System.out.println();
                j--;
            }
        }
        i = i+1;
        
    }
    System.out.println("Do-While Loop: ");
     i = 1;
     do{
        output ="";
        if(i%2==0){
            int j= 0;
            do{
            output += i;
            System.out.println(output);
            j++;
            }while(j<i);
            
        }
        else {
            int j = i;
             do{
                int k =j;
                do{
                    System.out.print(i);
                    k--;
                }while(k>0);
                System.out.println();
                j--;
            }while( j > 0);
        }
        i = i+1;
        
     }while (i <= num);
   
  
    }
    
}