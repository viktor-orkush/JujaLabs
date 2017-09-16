package week2_4.laba12;

import java.util.Arrays;

/**
 * Created by Viktor on 17.07.2017.
 */
public class Test2 {
        public static void main(String[] args) {
            int[] array = {1, 2, 2, 1, 0};
            int[] expected = {0, 3};
            int[] actual = LAB2_2.lookFor(array);

            if (!Arrays.equals(actual, expected)) {
                throw new AssertionError();
            }

            System.out.print("OK");
        }
}
