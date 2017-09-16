package week6.laba35;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

/**
 * Created by Viktor on 05.08.2017.
 */
public class PolyUtilsTest {
    @Test
    public void Test(){
        BigInteger actual = new BigInteger("1999700");

        BigInteger[] arrBI = new BigInteger[] {
                new BigInteger("2"),
                new BigInteger("0"),
                new BigInteger("-3"),
                new BigInteger("0")};

        BigInteger expected = PolyUtils.eval(arrBI, new BigInteger("100"));

        assertEquals(actual, expected);
    }
}
