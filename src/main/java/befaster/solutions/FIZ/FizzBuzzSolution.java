package befaster.solutions.FIZ;

import java.util.HashMap;
import java.util.Map;

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
    
    private boolean isDelux(Integer number) {
    	
    	Map<String, String> numbersMap = new HashMap<String, String>();
    	
    	if (number <= 10)
    		return false;
    	
    	String inputNumber = number.toString();
    	
    	for(int i=0 ; i<inputNumber.length() ; i++) {
    		numbersMap.put(inputNumber.charAt(i) + "", inputNumber.charAt(i) + "");
    	}
    	
    	if (numbersMap.keySet().size() > 1)
    		return false;
    	else 
    		return true;
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

