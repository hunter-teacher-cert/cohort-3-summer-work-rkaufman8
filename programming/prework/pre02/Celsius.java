// Rachel Kaufman
// 3.12 Exercise 2
// 3/3/22
import java.util.Scanner;
  
public class Celsius {

  public static void main(String[] args) {
    double fahrTemp, celsTemp;
    final double CONV_FRAC = 5.0 / 9.0;
    final double CONV_CONST = 32;
    Scanner in = new Scanner(System.in);

    //requests user enter fahr temperature
    System.out.print("Enter the temperature in Fahrenheight: ");
      fahrTemp = in.nextDouble();

    //calculate temp in Celsius
    celsTemp = (fahrTemp - CONV_CONST) * CONV_FRAC;
    
    //print pre & post conversion values formatted to 2 decimal spaces
    System.out.printf("%.2f in Fahrenheit is %.2f Celsius.\n", fahrTemp, celsTemp);
    
    }
}