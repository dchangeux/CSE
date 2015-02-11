///////////////////////////////////////////////////////////////////////////////
//Danelia Changeux 
//hw03
//02-10-2015
//FourDigits Java Program 
import java.util.Scanner;
//  first compile the program 
//      javac FourDigits.java
//  run the program 
//        java FourDigits//

// define a Class
    public class FourDigits{
    
// add main method 
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.println("Enter a double and I display the four digits to the right of the decimal point");
        double nfourdigits =myScanner.nextDouble();
        double x = nfourdigits*10000;
        int nFourDigits = (int) nfourdigits;
        double y =x%10000;
        
        System.out.println("The four digits are"+y+" ");        
    }
}