package tdd.fizzbuzz;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_normal_number_when_countOff_given_normal_number(){
        // Given
        int input = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        // When
        String result = fizzBuzz.countOff(input);

        assertEquals("1", result);
    }

    @Test
    public void should_return_Fizz_when_countOff_given_multiple_of_3(){
        // Given
        int input = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        // When
        String result = fizzBuzz.countOff(input);

        assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Buzz_when_countOff_given_multiple_of_5(){
        // Given
        int input = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        // When
        String result = fizzBuzz.countOff(input);

        assertEquals("Buzz", result);
    }

    @Test
    public void should_return_FizzBuzz_when_countOff_given_multiple_of_15(){
        // Given
        int input = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        // When
        String result = fizzBuzz.countOff(input);

        assertEquals("FizzBuzz", result);
    }
}
