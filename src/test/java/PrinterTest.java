import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 100, 10);
    }

    @Test
      public void hasPages(){
        assertEquals(100, printer.getPages());
    }

    @Test
    public void hasCopies(){
        assertEquals(10, printer.getCopies());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void hasRefill(){
        assertEquals(100, printer.getRefill());
    }

    @Test
    public void hasPrint(){
        printer.getPrint();
        assertEquals(90, printer.getPages());
        assertEquals(90, printer.getToner());
    }



}

