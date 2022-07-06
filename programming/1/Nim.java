import java.io.*;
import java.util.*;

public class Nim {

  public static void main(String[] args){
    int stones = 12;
    int stonesTaken = 0;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    boolean playerTurn = false;



=======
>>>>>>> origin/master
=======
>>>>>>> origin/master
=======
>>>>>>> origin/master
=======
>>>>>>> origin/master
=======
>>>>>>> origin/master
    Scanner input = new Scanner(System.in);

    //loop until game ends
    while(stonesTaken < stones){

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    
      playerTurn = !playerTurn;  
    int numStones;
      
    System.out.println("Number of stones remaining: " + (stones - stonesTaken));
      
      if (playerTurn) {
        System.out.print("Number of stones you take: ");
        numStones = input.nextInt();
      } else {
        //machine turn
      Random r = new Random();
      numStones = r.nextInt(3)+1;
      System.out.println("Computer takes " + numStones + " stones.");
      }

      stonesTaken += numStones;
      
      }
    
    if (playerTurn){
      System.out.println("Player wins!");
    } else {
      System.out.println("Computer wins!");
    }
  
    System.out.println("Game over!");
    

=======
=======
>>>>>>> origin/master
=======
>>>>>>> origin/master
=======
>>>>>>> origin/master
=======
>>>>>>> origin/master
      System.out.print("Number of stones to take: ");
        int numStones = input.nextInt(); 
      stonesTaken += numStones;
      System.out.println("Number of stones remaining: " + (stones - stonesTaken));

      //check for win
      if(stonesTaken >= stones){
        System.out.println("User wins!");
        break;
      }
      
      //machine turn
      Random r = new Random();
      numStones = r.nextInt(3)+1;
      System.out.println("Computer takes " + numStones + " stones.");
      //calc number of stones remaining and print
      stonesTaken += numStones;
      System.out.println("Number of stones remaining: " + (stones - stonesTaken));
      
      //check for win
      if(stonesTaken >= stones){
        System.out.println("Computer wins!");
        break;
      }
    }
    System.out.println("Game over!");
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> origin/master
=======
>>>>>>> origin/master
=======
>>>>>>> origin/master
=======
>>>>>>> origin/master
=======
>>>>>>> origin/master
  }
}