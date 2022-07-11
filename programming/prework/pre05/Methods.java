// Rachel Kaufman
// 6.11 Exercises 2, 3, 8
// 6/27/22


public class Methods {
  
  public static void main(String[] args) {
    boolean divisionCheck = isDivisible(2, 4);
    System.out.println(divisionCheck);

    boolean triangleCheck = isTriangle(4,3,5);
    System.out.println(triangleCheck);

    int ackermann = ack(3,5);
    System.out.println(ackermann);
    }

    

  // EXERCISE 2
  public static boolean isDivisible(int n, int m){
    if(n % m == 0) {
      return true;
    } else {
      return false;
    }
  }

  // EXERCISE 3
  public static boolean isTriangle(int a, int b, int c) {
    if ((a >= b + c) || (b >= a + c) || (c >= a + b)) {
      return false;
    } else {
      return true;
    }
  }

  // EXERCISE 8
  public static int ack(int m, int n){
    if (m == 0) {
      return n + 1;
    } else if (m > 0 && n == 0) {
      return ack(m-1, 1);
    } else if (m > 0 && n > 0) {
      return ack(m-1, ack(m, n-1));
    } else {
      return -1;
    } 
    
  }
}