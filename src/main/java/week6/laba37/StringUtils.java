package week6.laba37;

import java.util.Arrays;

import static java.lang.Math.abs;

public class StringUtils {
    public static String rightShift(String arg, int delta) {
        if (delta == 0 || arg == "") return arg;
        if (delta > 0) delta = abs(delta) % arg.length();
        if (delta < 0) {
            delta = abs(delta) % arg.length();
            delta = arg.length() - abs(delta);
        }
        return shift(arg, delta);
    }

    public static String shift(String arg, int delta) {
        String cloneArg = arg;
        String result = "";
        result = cloneArg.substring(cloneArg.length() - delta ,cloneArg.length());
        result +=cloneArg.substring(0, cloneArg.length() - delta);
        return result;
    }
}