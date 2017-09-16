package week6.laba33;

import java.math.BigInteger;

public class FractionUtils {
    public static BigInteger[] sum(BigInteger[] x, BigInteger[] y) {
        BigInteger denominatorX = x[0];
        BigInteger denominatorY = y[0];
        BigInteger numeratorX = x[1];
        BigInteger numeratorY = y[1];
        BigInteger numeratorRes = numeratorX;
        if(!numeratorX.equals(numeratorY)){
            denominatorX = denominatorX.multiply(numeratorY);
            denominatorY = denominatorY.multiply(numeratorX);
            numeratorRes = numeratorY.multiply(numeratorX);
        }

        BigInteger denominatorRes = denominatorX.add(denominatorY);
        BigInteger average = denominatorRes.gcd(numeratorRes);
        denominatorRes = denominatorRes.divide(average);
        numeratorRes = numeratorRes.divide(average);
        return new BigInteger[] {denominatorRes , numeratorRes};
    }
}
