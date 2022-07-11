// Rachel Kaufman
// 3.12 Exercise 4
// 3/3/22
import java.util.Scanner;
import java.util.Random;
  
public class Guess {

  public static void main(String[] args) {
    // pick a random number
    Random random = new Random();
    int number = random.nextInt(100) + 1;

    int userGuess, guessDiff;
    Scanner in = new Scanner(System.in);

    //prompt the user to guess & print the two numbers
    System.out.print("Guess a number between 1 and 100 inclusive: ");
    userGuess = in.nextInt();
    System.out.println("Your guess is " + userGuess + "!");
    System.out.println("I was thinking of " + number + ".");

    //compute and print diff between 2 numbers
    guessDiff = userGuess - number;
    System.out.println("We were " + guessDiff + " away from each other!");
    }
}