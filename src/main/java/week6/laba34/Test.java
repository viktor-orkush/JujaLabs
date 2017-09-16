package week6.laba34;

import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        BigInteger k = new BigInteger("1");
        String expected = "1";
        String actual = BigIntegerUtils.toBitStr(k);

        if (!expected.equals(actual)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}

