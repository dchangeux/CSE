///////////////////////////////////////////////////////////////////////////////
//lab 12
//Danelia Changeux 
//CSE 002
// first complie the program 
 //javac Lab12.java
//Then run the program 
    // java Lab12
    
//define a class 

public class Lab12 {
    //main method
    public static void main(String[] args) {
        //generate random widths and heights
        int width1 = (int)(Math.random() * 5 + 1);
        int width2 = (int)(Math.random() * 5 + 1);
        int height1 = (int)(Math.random() * 5 + 1);
        int height2 = (int)(Math.random() * 5 + 1);
        
        //create arrays
        int[][] A = new int[height1][width1];
        A = increasingMatrix(width1, height1, true);
        int[][] B = new int[width1][height1];
        B = increasingMatrix(height1, width1, false);
        int[][] C = new int[height2][width2];
        C = increasingMatrix(width2, height2, true);
        
        //print matrices
        System.out.println("Matrix A: ");
        printMatrix(A, true);
        System.out.println("Matrix B: ");
        printMatrix(B, false);
        System.out.println("Matrix C: ");
        printMatrix(C, true);
        
        
        //translate and print Matrix B
        System.out.println("Translate Matrix B to row major: ");
        //create new array
        int[][] newB  = new int[height1][width1];
        newB = translate(B);
        printMatrix(newB, true);
        
        //create new matrix
        int[][] added = new int[height1][width1];
        added = addMatrix(A, true, B, false);
        
        System.out.println("Matrix A + Matrix B = ");
        printMatrix(added, true);
    } 
    
    //increasingMatrix method
    public static int[][] increasingMatrix(int width, int height, 
    boolean format) {
        int[][] array = new int[height][width];
        int counter = 1;
        if(format == true) {
            for(int i = 0; i < height; i++) {
                for(int j = 0; j < width; j++) {
                    array[i][j] = counter;
                    counter++;
                }
            }
        }
        
        counter = 1;
        if(format == false) {
           for(int k = 0; k < width; k++) {
               for(int m = 0; m < height; m++) {
                   array[m][k] = counter;
                   counter++;
               }
           }
        
        return array;
    }
    
    //printMatrix method
    public static void printMatrix(int[][] array, boolean format) {
        if(format == true) {
            for(int i = 0; i < array.length; i++) {
                System.out.print("[ ");
                for(int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " "); 
                }
                System.out.print("]\n");
            }
           return;
        }
        else if(format == false) {
            for(int k = 0; k < array[0].length; k++) {
                System.out.print("[ ");
                for(int m = 0; m < array.length; m++) {
                    System.out.print(array[m][k] + " "); 
                }
                System.out.print("]\n");
            }
            return;
        }
        
        else if(array == null) {
            System.out.println("The array was empty!");
            return;
        }
    } 
    //print the translate method 
    public static int[][] translate(int[][] array) {
        int[][] newArray = new int[array[0].length][array.length];
        
        int temp;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                temp = array[i][j];
                newArray[j][i] = temp;
            }
        }
        return newArray;
    } 
    
    //addMatrix method
    public static int[][] addMatrix(int[][] A, boolean formatA, int[][] B, 
    boolean formatB) {
        if(formatA == false) {
            int[][] newA = new int[A[0].length][A.length];
            newA = translate(A);
            return addMatrix(newA, true, B, formatB);
        }
      
        if(formatB == false) {
            int[][] newB = new int[B[0].length][B.length];
            newB = translate(B);
            return addMatrix(A, formatA, newB, true);
        }
        if(A.length != B.length | A[0].length != B[0].length) {
            System.out.println("The matrices cannot be added!");
            return null;
        }
        int[][] added = new int[A.length][A[0].length];
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[0].length; j++) {
                added[i][j] = A[i][j] + B[i][j];
            }
        }
        
        return added;
    } 
 
} 