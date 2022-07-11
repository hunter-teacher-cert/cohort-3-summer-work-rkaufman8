/**
 * SuperArray by Team MarvelvsDC
 * Seth Adams
 * collaborators: Rachel Kaufman, Seth Adams, Jihae Park, Rich Parker
 */

/**
   SKELETON
   SuperArray is a wrapper class for an array.

   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length

   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;

public class SuperArray
{
  /**
     SUBGOAL:
     declare instance vars
     ...and initialize?
  */


  //instance vars
  private int[] data;   // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    data = new int[size];
    numberElements = 0;
    //init underlying/inner storage of specified capacity
    /* YOUR SIMPLE+SMART CODE HERE */

    //init instance vars
    /* YOUR SIMPLE+SMART CODE HERE */

  }

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    //init underlying/inner storage of capacity 10
        /* YOUR SIMPLE+SMART CODE HERE */
    data = new int[10];   // "interior"/"underlying" data container
    numberElements = 0;
    //init instance vars
        /* YOUR SIMPLE+SMART CODE HERE */
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add( int value )
  {
    
    if (numberElements == data.length) // test to see if we need to grow, then grow
    {
      grow();
      // int[] tempArray = new int [data.length];
      // for (int i = 0 ; i < data.length; i++) {
      //   tempArray[i] = data[i];
      //   //create a temporary array to copy over data from original
      // }
      // data = new int[tempArray.length + 5];
      // for (int i = 0 ; i < tempArray.length; i++) {
      //   data[i] = tempArray[i];
      //}
          //copy info from tempArray back into data
      //data = tempArray--does that work for second loop?
     } 
      data[numberElements] = value; //adds the value into the array
      numberElements ++; // increment numberElements
  }//end

  public boolean isEmpty()
  {
    //if index of data[i] < numberElements {return true else}
    return numberElements == 0;
    // if(numberElements == 0){//checks to see if any elements have meaningful data
    //   return true;
    // } else {
    //   return false; 
    // }
  }


  public int get(int index)
  {
    if (index > numberElements) {
      System.out.println("Index numbers does not have any meaningful data");     
    }
      return data[index];
    //return item at index
  }


  public String toString()
  {
     String arrayString = "[ ";
     for (int i = 0 ; i < numberElements; i++) {
            arrayString += data[i] + " ";
          }
    arrayString += "]";
    
    return arrayString;
  }
  // //return Stringified version of this Object,
  // // with extra debugging info
  // //(helper method for debugging/development phase)
  // public String debug()
  // {
  //   String s = "";
  //   s = "Size: " + this.data.length;
  //   s = s + " LastItem: " + numberElements + "  Data: ";
  //   for (int i = 0; i < numberElements; i++) {
  //     s = s + data[i] + ", ";
  //   }
  //   s = s + "\n";
  //   return s;
  // }//end debug()


  public void remove(int index)
  {
    
    // shift items down to remove the item at index
    /* YOUR SIMPLE+SMART CODE HERE */
    if(index>numberElements-1){
      System.out.println("Index to delete does not hold meaningful data");
    } else {
      for (int i = index+1 ;i < numberElements; i++){
      data[i-1]=data[i];
      }
    numberElements --;
    }
    // subtract fom numElements;
    /* YOUR SIMPLE+SMART CODE HERE */
  }


  public void add(int index, int value)
  {
    if (numberElements == data.length){
      grow();
    }
    if(index>data.length-1){
      System.out.println("Index is out of bounds.");
    } else {
      for (int i = numberElements; i > index; i--){
      data[i]=data[i-1];
    }
    data[index] = value;
    numberElements++;
    }
  }

  
  private void grow()
  {
    int[] tempArray = new int [data.length + 5];//create a temporary array to copy over data from original
    for (int i = 0 ; i < data.length; i++) {
      tempArray[i] = data[i];//copy over all the elements from the old array to the new one
      } 
    data = tempArray;
      // data = new int[tempArray.lengt];
      // for (int i = 0 ; i < tempArray.length; i++) {
      //   data[i] = tempArray[i];
      //}
  }
    

    // copy over all the elements from the old array to the new one
    /* YOUR SIMPLE+SMART CODE HERE */

    // point data to the new array data=tempArray
    // Q: How does this look when illustrated using encapsulation diagram?
    /* YOUR SIMPLE+SMART CODE HERE */


}//end class