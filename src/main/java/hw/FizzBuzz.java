package hw;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzzArray(final int n ) {
        if (n > 0) {
            List<String> list = new ArrayList();
            for (int i=1; i<=n; i++) {
                if (i % 15 == 0) {
                    list.add("FizzBuzz");
                } else if (i % 5 == 0) {
                    list.add("Buzz");
                } else if (i % 3 == 0) {
                    list.add("Fizz");
                } else {
                    list.add(i + "");
                }
            }
            return list;
        } else {
            return null;
        }
    }

}