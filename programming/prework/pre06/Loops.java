// Rachel Kaufman
// 7.9 Exercises 2, 3, 4
// 6/27/22

public class Loops {
  
  public static void main(String[] args) {
    System.out.println(squareRoot(16));
    System.out.println(power(5, 2));
    System.out.println(factorial(6));
    }

  // EXERCISE 2
  public static double squareRoot(double a) {
    double n = a/2, m = a;
    while (Math.abs(m-n) >= 0.0001) {
      m = n;
      n = (n + a/n) / 2;
    }
    return n;
  }

  // EXERCISE 3
  public static double power(double x, int n) {
    double pow = 1;
    for(int i = 1; i <= n; i++) {
      pow *= x;
    }
    return pow;
  }
  
  // EXERCISE 4
  public static double factorial(int n) {
    double fact = n;
    for(int i = 1; i < n; i++) {
      fact *= (n-i);
    }
    return fact;
  }

  
}