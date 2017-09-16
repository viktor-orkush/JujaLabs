package week5.laba32;

public class Test1 {
    public static void main(String[] args) {

        // check null
        String actualSortedShipStringIfNull = OdessaSeaPort.sortSumPaymentAsc(null);
        if (!((actualSortedShipStringIfNull!=null) && (actualSortedShipStringIfNull.isEmpty())))
            throw new AssertionError("Result cannot be null, expected to be empty string");

        System.out.print("OK");
    }
}