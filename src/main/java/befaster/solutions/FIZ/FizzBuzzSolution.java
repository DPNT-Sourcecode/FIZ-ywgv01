package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

    	if (number.intValue() % 3 == 0 && number.intValue() % 5 == 0) {
    		return "fizz buzz";
    	}
    	else if (number.intValue() % 3 == 0) {
    		return "fizz";
    	}
    	else if (number.intValue() % 5 == 0) {
    		return "buzz";
    	}
    	else {
    		return Integer.toString(number);
    	}
    }

}

