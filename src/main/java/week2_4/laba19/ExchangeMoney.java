package week2_4.laba19;


public class ExchangeMoney {

    static int count = 0;
    static int i = 0;
    //static int[] arr = new int[100];

    public static void main(String[] args) {
        int count = 0;
        System.out.println("10 = " + exchangeAmountOfCoinsBrutForce(19));
        //System.out.println("arr = " + Arrays.toString(arr));
    }

    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {
        if (amountForExchange - 100 >= 0) f100(amountForExchange);
        else if (amountForExchange - 50 >= 0) f50(amountForExchange);
        else if (amountForExchange - 25 >= 0) f25(amountForExchange);
        else if (amountForExchange - 15 >= 0) f15(amountForExchange);
        else if (amountForExchange - 10 >= 0) f10(amountForExchange);
        else if (amountForExchange - 5 >= 0) f5(amountForExchange);
        else if (amountForExchange - 2 >= 0) f2(amountForExchange);
        else if (amountForExchange - 1 >= 0) f1(amountForExchange);


        return count;
    }

    public static void f1(int amountForExchange) {
        if (amountForExchange == 0) {
            count++;
            return;
        }
        if (amountForExchange > 0) f1(amountForExchange - 1);
        return;
    }

    public static void f2(int amountForExchange) {
        if (amountForExchange == 0) {
            count++;
            return;
        }
        if (amountForExchange > 0){
            f2(amountForExchange - 2);
            f1(amountForExchange);
        }
        return;
    }

    public static void f5(int amountForExchange) {
        if (amountForExchange == 0) {
            count++;
            return;
        }
        if (amountForExchange > 0){
            f5(amountForExchange - 5);
            f2(amountForExchange);
        }
        return;
    }

    public static void f10(int amountForExchange) {
        if (amountForExchange == 0) {
            count++;
            return;
        }
        if (amountForExchange > 0){
            f10(amountForExchange - 10);
            f5(amountForExchange);
        }
        return;
    }

    public static void f15(int amountForExchange) {
        if (amountForExchange == 0) {
            count++;
            return;
        }
        if (amountForExchange >0){
            f15(amountForExchange - 15);
            f10(amountForExchange);
        }
    }

    public static void f25(int amountForExchange) {
        if (amountForExchange == 0) {
            count++;
            return;
        }
        if (amountForExchange > 0){
            f25(amountForExchange - 25);
            f15(amountForExchange);
        }
    }

    public static void f50(int amountForExchange) {
        if (amountForExchange == 0) {
            count++;
            return;
        }
        if (amountForExchange > 0){
            f50(amountForExchange - 50);
            f25(amountForExchange);
        }
    }

    public static void f100(int amountForExchange) {
        if (amountForExchange == 0) {
            count++;
            return;
        }
        if (amountForExchange > 0){
            f100(amountForExchange - 100);
            f50(amountForExchange);
        }
    }
}
