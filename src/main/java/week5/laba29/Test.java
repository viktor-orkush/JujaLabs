package week5.laba29;

public class Test {
    public static void main(String[] args) {
        String testTankerName = "TestTankerName";
        float testTankerLength = 1000;
        float testTankerWidth = 1000;
        float testTankerDisplacement = 1000;
        float testTankerVolume = 100;

        float expectedTankerPaymentRentTaxDefault = testTankerVolume * Tanker.DEFAULT_RENTAL;

        Tanker tanker = new Tanker(testTankerName, testTankerLength, testTankerWidth, testTankerDisplacement, testTankerVolume);

        //check payment if rent tax is default
        float actualTankerPaymentRentTaxDefault = tanker.calculatePayment();
        if (actualTankerPaymentRentTaxDefault != expectedTankerPaymentRentTaxDefault)
            throw new AssertionError("Rent tax is default= " + Tanker.DEFAULT_RENTAL + " and expected payment value= " + expectedTankerPaymentRentTaxDefault + " but found " + actualTankerPaymentRentTaxDefault);


        System.out.print("OK");
    }
}