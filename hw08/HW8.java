/////////////////////////////////////////////////////////////////////////////////////
//Danelia Changeux 
//03/24/15
//hw08 
import java.util.Scanner;
// This is a game that will run depending on inputs and choices of the user
//First compile the program 
    //javac HW8.java
//Then run the program 
    //java HW8
// define a class
public class HW8{
    // add the main metyhod required for every program 
    public static void main(String []args){
 char option;
 Scanner scan = new Scanner(System.in); // the follo0wing lines are what will be printed depending on the users inputs 
 System.out.println("Welcome to MG's adventure world. Now your journey begins.Good Luck!");
 System.out.println("Please hit'C' or 'c' to continue, anything else to quit-");
 String input= getInput(scan,"Cc");
 System.out.println("You are in a dead valley.");
 System.out.println("Please hit'C' or 'c' to continue, anything else to quit-");
 input = getInput(scan,"Cc");
 System.out.println("You walked and walked and walked and you saw a cave!");
 cave();
 System.out.println("Please hit'C' or 'c' to continue, anything else to quit-");
 input = getInput(scan,"Cc");
 System.out.println("You entered a cave!");
  System.out.println("Please hit'C' or 'c' to continue, anything else to quit-");
 input = getInput(scan,"Cc");
 System.out.println("Unfortunately, you ran into a GIANT!");
 giant();
 System.out.println("Enter 'A' or 'a' to attack, 'E' or 'e' to Escape, ANYTHING else is to YEILD");
 input= getInput(scan,"AaEe", 10);
 System.out.println("Congragulations! You SURVIVED! Get your REWARD!");
 System.out.println("There are three tressure boxes in front of you! Enter the box number you want to open!");
 box();
 input= getInput(scan);
 System.out.println("Hero! Have a good day!");
    
    }
    
public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }
public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
public static String getInput(Scanner scan, String string){
    String input = scan.next();
    if (input.equals("C")||input.equals("c")){
        return"";
    
    }else{
        System.out.println("Yea right you LOSER!");
        System.exit(0);
        return"";
    }
}

public static String getInput(Scanner scan, String string, int trial){ // the next few lines will determine whether the user will hit or escape the monster and will make the user input an A,a,E or e until 10 critical hits are made 
    int count = 0;
    String input  = scan.next();
    while (input.equals ("A")|| input.equals("a")|| input.equals("E")||input.equals("e")){
        if (input.equals("A")||input.equals("a")){
        double attack = Math.random();
            if(attack > 0.5){
                System.out.println("Critical Hit!"); 
                count++;
        
    
            }else{
                System.out.println("Gosh! How can you miss it?");
            }
        }else{
          int escape = (int) (Math.random()*10); 
          if(escape == 0){ 
                System.out.println("You have escaped!"); 
                System.exit(0);
            }else{
                System.out.println("You have not escaped!");
            }
        }
        
        if (count==trial){
            return"";
        }
        System.out.println("Enter 'A' or 'a' to attack, 'E' or 'e' to Escape, ANYTHING else is to YEILD");
        input  = scan.next(); //countinues to read input
            
     }
     System.out.println("Executed by the Giant!");
     System.exit(0);
     return"";
}

    
    
    public static String getInput(Scanner scan){ // thei will prompt the user to chose a box out of three and then give the user a reward according to the box they chose
        char input = scan.next().charAt(0);// will only give the first character of the string
        switch(input){
            case'1':
            System.out.println("GPA 4.00");
            return"";
             case'2':
            System.out.println("GPA 3.35");
            return"";
             case'3':
            System.out.println("You have made the dean's list!");
            return"";
            default:
            System.out.println("Restart the game!");
            return"";
        }
    }
    
}


