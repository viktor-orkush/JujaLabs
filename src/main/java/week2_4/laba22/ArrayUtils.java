package week2_4.laba22;

import java.util.Arrays;

public class ArrayUtils {
    public static int[][] rotateClockwise(int[][] arg) {
        int [][] result;
        System.out.println(Arrays.toString(arg) + "    ");
        if( arg == null || arg.length <1 || arg[0] == null || arg[0].length<1 || arg.length != arg[0].length) return null;
        else result = new int[arg.length][arg.length];
        for(int i= 0; i<result.length; i++){
            for(int n =0; n<result.length; n++){
                if ( arg [result.length - 1 - n] == null || arg.length != arg[i].length) return null;
                result[i][n] = arg [result.length - 1 - n][i];
            }
        }
        return result;
    }
}
