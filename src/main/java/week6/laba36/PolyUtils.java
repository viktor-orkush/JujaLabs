package week6.laba36;

import java.math.BigInteger;

public class PolyUtils {
    public static BigInteger[] mul(BigInteger[] x, BigInteger[] y) {
        // [1,1][1,1]     = 1xx 1x 1x 1
        // [1,1,1][1,1,1] = 1xxxx 1xxx 1xxx 1xx 1xx 1x 1x 1
//        BigInteger[]

        for (int indexX = 0; indexX < x.length; indexX++) {
            for (int indexY = 0; indexY < y.length; indexY++) {
                x[indexX].multiply(y[indexY]);
            }
        }
        return null;
    }
}
