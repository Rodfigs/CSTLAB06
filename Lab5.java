/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

/**
 *
 * @author rodri
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    
    // initialize an int array and multiple ints
    public static void binarySearch(int arr[], int first, int last, int key){
   
        //initializes another int and adds first and last and divides it by 2
        int mid = (first + last)/2;
        //while first is less than or equal to last the program 
        while( first <= last ){
            
            if ( arr[mid] < key ){
        first = mid + 1;   
     
            //the program prints out element is found at mid
            }else if ( arr[mid] == key ){
        System.out.println("Element is found at index: " + mid);
        break;
      }else{
         last = mid - 1;
      }
      mid = (first + last)/2;
   }
   
        //if first is greater than last than element is not found will be printed out
        if ( first > last ){
      System.out.println("Element is not found!");
   }
 }

    //
    public static void main(String args[]){
		int arr[] = {10,20,30,40,50};
		int key = 30;
        int last=arr.length-1;
		binarySearch(arr,0,last,key);	
 }
    
}
