/////////////////////////////////////////////////////////////
//Danelia Changeux
//hw 03
//2-10-2015
//Root Java Program 
//
import java.util.Scanner;
//first compile the program 
//      javac Root.java
//run the program 
//      java Root//

//define a class 
    public class Root {

//add main method required for every Java Program 
    public static void main(String[] args){
        Scanner myScanner; //Scanner allows to put inputs
        myScanner = new Scanner( System.in );
        System.out.println("Enter a double and I print its cube root");
        double ncuberoot =myScanner.nextDouble();
        //run the calculations (the following are calculations to be able to have an accurate cubed root)
        double guess=ncuberoot/3;
        double guess2=(guess*guess*guess+ncuberoot)/(3*guess*guess);
        double guess3=(guess2*guess2*guess2+ncuberoot)/(3*guess2*guess2);
        double guess4=(guess3*guess3*guess3+ncuberoot)/(3*guess3*guess3);
        double guess5=(guess4*guess4*guess4+ncuberoot)/(3*guess4*guess4);
        double guess6=(guess5*guess5*guess5+ncuberoot)/(3*guess5*guess5);
        System.out.println("The cube root is"+ guess6);
        }
    }