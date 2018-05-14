import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator

    @Before
    public void before(){
        calculator = new Calculator(4, 3);
    }

    @Test
    public void hasAdd(){
        assertEquals(7, calculator.getAdd());
    }

    @Test
    public void hasSubtract(){
        assertEquals(1, calculator.getSubtract());
    }

    @Test
    public void hasDivide(){
        assertEquals();
    }

}
