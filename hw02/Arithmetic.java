///////////////////////////////////////////////////////////////////////////////
//Danelia Changeux
//Lab 02
//1-30-2015
//Cyclometer Java Program 
//
// first compile the program 
//     javac Arithmetic.java
// run the program 
//     java Aritmetic//

// define a class
public class Arithmetic{

// add main method required for every Java program 
    public static void main(String[] args) {
// Number of pairs of socks
    int nSocks=3;
 //Cost per pair of socks
 //('$' is part of the variable name)
    double sockCost=2.58;
 
 //Number of drinking glasses 
    int nGlasses=6;
 //Cost per glass
    double glassCost=2.29;
 
 //Number of boxes of envelopes
    int nEnvelopes=1;
 //cost per box of envelopes
    double envelopeCost=3.25;
    double taxPercent=0.06;
   //run the following calculations
    double CostofSocks= nSocks*sockCost;
    double Costofglasses= nGlasses*glassCost;
    double Costofenvelopes=nEnvelopes*envelopeCost;
    double totalCostbeforetax = CostofSocks+Costofenvelopes+Costofglasses;
   // run final calculation for cost of transaction
    double totalCostAfterTax = (totalCostbeforetax*taxPercent) + totalCostbeforetax;
    System.out.println("The Cost for " + nSocks + " socks is $" + CostofSocks);
    System.out.println("The Cost for " + nGlasses + " glasses is $" + Costofglasses);
    System.out.println("The Cost for " + nEnvelopes + " envelopes is $" + Costofenvelopes);
    System.out.println("The total paid for the transaction BEFORE tax is $" + totalCostbeforetax);
    System.out.println("The total paid for the transaction AFTER tax is $" + totalCostAfterTax);
    }
}