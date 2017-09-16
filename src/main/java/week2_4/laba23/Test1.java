package week2_4.laba23;

import java.util.Arrays;

/**
 * Created by Viktor on 23.07.2017.
 */
public class Test1 {
        public static void main(String[] args) {
            int[][][] oldArray = {
                    {
                            {1, 2},
                            {3, 4},
                    },
                    {
                            {5, 6},
                            {7, 8},
                    },
            };
            int[][][] newExpectedArray = {
                    {
                            {1, 5},
                            {2, 6},
                    },
                    {
                            {3, 7},
                            {4, 8},
                    },
            };
            int[][][] newActualArray = ArrayUtils.rotateClockwise(oldArray);

            for (int i = 0; i < newActualArray.length; i++) {
                for (int n = 0; n < newActualArray.length; n++) {
                    for (int j = 0; j < newActualArray.length; j++) {
                        System.out.print(newActualArray[i][n][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }

            if (!Arrays.deepEquals(newActualArray, newExpectedArray)) {
                throw new AssertionError();
            }

            System.out.print("OK");
        }
}
