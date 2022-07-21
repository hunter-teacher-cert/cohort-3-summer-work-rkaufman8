import java.io.*;
import java.util.*;

/**
TABLE OF CONTENTS
[027] SortSearch()
[037] SortSearch(int size)
[047] get(int index)
[053] size()
[059] findSmallestIndex(int start)
[071] sort()
[090] swapElements(ArrayList<Integer> dataList, int index1, int index2)
[104] linearSearch(int value)
[115] binarySearch(int value)
[141] binarySearchRecursive(int value, int lowIndex, int highIndex)
[162] toString()
[167] builtinSort()
*/
public class SortSearch {

    private ArrayList<Integer> data;  // to store the data

    private Random r;

  
    // SortSearch() creates an ArrayList of size 15 seeded with random integers 
    public SortSearch() {
      data = new ArrayList<Integer>();
      r = new Random();
      for (int i = 0; i < 15; i++) {
        data.add(r.nextInt(20));
      }
    }

  
    // SortSearch() overloaded creates an ArrayList of given size seeded with random integers 
    public SortSearch(int size) {
      data = new ArrayList<Integer>();
      r = new Random();
      for (int i = 0; i < size; i++) {
        data.add(r.nextInt(20));
      }

    }

    // size() is a convenience function to get the data from ArrayList at a given index from the driver
    public int get(int index) {
      return this.data.get(index);
    }

  
    // size() is a convenience function to get the size of an ArrayList from the driver
    public int size() {
      return data.size();
    }

  
    // findSmallestIndex() returns the index of the smallest value in an ArrayList
    public int findSmallestIndex(int start) {
      int smallIndex = start;
      for (int i = start; i < data.size(); i++) {
        if ( data.get(i) < data.get(smallIndex)) {
          smallIndex = i;
        }
      }
      return smallIndex;
    }


    // sort() arranges the elements of an ArrayList in increasing order
    public void sort() {
      //iterating the start position of find smallest index
      for (int i = 0; i < data.size(); i++) { 

        //sets the variable to index of smallest element
        int smallindex = findSmallestIndex(i); 
        swapElements(data, smallindex, i);

        //SORT WITHOUT USING SWAPELEMENTS METHOD
        // int smallval = data.get(smallindex); //set the variable to the value of the smallest element
        // int startval = data.get(i); //sets the value of the start position
        // data.set(i, smallval); //puts the smallest values at the start position
        // data.set(smallindex, startval); //puts the start value at the smallest values position
      }

    }

  
    // swapElements() swaps the location of 2 elements in an ArrayList
    public static void swapElements(ArrayList<Integer> dataList, int index1, int index2) {
      // initialize variables and use get and set methods
      int index1val = dataList.get(index1);
      int index2val = dataList.get(index2);

      // replace value in index 1 with value in index 2
      dataList.set(index1, index2val);

      //replace value in index2 with value in index 1
      dataList.set(index2, index1val); 
    }


    // linearSearch() runs a linear search on an ArrayList to find the index of a given value
    public int linearSearch(int value) {
      for (int i = 0; i < data.size(); i++) {
        if (data.get(i) == value ) {
          return i;
        }
      }
      return -1; 
    }

  
    // binarySearch() runs a binary search on an ArrayList to find the index of a given value
    public int binarySearch(int value) {

      int firstIndex = 0;
      int lastIndex = data.size() - 1;
      int middleIndex = (firstIndex + lastIndex) / 2;

      while (data.get(middleIndex) != value) {

        if (data.get(middleIndex) < value) {
          firstIndex = middleIndex;
        } else {
          lastIndex = middleIndex;
        }
        
        middleIndex = (firstIndex + lastIndex) / 2;

        if (firstIndex == middleIndex || lastIndex == middleIndex) {
          return -1;
        }
      }

      return middleIndex;
    }

  
    // binarySearchRecursive() runs a recursive binary search on an ArrayList to find the index of a given value
    public int binarySearchRecursive(int value, int lowIndex, int highIndex) {

      if (highIndex - lowIndex != 1) {

        int middleIndex = (lowIndex + highIndex) / 2;

        if (data.get(middleIndex) == value) {
          return middleIndex;
        }

        if (data.get(middleIndex) < value) {
          return binarySearchRecursive(value, middleIndex, highIndex);
        }

        return binarySearchRecursive(value, lowIndex, middleIndex);
      }
      
      return -1;
    }

  
    public String toString() {
      return "" + data;
    };

  
    public void builtinSort() {
      Collections.sort(data);

    }
}