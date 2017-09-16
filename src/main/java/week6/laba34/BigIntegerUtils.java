package week6.laba34;

import java.math.BigInteger;

public class BigIntegerUtils {
    public static String toBitStr(BigInteger arg) {
        BigInteger radix = BigInteger.valueOf(2);
        BigInteger remain;
        BigInteger dividend;

        String result = "";

        dividend = arg;
        if (arg.equals(new BigInteger("0"))) return "0";

        while (dividend.compareTo(radix) >= 0){
            result += dividend.mod(radix);
            dividend = dividend.divide(radix);
        }
        result += dividend;
//        return arg.toString(2);
        return new StringBuilder(result).reverse().toString();
    }
}