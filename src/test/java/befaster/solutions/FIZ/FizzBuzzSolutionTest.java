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
    public void fizzBuzz_multiply_three_or_three_in_it() {
        assertThat(fizzBuzz.fizzBuzz(33), equalTo("fizz"));
    }
    @Test
    public void fizzBuzz_multiply_three_or_three_not_in_it() {
        assertThat(fizzBuzz.fizzBuzz(27), equalTo("27"));
    }

    @Test
    public void fizzBuzz_multiply_five_or_five_in_it() {
        assertThat(fizzBuzz.fizzBuzz(55), equalTo("buzz"));
    }
    @Test
    public void fizzBuzz_multiply_five_or_five_not_in_it() {
        assertThat(fizzBuzz.fizzBuzz(10), equalTo("10"));
    }

    
    @Test
    public void fizzBuzz_multiply_three_five_both_include_numers() {
        assertThat(fizzBuzz.fizzBuzz(135), equalTo("fizz buzz"));
    }

    @Test
    public void fizzBuzz_otherwise() {
        assertThat(fizzBuzz.fizzBuzz(17), equalTo("17"));
    }
}
