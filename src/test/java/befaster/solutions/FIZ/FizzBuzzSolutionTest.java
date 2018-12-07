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
    public void fizzBuzz_deluxe() {
        assertThat(fizzBuzz.fizzBuzz(44), equalTo("deluxe"));
    }
    @Test
    public void fizzBuzz_deluxe_multiply3() {
        assertThat(fizzBuzz.fizzBuzz(33), equalTo("deluxe"));
    }
    @Test
    public void fizzBuzz_deluxe_multiply5() {
        assertThat(fizzBuzz.fizzBuzz(55), equalTo("deluxe"));
    }
    @Test
    public void fizzBuzz_deluxe_fizz_buzz() {
        assertThat(fizzBuzz.fizzBuzz(555), equalTo("fizz buzz deluxe"));
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


