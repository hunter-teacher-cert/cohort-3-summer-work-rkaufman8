
/**
 * Driver - Node - LinkedList
 * collaborators: Rachel Kaufman, Joel Bianchi, Latoya B, Jessica N
 */

import java.io.*;
import java.util.*;

/**
Basic
-----
+ add(string value)
+ get(int index);
+ toString()

Intermediate 
------------
+ size()
- add(int index,String value)
- indexOf(String value);
- toArray()

Challenge
--------
- remove(int index);
*/

public class LinkedList{

  private Node head;

  public LinkedList(){
    head = null;
  }

  
  // add() adds a new node that points to the head, and makes the new node the new head
  public void add(String value){

    //create a new node that points to the old head
    Node front = new Node(value, head);

    //make the new node the new head
    head = front;
  }

  
// get() returns the string at the node in the specified index
  public String get(int targetIndex){

    //create reference to help loop through list
    Node walker = head;
    
    //go in a loop through each node until we reach the target index
    for(int i=0; i<=targetIndex && walker != null; i++ ){
      
      //if we have reached the target index
      if (i == targetIndex){
        //return the data from the target
        return walker.getData();
      }
      
      //if (walker.getNext() != null) 
      walker = walker.getNext();
      
    }
    //return if we didn't find the target index
    return "Value at index not found.";
  }

  
 // toString() returns a string version of the list
  public String toString(){
    
    //create a walker
    Node walker = head;

    //create a variable to store our String representation
    String nodeStr = "";

    //loop through the linkedlist until there are no nodes left
    while (walker != null) {

      //add the data from each node to the nodeString
      nodeStr += walker.toString();

      //move walker on to the next node
      walker = walker.getNext();
      
      //System.out.println(walker.getData());
    } 
    
    return nodeStr;

  }

  
  //size() returns the number of elements in the list
  public int size(){
    //initialize a counter variable for the number of elements
    int numElements = 0;

    //create a walker
    Node walker = head;
    
    //keep going through the linkedlist until reaching a null
    while (walker != null) {

      //counter++
      numElements++;
      
      //move walker on to the next node
      walker = walker.getNext();
    } 

    //return counter
    return numElements;
  }


//add(int String) adds the string value at given index
  public void add(int index, String value){

    //create walker
    Node walker = head;

    //for loop until index (+1??)
    //pasted from get() method
    for(int i=0; i<=targetIndex && walker != null; i++ ){
      
      //move walker
      walker = walker.getNext();
    }
    //create a new node that points to the "next" location
    //Node newVal = new Node(string val, walker);

    //set previous to point to newVal
    
    /*
list is {joel, latoya, rachel, saranii}
want to insert "holly" at position 2 (new list J, L, H, R, S)
i = 0 i<ti walker = L
i = 1 i<ti walker = R
i = 2 exits loop
newVal node = (string, walker) (points to R)
??? how to make L point to H?
*/
  }


  /**
  Returns the index (location) of the first node in the list
  that contains value.

  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.

  */
  public int indexOf(String value){
    return 0;
  }


  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.

  It should then copy all of the values to the array and return
  the array.

  */
  public String[] toArray(){
    return null;
  }



  /**
  Remove the Node at location index from the list.

  Ex:
  
  Given the list:
  "a"->"b"->"c"->"d"->"e"

  remove(2) results in:
  "a"->"b"->"d"->"e"
  */
  public void remove(int index){
  }
  
}