package week2_4.laba21;

/**
 * Created by Viktor on 21.07.2017.
 */
public class MatrixUtils {
    public static int[][] mul(int[][] fst, int[][] snd) {
        int[][] result = new int[fst.length][snd[0].length];
        for(int i=0; i < result.length; i++){
            for(int n = 0; n < result[0].length; n++) {
                for (int j = 0; j < snd.length; j++) {

                    result[i][n] += fst[n][j] * snd[j][n];
                }
            }
        }
        return result;
    }
}
