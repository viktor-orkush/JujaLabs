package week2_4.laba15;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Viktor on 19.07.2017.
 */
public class Test2 {
    public static void main(String[] args) {
        // fill random elements
        Random rnd = new Random(0);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(1000);
        }
        // library sort
        int[] expected = array.clone();
        Arrays.sort(expected);
        // lab sort
        int[] actual = array.clone();
        SelectionSorter.sort(actual);
        // compare results: library vs lab
        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError("expected = " + Arrays.toString(expected) + " but actual  = " + Arrays.toString(actual));
        }

        System.out.print("OK");
    }
}
