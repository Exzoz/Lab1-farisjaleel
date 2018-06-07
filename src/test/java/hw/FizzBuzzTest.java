package hw;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;

public class FizzBuzzTest {

    private FizzBuzz fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new FizzBuzz();
    }

    @Test
    public void testFizzBuzz() {
        //tests inputs

        String[] result = fixture.fizzBuzzArray(-10);
        assertEquals(null, result);

        result = fixture.fizzBuzzArray(-1);
        assertEquals(null, result);

        result = fixture.fizzBuzzArray(0);
        assertEquals(null, result);

        result = fixture.fizzBuzzArray(1);
        assertEquals(new String[] {"1"}, result);

        result = fixture.fizzBuzzArray(7);
        assertEquals(new String[] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"}, result);


        result = fixture.fizzBuzzArray(17);
        assertEquals(new String[] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17"}, result);





    }
}