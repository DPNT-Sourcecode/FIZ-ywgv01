package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    	
    	FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

    	if ( (fizzBuzzSolution.isDivisible(number, 3) || fizzBuzzSolution.isContains(number, "3") )
    			&& (fizzBuzzSolution.isDivisible(number, 5) || fizzBuzzSolution.isContains(number, "5") )
    		) {
    		
    		if (fizzBuzzSolution.isDelux(number)) {
        		return "fizz buzz deluxe";
    		}
    		else if (fizzBuzzSolution.isFakeDelux(number)){
        		return "fizz buzz fake deluxe";
    		}
    		
    	}
    	
    	if ( (fizzBuzzSolution.isDivisible(number, 3) || fizzBuzzSolution.isContains(number, "3") ) ) {

    		if (fizzBuzzSolution.isDelux(number)) {
        		return "fizz deluxe";
    		}
    		else if (fizzBuzzSolution.isFakeDelux(number)){
        		return "fizz fake deluxe";
    		}

    	}
    	
    	if (  (fizzBuzzSolution.isDivisible(number, 5) || fizzBuzzSolution.isContains(number, "5") ) ) {

    		if (fizzBuzzSolution.isDelux(number)) {
        		return "buzz deluxe";
    		}
    		else if (fizzBuzzSolution.isFakeDelux(number)){
        		return "buzz fake deluxe";
    		}

    	}
    	
    	if ( fizzBuzzSolution.isDelux(number) ) {
    		return "deluxe";
    	}
    	
    	if ( fizzBuzzSolution.isFakeDelux(number) ) {
    		return "fake deluxe";
    	}
    	
    	if ( (fizzBuzzSolution.isDivisible(number, 3) || fizzBuzzSolution.isContains(number, "3") )
    			&& (fizzBuzzSolution.isDivisible(number, 5) || fizzBuzzSolution.isContains(number, "5") )
    		) {
    		return "fizz buzz";
    	}
    	
    	if (fizzBuzzSolution.isDivisible(number, 3) || fizzBuzzSolution.isContains(number, "3")) {
    		return "fizz";
    	}
    	
    	if (fizzBuzzSolution.isDivisible(number, 5) || fizzBuzzSolution.isContains(number, "5")) {
    		return "buzz";
    	}

   		return Integer.toString(number);

    }
    
    private boolean isDelux(Integer number) {

    	String inputNumber = number.toString();
    	
    	if (
    			( number % 3 == 0 && inputNumber.contains("3") )
    			||( number % 5 == 0 && inputNumber.contains("5") )
    		) {
    		
    		if (number % 2 == 0)
    			return true;
    		else
    			return false;
    		
    	}
		else
			return false;
    }
    
    private boolean isFakeDelux(Integer number) {

    	String inputNumber = number.toString();
    	
    	if (
    			( number % 3 == 0 && inputNumber.contains("3") )
    			||( number % 5 == 0 && inputNumber.contains("5") )
    		) {
    		
    		if (number % 2 != 0)
    			return true;
    		else
    			return false;
    		
    	}
		else
			return false;
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

