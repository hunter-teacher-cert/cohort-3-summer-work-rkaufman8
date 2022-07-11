/**
 * SuperArray by Team MarvelvsDC
 * Seth Adams
 * collaborators: Rachel Kaufman, Seth Adams, Jihae Park, Rich Parker
 */

/**
SuperArray provides "pass-thru" accessibility to pre-existing array capabilities:
   + get/set by index
   + get length

   Adds functionality:
   + dynamic capacity
   + auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;

public class SuperArray
{
  //instance vars
  private int[] data;   // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    data = new int[size];
    numberElements = 0;
  }

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    data = new int[10];   // "interior"/"underlying" data container
    numberElements = 0;
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add( int value )
  {
    
    if (numberElements == data.length) // test to see if we need to grow, then grow
    {
      grow();
     } 
      data[numberElements] = value; //adds the value into the array
      numberElements ++; // increment numberElements
  }//end

  public boolean isEmpty()
  {
    return numberElements == 0;
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


  public void remove(int index)
  {
    if(index>numberElements-1){
      System.out.println("Index to delete does not hold meaningful data");
    } else {
      for (int i = index+1 ;i < numberElements; i++){
      data[i-1]=data[i];
      }
    numberElements --;
    }
  }


  public void add(int index, int value)
  {
    if (numberElements == data.length){
      grow();
    }
    if(index>numberElements){
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

  }
}//end class