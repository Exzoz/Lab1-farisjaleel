package hw;

import java.util.List;

public class Main {

  public static void main(final String[] args) {

    int max = 0;
    if (args.length > 0) {
      try {
        max = Integer.parseInt(args[0]);
      } catch (NumberFormatException e) {

        System.out.println("The argument entered must be an integer ");
        System.exit(1);
      }
    }

    if (max > 0) {
      FizzBuzz fizzBuzz = new FizzBuzz();
      List<String> result = fizzBuzz.fizzBuzzArray(max);
      for (int i = 0; i < max; i++) {
        System.out.println(result.get(i));
      }
    } else {
      System.out.println("Please enter a positive integer");
    }
  }
}