////////////////////////////////////////////////////////////////////////////////
//Danelia Changeux
//04/07/2015
//Professor Brian Chen
//hw 10: Remove Elements

import java.util.Scanner;
public class RemoveElements{
  public static void main(String []args){
    Scanner scan=new Scanner(System.in);
    int num[] =new int [10];
    int newArray1 [];
    int newArray2[];
    int index,target;
    String answer=" ";
    do{System.out.print("Random input 10 ints [0-9]");
      num = randomInput();
      String out = "The original array is:";
      out += listArray(num);
      System.out.println(out);
      
      System.out.print("Enter the index ");
      index =scan.nextInt();
      newArray1 = delete(num,index);
      String out1 ="The output array is ";
      out1 += listArray(newArray1);//return a string of form "{2,3,-9}"
      System.out.println(out1);
      
      System.out.print("Enter the target value ");
      target = scan.nextInt();
      newArray2 =remove(num,target);
      String out2="The output array is";
      out2 += listArray(newArray2);//retuen a string of the form "{2,3,-9}"
      System.out.println(out2);
      
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("Y"));
    
  }
  
  public static String listArray(int num[]){
    String out= "{";
    for(int j=0;j<num.length;j++){
      if (j>0){
        out +=", ";
      }
      out += num[j];
    }
      out +="} ";
       return out;
    }
   

  public static int[] randomInput(){
  int array3 [] =new int [10];
    for(int i=0; i < array3.length; i++){
    array3[i] = (int)(Math.random()*9+1);

    }
     return array3;  
  }
  
  public static int[] delete(int[] list,int pos){
  int array4[] = new int [list.length-1];
    for(int j=0; j<array4.length; j++){
    
      
    if(j < pos) {
      array4[j]= list[j];
    
    }else{
     array4[j] = list[j-1];  
    }
      
    }
  return array4;  
  }
  
  public static int[] remove(int[] list,int target){
  int count = 0;
  for(int i=0;i<list.length;i++){
    if(list[i]==target){
      count++;
    }
  }
  int array5[] = new int[list.length-count];
  int index =0;   // reason fo rindex is to keep track of the position of the returning array 
    for(int k=0;k<list.length;k++){
      if (list[k]!=target){
        array5[index]=list[k];
        index++;
      }
    }
   return array5; 
  }
}
  
  
  
  
  
  
  
  
  
    