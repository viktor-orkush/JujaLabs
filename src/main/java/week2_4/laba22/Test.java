package week2_4.laba22;

public class Test {
    public static void main(String[] args) {
        Object res = ArrayUtils.rotateClockwise(new int[][] {{0, 0}, null});
        if (res != null) {
            throw new AssertionError();
        }
        System.out.print("OK");
    }
}
