package week2_4.laba16;

import java.util.Arrays;

public class InsertionSorter {
    public static void sort1(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            int location = k - 1;
            while (location >= 0 && arr[location] > newElement) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = newElement;
        }
    }

    public static int[] sort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int from = 0;
            int to = k;
            int searchVal = arr[k];
            //int tempElem = 0;

            int indexOfChangVal = Arrays.binarySearch(arr, from, to, searchVal);
            if (indexOfChangVal <0)  indexOfChangVal = Math.abs(indexOfChangVal)-1;
//            int indexOfChangVal = Arrays.binarySearch(arr, from, to, searchVal) - 1;

            if(indexOfChangVal < k) {
                System.arraycopy(arr, indexOfChangVal, arr, indexOfChangVal + 1, k - indexOfChangVal);
                arr[indexOfChangVal] = searchVal;
            }
        }
        return arr;
    }
}
