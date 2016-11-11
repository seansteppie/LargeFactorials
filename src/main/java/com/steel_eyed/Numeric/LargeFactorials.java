package com.steel_eyed.Numeric;

import java.math.BigInteger;

/**
 * LargeFactorials
 * <p>
 * In mathematics, the factorial of integer 'n' is written as 'n!'. It is equal
 * to the product of n and every integer preceding it. For example:
 * 5! = 1 x 2 x 3 x 4 x 5 = 120
 *
 * Your mission is simple: write a function that takes an integer 'n' and returns 'n!'.
 *
 * You are guaranteed an integer argument. For any values outside the positive
 * range, return null, nil or None. In C++, return an empty string. For positive
 * numbers a full length number is expected for example, return
 * 25! = '15511210043330985984000000' as a String!
 *
 * Note: 0! is always equal to 1. Negative values should return null or an empty
 * string(in C++).
 *
 * For more on Factorials : http://en.wikipedia.org/wiki/Factorial
 *
 * @author Sean Steppie
 * @version 1.0.0        Date: 29/10/16     Initial Version
 */
public class LargeFactorials {
    public static String Factorial( int n ) {
        if( n < 0 )
            return null;
        return Factorial( BigInteger.valueOf( n ) ).toString();
    }

    private static BigInteger Factorial( BigInteger n ) {
        if( n.equals( BigInteger.ZERO ) )
            return BigInteger.ONE;
        return n.multiply( Factorial( n.subtract( BigInteger.ONE ) ) );
    }
}
