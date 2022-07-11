// Rachel Kaufman
// 5.12 Exercise 5
// 6/27/22


public class BeerSong {

  public static void bottleCount(int n) {
    if (n == 0) {
      songLyrics("No");
    } else {
      songLyrics(String.valueOf(n));
      bottleCount(n-1);
    }
  }
  
  public static void main(String[] args) {
    bottleCount(4);
    }

  public static void songLyrics(String numBottles) {
    System.out.println(numBottles + " bottles of beer on the wall,");
    System.out.println(numBottles + " bottles of beer,");
    System.out.println("Ya' take one down, ya' pass it around,");
    System.out.println(checkForZero(numBottles) + " bottles of beer on the wall.");
    System.out.println();
  }

  public static String checkForZero(String bottleVal){
    if(bottleVal == "No") {
      return "'Cause there are no more";
    } else if (Integer.parseInt(bottleVal) == 1){
      return "No";
    } else {
      return String.valueOf(Integer.parseInt(bottleVal)-1);
    }
  }
}