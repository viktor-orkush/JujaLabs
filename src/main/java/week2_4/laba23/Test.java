package week2_4.laba23;

public class Test {
    public static void main(String[] args) {
        int [][][] matrix = new int[1][0][];
        Object res = ArrayUtils.rotateClockwise(matrix);
        if (res != null) {
            throw new AssertionError();
        }
        System.out.print("OK");
    }
}