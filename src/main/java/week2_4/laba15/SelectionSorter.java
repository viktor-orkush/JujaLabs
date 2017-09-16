package week2_4.laba15;

public class SelectionSorter {
    public static int[] sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            int temp = arr[barrier];
            int tempIndex = barrier;
            for (int index = barrier + 1; index < arr.length; index++) {
                if (temp > arr[index]) {
                    temp = arr[index];
                    tempIndex = index;
                }
            }
            arr[tempIndex] = arr[barrier];
            arr[barrier] = temp;

        }
        return arr;
    }
}
