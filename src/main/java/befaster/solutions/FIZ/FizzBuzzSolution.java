package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    	
    	FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

    	if ( (fizzBuzzSolution.isDivisible(number, 3) || fizzBuzzSolution.isContains(number, "3") )
    			&& (fizzBuzzSolution.isDivisible(number, 5) || fizzBuzzSolution.isContains(number, "5") )
    		) {
    		return "fizz buzz";
    	}
    	else if (fizzBuzzSolution.isDivisible(number, 3) || fizzBuzzSolution.isContains(number, "3")) {
    		return "fizz";
    	}
    	else if (fizzBuzzSolution.isDivisible(number, 5) || fizzBuzzSolution.isContains(number, "5")) {
    		return "buzz";
    	}
    	else {
    		return Integer.toString(number);
    	}
    }
    
    private boolean isDivisible(Integer number, Integer dividend) {
    	if (number % dividend == 0)
    		return true;
    	else
    		return false;
    }
    private boolean isContains(Integer number, String keyNumber) {
    	
    	String inputNumber = Integer.toString(number);
    	
    	if (inputNumber.contains(keyNumber))
    		return true;
    	else
    		return false;
    }

}
