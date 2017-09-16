package week6.laba34;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class BigIntegerUtilsTest {
    @Test
    public void test(){
        assertEquals("1111011", BigIntegerUtils.toBitStr(new BigInteger("123")));
        assertEquals("11011110", BigIntegerUtils.toBitStr(new BigInteger("222")));
        assertEquals("0", BigIntegerUtils.toBitStr(new BigInteger("0")));
    }
}
