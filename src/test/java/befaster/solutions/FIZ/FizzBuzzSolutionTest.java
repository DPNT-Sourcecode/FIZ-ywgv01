package befaster.solutions.FIZ;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertNotNull;

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
}
