////////////////////////////////////////////////////////////////////////////////
//lab06-Smile Generator
//Danelia Changeux 
//CSE 002
//02/20/2015
//This Program will generate a random number of smiley faces 
//first compile the program 
//      javac SmileGenerator.java
//run the program 
//  java SmileGenerator//

// define a class
public class SmileGenerator {
    
    public static void main(String[] args) {

        //print out Step 1
        System.out.println("Step 1");
        for(int counter = 5; counter > 0; counter--) {
            //print smiley
            System.out.print(":) ");
        }
        //print line
        System.out.print("\n \n");

        //create counter variable
        int counter = 5;
        //print 5 smileys using a while loop
        while(counter > 0) {
            //print smiley
            System.out.print(":) ");
            //decrease counter
            counter--;
        }
        //print line
        System.out.print("\n \n");
        
        //print 5 smileys using a do-while loop
        do {
            //print smiley
            System.out.print(":) ");
            //increase smiley
            counter++;
        } while(counter < 5);
        //print line
        System.out.print("\n \n");
        
        //create limiting variable
        int counter2 = 30;
        
        //print Step 2 and 3
        System.out.println("Step 2 and 3");
        //generate random number of smileys
        for(int number = (int)(Math.random() * 100); number > 0; number--) {
            //print smiley
            System.out.print(":) ");
            //decrease counter by one
            counter2--;
            //if counter2 equals 30 insert a line break
            while(counter2 == 0) {
                //line break
                System.out.print("\n");
                //reset counter
                counter2 = 30;
                //end loop
                break;
            }
        }
        //print line
        System.out.print("\n \n");
        
        //Print Step 4
        System.out.println("Step 4");
        //generate random number between 0 and 30
        int number2  = (int) (Math.random() * 30);
        int counter3 = 2;
        int i = 1;
        while(i >= 0 & i <= number2) {
            //print smiley
            System.out.print(":) ");
           
            i--;
            if(i == 0) {
               //print line break
               System.out.println();
               //add counter3 value to i
               i += counter3;
               //increase counter3 value by one
               counter3++;
            }
        }

    }
    
} 
    