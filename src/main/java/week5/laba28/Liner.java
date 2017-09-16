package week5.laba28;

public class Liner extends AbstractShip {

    private int passengers;
    public static final float DEFAULT_RENTAL = 1000;

    public Liner(String name, float length, float width, float displacement, int passengers) {
        super(name, length, width, displacement);
        this.passengers = passengers;
    }

    @Override
    public float calculatePayment() {
        float result = 0;
        if(passengers>0) result = DEFAULT_RENTAL * passengers;
        else result = DEFAULT_RENTAL;
        return result;
    }

    public float calculatePayment(float renTax) {
        float result = 0;
        if(renTax>0) result = renTax * passengers;
        else result = DEFAULT_RENTAL * passengers;
        return result;
    }
}

abstract class AbstractShip {
    private String name;
    private float length;
    private float width;
    private float displacement;

    public AbstractShip(String name, float length, float width, float displacement) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.displacement = displacement;
    }

    public abstract float calculatePayment();

    public String toPrint() {
        return "Name=" + name +
                "Length=" + length +
                "Width=" + width +
                "Displacement=" + displacement;
    }

    public String getName() {
        return name;
    }
}
