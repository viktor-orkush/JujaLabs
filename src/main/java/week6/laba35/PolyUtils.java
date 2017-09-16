package week6.laba35;

import java.math.BigInteger;

public class PolyUtils {
    public static BigInteger eval(BigInteger[] poly, BigInteger arg) {
        BigInteger result = new BigInteger("0");
        BigInteger result2;
        for (int index = 0; index < poly.length; index++) {
            if (!poly[index].equals(new BigInteger("0"))){
                BigInteger powArg = arg.pow(poly.length - index - 1);
                BigInteger multiply = poly[index].multiply(powArg);
                result = result.add(multiply);
            }
        }
        return result;
    }
}