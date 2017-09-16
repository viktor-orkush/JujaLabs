package week6.laba37;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilsTest {
    @Test
    public void Test(){
        // Integer.MIN_VALUE = -2147483648
        String actual = StringUtils.rightShift("0123456789", Integer.MIN_VALUE);
        String expected = "8901234567";
        assertEquals(expected, actual);
        assertEquals("BCA", StringUtils.rightShift("ABC", -4));
        assertEquals("EABCD", StringUtils.rightShift("ABCDE", 1));
        assertEquals("BCA", StringUtils.rightShift("ABC", -1));
    }
}
