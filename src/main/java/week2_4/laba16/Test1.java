package week2_4.laba16;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int arr[] = {2,3,4,1};
        System.out.println(Arrays.toString(arr));
        //System.arraycopy(arr, 0, arr,1,3);
        //System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(InsertionSorter.sort(arr)));
    }
}