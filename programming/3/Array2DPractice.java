import java.io.*;
import java.util.*;

/**
 * Array2DPractice by Team LucidThinkeren
 * Yeidy Levels
 * collaborators: Parmanand Mohanlall, Rachel Kaufman
 */

/**
   INSTRUCTIONS:
This file contains the following completed method. Use it as a model to help you with the other methods:
   + buildBoard (30)
Basic level:
   + printBoard (42)
   + setRow (58)
   + copyBoard (67)
Intermediate level:
   + explodeSquare (80)
Advanced level:
   + explodeAllChar (112)
   + downString (125)
*/


public class Array2DPractice
{
  
  // buildBoard creates a 2d array of specified size
  public static char[][] buildBoard( int rows, int cols, char value )
  {
    char[][] board = new char[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board[i][j]=value;
      }
    }
    return board;
  }

// printBoard prints a 2D array in a grid to the shell
  public static void printBoard( char[][] board )
  {
        for (int i = 0; i < board.length; i++)
          //increments through the rows
        {
          
      for (int j = 0; j < board[i].length; j++) {
        //prints each column for a given row
        System.out.print(board[i][j]+ " ");
      }
        System.out.println();
          //at the end of each row, go to next line
    }
  }

// setRow sets all the elements in the specified row to value.
  public static void setRow( char[][] board, int row, char value )
  {
      for (int j = 0; j < board[row].length; j++) {
        board[row][j]=value;
      }
  }


// copyBoard creates and returns a new 2D array of char the same size as original and copies all the elements
  public static char[][] copyBoard( char[][] original )
  {
     char[][] newBoard = new char[original.length][original[0].length];

    for(int i=0; i < original.length; i++) {
      for (int j = 0; j < original[i].length; j++) {
        newBoard[i][j] = original[i][j];
      }
    }
    return newBoard;
  }

// explodeSquare changes all the items around (but not including) a given value to 'X'
  public static void explodeSquare( char[][] board, int row, int col )
  {
    int start, end;

    if (col > 0) {
      start = col-1;
      board[row][col-1] = 'X';
    } else {
      start = col;
    }
    
    if (col < board[0].length-1) {
      end = col + 2;
      board[row][col+1] = 'X';
    } else {
      end = col + 1;
    }
     
    if (row > 0) {
      for (int j=start; j < end; j++) {
      board[row-1][j] = 'X';
       }
    }
    
    if (row < board.length-1) {
     for (int j=start; j < end; j++) {
      board[row+1][j] = 'X';
       }
    }
}

//This method will search through the 2D array board and it will explode each square that contains the char c (using the above definition of exploding).
  public static void explodeAllChar(char[][] board, char c)
  {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        if(board[i][j] == c) {
          explodeSquare(board, i, j);
        }
      }
    }
  }


// downString will insert the parameter word into board at the given position in a downward direction.
  public static void downString( char[][] board, int row, int col, String word )
  {
    for (int i=row; i<board.length; i++){
      if (i-row < word.length()) {
        board[i][col] = word.charAt(i-row);
      } else {
        break;
      }
    }
  }


  public static void main( String[] args )
  {
    char[][] b = buildBoard(5,10,'z');
    printBoard(b);
    System.out.println();
    
    // setRow(b, 3, '@');
    // printBoard(b);
    // System.out.println();

    downString(b, 1, 1, "SUP");
    downString(b, 3, 3, "HELLO");
    printBoard(b);

    // explodeAllChar(b, '@');
    // printBoard(b);
    
    /*
      Note, you can directly set elements in the board
      using array notation like b[3][2]='z' and you
      can use array notation to also access individual
      elements
    */
  }
}

