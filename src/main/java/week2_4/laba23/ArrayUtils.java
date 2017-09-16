package week2_4.laba23;

import java.util.Arrays;

/**
 * Created by Viktor on 23.07.2017.
 */
public class ArrayUtils {
    public static int[][][] rotateClockwise(int[][][] arg) {
        int[][][] result;
        System.out.println(Arrays.toString(arg[0]) + "    ");
        if (arg == null || arg.length < 1 || arg[0] == null || arg[0].length < 1 || arg[0][0] == null || arg[0][0].length < 1 || arg.length != arg[0].length)
            return null;
        else result = new int[arg.length][arg.length][arg.length];
        for (int i = 0; i < result.length; i++) {
            for (int n = 0; n < result.length; n++) {
                for (int j = 0; j < result.length; j++) {
                    if (arg[result.length - 1 - n] == null || arg.length != arg[i].length || arg.length != arg[i][n].length) return null;
                    if(i == n && n == j && j == 0 || i == n && n == j && j == result.length - 1) {
                        result[i][n][j] = arg[i][n][j];
                    }
                    else result[i][n][j] = arg[j][i][n];
                    //result.length - 1 - n
                }
            }
        }
        return result;
    }
}
