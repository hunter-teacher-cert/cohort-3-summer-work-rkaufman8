// Rachel Kaufman
// 2.12 Exercise 3
// 3/3/22

public class Time {
  public static void main(String[] args) {
    //declare + initialize variables
    int hour = 9, minute = 30, second = 25;
    int secSinceMid, secRemain, percDay;

    //declare + initalize new times
    int newHour = 10, newMin = 2, newSec = 12;
    int newSinceMid, timeElapsed;

    //calculate and display the number of seconds since midnight
    secSinceMid = (hour * 3600) + (minute * 60) + second;
    System.out.print("Seconds since midnight: ");
    System.out.println(secSinceMid);

    //calculate and display the seconds remaining in the day
    secRemain = (86400) - secSinceMid;
    System.out.print("Seconds until midnight: ");
    System.out.println(secRemain);

    //calculate and display the percent of the day that has passed
    percDay = (secSinceMid * 100) / 86400;
    System.out.print("Percent of day that has passed: ");
    System.out.println(percDay);

    //calculate and display the time elapsed since I started working on this assignment
    newSinceMid = (newHour * 3600) + (newMin * 60) + newSec;
    timeElapsed = newSinceMid - secSinceMid;
    System.out.print("Seconds elapsed since I started: ");
    System.out.println(timeElapsed);
  }

}