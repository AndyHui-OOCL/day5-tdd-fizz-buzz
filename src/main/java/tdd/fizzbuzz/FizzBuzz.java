package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String countOff(int input) {
        boolean multipleOfThree = input % 3 == 0;
        boolean multipleOfFive = input % 5 == 0;

        if(multipleOfThree && multipleOfFive){
            return FIZZ_BUZZ;
        }
        else if(multipleOfThree) {
            return FIZZ;
        }
        else if(multipleOfFive) {
            return BUZZ;
        } else {
            return String.valueOf(input);
        }
    }
}
