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
    public void fizzBuzz_deluxe_3() {
        assertThat(fizzBuzz.fizzBuzz(36), equalTo("fizz deluxe"));
    }
    @Test
    public void fizzBuzz_deluxe_3_fake() {
        assertThat(fizzBuzz.fizzBuzz(63), equalTo("fizz fake deluxe"));
    }
    @Test
    public void fizzBuzz_deluxe_5() {
        assertThat(fizzBuzz.fizzBuzz(50), equalTo("buzz deluxe"));
    }
    @Test
    public void fizzBuzz_deluxe_5_fake() {
        assertThat(fizzBuzz.fizzBuzz(85), equalTo("buzz fake deluxe"));
    }

    @Test
    public void fizzBuzz_deluxe_3_5() {
        assertThat(fizzBuzz.fizzBuzz(1350), equalTo("fizz buzz deluxe"));
    }
    @Test
    public void fizzBuzz_deluxe_3_5_fake() {
        assertThat(fizzBuzz.fizzBuzz(135), equalTo("fizz buzz fake deluxe"));
    }

    
    
    
    
    
    
    
    @Test
    public void fizzBuzz_multiply_three() {
        assertThat(fizzBuzz.fizzBuzz(18), equalTo("fizz"));
    }
    @Test
    public void fizzBuzz_three_in_it() {
        assertThat(fizzBuzz.fizzBuzz(13), equalTo("fizz"));
    }

    @Test
    public void fizzBuzz_multiply_five() {
        assertThat(fizzBuzz.fizzBuzz(40), equalTo("buzz"));
    }
    @Test
    public void fizzBuzz_five_in_it() {
        assertThat(fizzBuzz.fizzBuzz(52), equalTo("buzz"));
    }

    @Test
    public void fizzBuzz_multiply_both() {
        assertThat(fizzBuzz.fizzBuzz(90), equalTo("fizz buzz"));
    }
    @Test
    public void fizzBuzz_contains_both() {
        assertThat(fizzBuzz.fizzBuzz(53), equalTo("fizz buzz"));
    }
    @Test
    public void fizzBuzz_multiply3_contains5() {
        assertThat(fizzBuzz.fizzBuzz(252), equalTo("fizz buzz"));
    }
    @Test
    public void fizzBuzz_multiply5_contains3() {
        assertThat(fizzBuzz.fizzBuzz(305), equalTo("fizz buzz"));
    }

    @Test
    public void fizzBuzz_otherwise() {
        assertThat(fizzBuzz.fizzBuzz(17), equalTo("17"));
    }
}



