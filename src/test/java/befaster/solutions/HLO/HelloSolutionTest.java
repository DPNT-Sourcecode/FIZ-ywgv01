package befaster.solutions.HLO;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class HelloSolutionTest {
    private HelloSolution hello;

    @Before
    public void setUp() {

        hello = new HelloSolution();
    }

    @Test
    public void test_hello() {

        assertNotNull(hello.hello("Mr. X"));
        
        assertThat(hello.hello("Mr. X"), equalTo("Hello, Mr. X!"));
        
    }
}
