import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasDrink(){
        assertEquals(90, waterBottle.getDrink());
    }

    @Test
    public void hasEmpty(){
        assertEquals(0, waterBottle.getEmpty());
    }

    @Test
    public void hasFill(){
        assertEquals(100, waterBottle.getFill());
    }
}
