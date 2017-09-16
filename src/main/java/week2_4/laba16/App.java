package week2_4.laba16;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        int[] array = new int[256 * 1024];
        Random rnd = new Random(0);
        for (int k = 0; k < array.length; k++) {
            array[k] = rnd.nextInt();
        }
        long t1 = System.nanoTime();
        InsertionSorter.sort1(array);
        System.out.println("A:" + (System.nanoTime() - t1) / 1_000_000);
    }
}
