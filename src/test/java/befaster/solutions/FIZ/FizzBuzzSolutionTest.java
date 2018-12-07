package befaster.solutions.FIZ;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzSolutionTest {
    private FizzBuzzSolution fizzBuzz;

    @Before
    public void setUp() {

    	fizzBuzz = new FizzBuzzSolution();
    }

    @Test
    public void fizzBuzz_multiply_three() {

        assertThat(fizzBuzz.fizzBuzz(9), equalTo("fizz"));
        
    }

    @Test
    public void fizzBuzz_multiply_five() {

        assertThat(fizzBuzz.fizzBuzz(10), equalTo("buzz"));
        
    }

    @Test
    public void fizzBuzz_multiply_three_five() {

        assertThat(fizzBuzz.fizzBuzz(15), equalTo("fizz buzz"));
        
    }

    @Test
    public void fizzBuzz_multiply_non_of_them() {

        assertThat(fizzBuzz.fizzBuzz(17), equalTo("17"));
        
    }
}

