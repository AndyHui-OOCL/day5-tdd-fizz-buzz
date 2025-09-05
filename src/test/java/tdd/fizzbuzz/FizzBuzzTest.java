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
}
