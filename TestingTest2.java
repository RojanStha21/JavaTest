package S3Workshop_4;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class TestingTest2 {
    @Test
    public void testIsPrime() {
        assertTrue(W4Task12.isPrime(2));
        assertFalse(W4Task12.isPrime(4));
    }

    @Test
    public void testFactorial() {
        assertEquals(1, W4Task13.factorial(0));
        assertEquals(1, W4Task13.factorial(1));
        assertEquals(120, W4Task13.factorial(5));
        assertEquals(5040, W4Task13.factorial(7));
    }

    @Test
    public void testArea() {
        W4Task14 rect = new W4Task14(5, 10);
        assertEquals(50, rect.area());
    }

    @Test
    public void testPerimeter() {
        W4Task14 rect = new W4Task14(5, 10);
        assertEquals(30, rect.perimeter());
    }


}



