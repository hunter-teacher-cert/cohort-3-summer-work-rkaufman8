/**
 * ArrayPractice by Team BossCoders
 * First Last
 * collaborators: Sarah McCoy, Rachel Kaufman, Stacy Goldstein, Jenna Lin
 */

/**
   INSTRUCTIONS:
   This file contains stubs (empty methods) for the following methods:

   1. buildIncreasingArray
   2. buildRandomArray
   3. printArray
   4. arraySum
   5. firstOccurence
   6. isSorted
   7. findMaxValue
   8. countOdds
   9. flip

   The stubs will have comments describing what they should do

   Levels:
   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   Basic:
   Complete these methods:
   + buildRandomArray
   + printArray
   - arraySum
   + firstOccurence
   + findMaxValue

   Intermediate:
   Complete all the methods for basic and also
   + buildIncreasingArray
   - isSorted
   - countOdds

   Advanced:
   Complete all the methods
*/

import java.util.*;
import java.io.*;

public class ArrayPractice
{

  //builds an array of a given size with a start value and increment value
  public static int[] buildIncreasingArray(int size, int startValue, int step)
  {
    int[] data = new int[size];

    // loop through each element of the array and assign the appropriate value to each one
    for (int i = 0; i < size; i++){
      data[i] = startValue + (step * i);
    }

    return data;
  }

// builds an array of random numbers of a given size
  public static int[] buildRandomArray( int size, int maxValue )
  {
    Random r = new Random();
    int[] data = new int[size];

    for (int i = 0; i < size; i++){
      data[i] = r.nextInt(maxValue);
    }

    return data;
  }


//prints any array of any size
  public static void printArray( int[] data )
  {
     for (int i = 0; i < data.length; i++) {
      System.out.println(data[i]);
    }
  }



//returns the index of the first occurence of a requested value in an array
  public static int firstOccurence( int[] data, int value )
  {
    int valPos = 0;
    while (data[valPos] != value) {
      valPos++;
      
      if(valPos == data.length) {
        return -1;
      }
    }

    return valPos; 
  }


//sums up an array of any size
  public static int arraySum( int[] data )
  {
    int sum=0;
         
    for (int datum:data) {
      sum += datum;
    }

    return sum; // replace this
  }


  /**
     Parameters:
     data - an array of integers

     Returns:
     true if the array is sorted, false otherwise

     That is, if each element is < the element to its right
     then the array is sorted.

     An array with values 5,6,10,15 is sorted
     An array with values 5,6,10,13,15 is not

  */
  public static boolean isSorted(int[] data)
  {
    // put length-1 to avoid out of bounds error
    for (int i = 0; i < data.length - 1; i++) {
      if (data[i] > data[i+1]) {
        return false;
      }
    }

    return true; 

  }

// finds and returns the max value in an array of any size
  // public static int findMaxValue( int[] data ) {
  //   int maxVal=data[0];  // holds current max value, init to first in array.

  //   for (int i = 0; i < data.length - 1; i++) {
  //     if (data[i+1]>maxVal) {//Compare next value to the current maxVale
  //      maxVal = data[i+1];//overwrite maxVal
		// }
  // } 

  //   return maxVal;
  // }
//Enhanced for loop?
	public static int findMaxValue( int[] data ) {
    int maxVal=data[0];  // holds current max value, initialize to first value in array.

    for (int datum : data) {
			//Compare each value to the current maxVal
       if (datum > maxVal) {
       maxVal = datum;
		}
  } 

    return maxVal;
  }

  /**	
     Parameters:
     data - an array of integers

     Returns:
     the number of odd elements in the array

     Ex: if data holds 5,6,7,8,9,10 then the return value
     will be 3 since three of the elements are odd.
  */
  public static int countOdds( int[] data ) {
    int count=0;

    /* YOUR BRILLIANT CODE HERE */
     for (int i = 0; i < data.length; i++) {
       if(data[i]%2 !=0)
         count++;
     }

    return count;
  }

  /**
     Parameters:
     data - an array of integers

     Returns:
     no return value since this is a void function -- but
     you will manipulate the values in the array parameter

     Postcondition:
     elements of the input array are in reverse order

     Example:
     If the input array contains 5,8,13,7,27,2
     After the routine, the array will contain 2,27,7,13,8,5
  */
  public static void flip(int[] data )
  {
    int[] tempData = new int[data.length];

    //set a temporary array to hold original array's order
    for(int i=0; i < data.length; i++) {
      tempData[i] = data[i];
    }

    //reset the original array in the reverse order
    for(int i=0; i < data.length; i++) {
      data[i] = tempData[(data.length-1) - i];
    }
    
  }


  public static void main( String[] args )
  {

    // remove the comments as you complete each routine
    // and add more lines as you add additional routines.

     // int[] data1 = buildRandomArray(6, 10);
    int[] data2 = buildIncreasingArray(10,6,2);
     printArray(data2);
    // printArray(data2);

    System.out.println("Max Value: " + findMaxValue(data2));

    System.out.println("Sum of array values is " + arraySum(data2));

    System.out.println("Is it sorted? " + isSorted(data2));
    System.out.println("Number of odd numbers in array = "+ countOdds(data2));

    //not a return function so can't call it as a parameter
    //here we use flip to reorder the array
    flip(data2);

    //print the revised array
		System.out.println("Flipped array: ");
    printArray(data2);

  }
}