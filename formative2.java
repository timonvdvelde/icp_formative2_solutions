import java.util.Scanner;

class Main {
  /*
   * Asks the user for a year and reports whether it's a leap year.
   * Ends with input -1.
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int year = 0;

    // Keeps looping while user input (year) is not -1.
    while (year != -1) {
      System.out.println("Please enter a year to check if it's a leap year.");
      year = input.nextInt();

      // Divisble by 400
      if (year % 400 == 0) {
        System.out.println("Yes, very much leap year!");
      }
      // Divisible by 4, but not 100.
      else if(year % 4 == 0 && year % 100 != 0) {
        System.out.println("Yes, very much leap year!");
      }
      // Check if the year is -1
      else if (year == -1) {
        System.out.println("Alright, bye.");
      }
      // If the year is negative, print error message.
      else if (year < 0) {
        System.out.println("Not a valid year.");
      }
      // Otherwise not a leap year.
      else {
        System.out.println("Nah, no leap year.");
      }
    }
  }
}

