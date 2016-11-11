package com.steel_eyed.Numeric.Test;

import com.steel_eyed.Numeric.LargeFactorials;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * LargeFactorialsTest
 * <p>
 *
 * @author Sean Steppie
 * @version 1.0.0        Date: 29/10/16     Initial Version
 */
public class LargeFactorialsTest {
    @Test
    public void testNegativeNumbers() {
        assertEquals( null, LargeFactorials.Factorial( -1 ) );
    }

    @Test
    public void testZero() {
        assertEquals( "1", LargeFactorials.Factorial( 0 ) );
    }

    @Test
    public void testOne() {
        assertEquals( "1", LargeFactorials.Factorial( 1 ) );
    }

    @Test
    public void testFive() {
        assertEquals( "120", LargeFactorials.Factorial( 5 ) );
    }

    @Test
    public void testNine() {
        assertEquals( "362880", LargeFactorials.Factorial( 9 ) );
    }

    @Test
    public void testFifteen() {
        assertEquals( "1307674368000", LargeFactorials.Factorial( 15 ) );
    }

    @Test
    public void testTwentyFive() {
        assertEquals( "15511210043330985984000000", LargeFactorials.Factorial( 25 ) );
    }
}

