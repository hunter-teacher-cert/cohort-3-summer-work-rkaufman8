/**
 * Rational class by Team BangPi
 * collaborators: Rachel Kaufman, Seth Adams, Jihae Park, Rich Parker
 */


/**
   class Rational

   An instance of this class will represent a rational number (p/q s.t. p,q ints && q!=0) and facilitate mathematical operations with another instance of class Rational.

   Basic level (complete all):
   + toString (54)
   + default constructor (32)
   + multiply (68)
   + divide (76)

   Intermediate level (complete Basic methods plus these methods):
   + floatValue (61)
   + overloaded constructor (40)
*/


public class Rational
{
  // Instance variables for numerator and denominator
  private int _numerator;
  private int _denominator;


  // default constructor; creates a new Rational with value 0/1
  public Rational()
  {
    _numerator = 0;
    _denominator = 1;
  }


  // overloaded constructor; creates a new Rational with value n/d
  public Rational( int n, int d )
  {
    if (d == 0) {
      System.out.println("Invalid denominator; setting rational to 0/1.");
      _numerator = 0;
      _denominator = 1;
    } else {
      _numerator = n;
      _denominator = d;
    }
  }


  // toString returns a string representation of the rational number
  public String toString()
  {   
	  return _numerator + "/" + _denominator;
  }


  // floatValue returns floating point approximation of the number
  public double floatValue()
  {
    return (double)_numerator /_denominator;
  }


  // multiply takes a Rational parameter and multiplies it by this Rational
  public void multiply( Rational r )
  {
    _numerator *= r._numerator;
    _denominator *= r._denominator;
  }


  // divide takes a Rational parameter and divides it by this Rational
  public void divide( Rational r )
  {
    if (r._numerator != 0) {
      _numerator *= r._denominator;
      _denominator *= r._numerator;
    } else {
      System.out.println("Invalid; no division performed.");
    }
  }

}//end class