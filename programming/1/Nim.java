import java.io.*;
import java.util.*;

public class Nim {

  public static void main(String[] args){
    int stones = 12;
    int stonesTaken = 0;

    Scanner input = new Scanner(System.in);

    //loop until game ends
    while(stonesTaken < stones){

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
  }
}