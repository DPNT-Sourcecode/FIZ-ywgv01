package befaster.solutions.HLO;

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

        assertNotNull(hello.hello("Hello"));
    }
}

