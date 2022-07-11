// Rachel Kaufman
// 2.12 Exercise 2
// 3/2/22

public class Date {

  public static void main(String[] args) {
    //declare + initialize variables
    String day = "Wednesday", month = "March";
    int date = 2, year = 2022;

    //output American formatted date
    System.out.println("American format:");
    System.out.println(day + ", " + month + " " + date + ", " + year);

    //output European formatted date
    System.out.println("European format:");
    System.out.println(day + " " + date + " " + month + " " + year);
  }
}