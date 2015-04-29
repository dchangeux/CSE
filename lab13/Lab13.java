///////////////////////////////////////////////////////////////////////////////
//Danelia Changeux 
//lab 13 
//CSE 002
// first complie the program 
 //javac Lab13.java
//Then run the program 
    // java Lab13
//define a class 

public class Lab13 {
    public static void main(String[] args) {
        int[][] A = new int[5][];
        int counter = 5;
        for(int i = 0; i < A.length; i++) {
            A[i] = new int[counter];
            counter += 3;
        }
        A = fillArray(A);
        
        System.out.println("Array before sorting: ");
        for(int j = 0; j < A.length; j++) {
            printRow(j, A);
        }
        A = sortRows(A);
        System.out.println("Array after sorting: ");
        for(int k = 0; k < A.length; k++) {
            printRow(k, A);
        }
        int longest = findLongest(A);
        int[][] B = new int[5][A[longest].length];
          B = fillZero(A, B);
       
        System.out.println("Array after sorting and copying: ");
        for(int m = 0; m < B.length; m++) {
            printRow(m, B);
        }
        
    }
    public static int[][] fillArray(int[][] A) {
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[i].length; j++) {
                A[i][j] = (int)(Math.random() * 40);
            }
        }
       
        return A;
    } 
    
    //printRow method
    public static void printRow(int row, int[][] A) {
        for(int i = 0; i < A[row].length; i++) {
            System.out.print(A[row][i] + " ");
        }
        System.out.print("\n");
    } 
    
    //sortRows method
    public static int[][] sortRows(int [][] A) {
        for(int i = 0; i < A.length; i++) {
            java.util.Arrays.sort(A[i]);
        }
        return A;
    }
    
    //findLongest method
    public static int findLongest(int[][] A) {
        int longest = A[0].length;
        for(int i = 0; i < A.length; i++) {
            if(A[i].length > longest) {
                longest = i;
            }
        }
        return longest;
    }
    
    //fillZero method
    public static int[][] fillZero(int[][] A, int [][] B) {
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[0].length; j++) {
                B[i][j] = A[i][j];
            }
        }
        return B;
    } 
    
}