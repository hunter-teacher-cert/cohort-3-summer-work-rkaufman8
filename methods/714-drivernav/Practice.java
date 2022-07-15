// if x=[0,1,2,3] then barGraphify(x) will output
// 0:
// 1: =
// 2: ==
// 3: ===

// if x=[1,0,3,2] then barGraphify(x) will output
// 0: =
// 1:
// 2: ===
// 3: ==

public class Practice
{
  
public static String barGraphify (int[] nums)
{
  String retString = "";
    for (int i = 0; i < nums.length; i++)
    {
      retString += i + ": ";
      
      for (int j = 0; j < nums[i]; j++)
      {
        retString += "=";
      }
        retString += "\n";
    }
  return retString;
}

/**
0 + : + "" = \n 1 + : + "equalsigns" \n 2 + : + "equalsigns" \n

so repeat is append to previous:
+index
+another semicolon
+"=" up to the value at that index
+nbsp
*/

// if x=[0,1,2,3] then barGraphify(x) will output
//       * 
//     * * 
//   * * * 
// 0 1 2 3 

// if x=[1,0,3,2] then barGraphify(x) will output
//     *   
//     * * 
// *   * * 
// 0 1 2 3 

public static char[][] vBarGraphify(int[] nums) {
  
  int maxVal=0;

  for (int col = 1; col < nums.length - 1; col++) {
    if (nums[col]>nums[col-1]){
      maxVal = nums[col];
    }
  }
 // System.out.println("maxval = " + maxVal);
  
  char[][] vArray = new char[maxVal+1][nums.length];

  for (int row = 0; row < maxVal; row++) {
    
    for (int col = 0; col < nums.length; col++) {
        
        if (nums[col]>=(maxVal-row)){
          vArray[row][col] = '*';
        } else {
          vArray[row][col] = ' ';
        }
      }
    }

  for (int col = 0; col < nums.length; col++) {
    //String s = "" + col;
    //also i want to try this line:
    //String s = String.valueOf(col);
    //String s = col.toString();  //toString() can only be called on Objects, not primitives
    //lol but it worked anyway, it was just running the previous compiled class
    //ooooooo i'm learning so much lol; :)
    //I'm still baffled by why the char wasn't working...

    // i saw a thing where it was like
     char c = (char)(col + '0');
    // similar to what you did for strings
    // that seems like a promising lead... let's try it'
    // yay????
    // Okay... ASCI table values  '0' is 48 https://www.asciitable.com/
    //the character for 4 is the number 52
    //if we just change the VALUE 4 to a char, we're pulling 4 from the ASCII table, which is some ancient non-existent empty char
    // LOL
    //well that makes sense
    //That was cool?
    //yes! i love co-problemsolving (+1)
    // leaving all these notes bc <3 them

    vArray[maxVal][col] = c;
  }

  return vArray;
}

  public static void printBoard( char[][] board )
  {
    for (int i = 0; i < board.length; i++) {  

      System.out.print("rownum" + i);
      for (int j = 0; j < board[i].length; j++) {
        System.out.print(board[i][j]+ " ");
      }
        System.out.println();
    }
  }

    public static void printBoard( String[][] board )
  {
    for (int i = 0; i < board.length; i++) {  

      //System.out.print("rownum" + i);
      for (int j = 0; j < board[i].length; j++) {
        System.out.print(board[i][j]+ " ");
      }
        System.out.println();
    }
  }

/**
create newArray[maxVal + 1][length of original array]

  for (row = 0; row < maxVal; row++)
    for (col = 0; col < originalArray.length; col++),
      if (originalArray[col]==(maxVal-row))
        newArray[row][col] = "*"
      else
        newArray[row][col] = " "

  for (col = 0; col < originalArray.length; col++)
    newArray[maxVal+1][col] = col;

return newArray
  */


  
public static void main (String[] args)
{  
  int[] sample = {3, 4, 2, 0, 1};

  System.out.print("Horizontal:\n" + barGraphify(sample));

  System.out.println("Vertical:");
  printBoard(vBarGraphify(sample));

}

}