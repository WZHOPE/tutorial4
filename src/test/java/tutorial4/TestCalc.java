package tutorial4;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static tutorial4.Calc.add;

/**
 * Unit test for simple App.
 */
public class TestCalc
{
    public void testApp()
    {
        assertEquals(3, add(1, 2));
    }
}
