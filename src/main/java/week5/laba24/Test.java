package week5.laba24;

/**
 * Created by Viktor on 27.07.2017.
 */
public class Test {
    public static int a = 0;
    public int b = 0;

    public Test() {
        this.b = a++;
    }
    public static int get() {
        return a++ + a++;
    }
    public static void main(String[] args) {
        System.out.println(get());
        System.out.println(get());
        System.out.println(get());
    }
}
