package hw;

import java.util.Arrays;

public class Main {

  public static void main(final String[] args) {

    int max = 0;
    if (args.length > 0){
      try {
        max = Integer.parseInt(args[0]);
        }
       catch (NumberFormatException e) {
        System.out.println("The argument entered must be an integer ");
        System.exit(1);
      }
    }

    if ( max > 0 ) {
      for (int n = 1; n <= max; n++) {
        if (n % 15 == 0) {
          System.out.println("FizzBuzz");
        } else if (n % 5 == 0) {
          System.out.println("Buzz");
        } else if (n % 3 == 0) {
          System.out.println("Fizz");
        } else {
          System.out.println(n);
        }
      }
    } else {
          System.out.println("The argument entered must be a positive integer ");
      }
    }
  }
