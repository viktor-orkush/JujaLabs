package week5.laba32;

import java.util.Arrays;

public class Liner extends AbstractShip {

    private int passengers;
    public static final float DEFAULT_RENTAL = 1000;

    public Liner(String name, float length, float width, float displacement, int passengers) {
        super(name, length, width, displacement);
        this.passengers = passengers;
    }

    @Override
    public float calculatePayment() {
        return passengers * DEFAULT_RENTAL;
    }

    public float calculatePayment(float rentTax) {
        if (rentTax > 0) {
            return passengers * rentTax;
        } else {
            return calculatePayment();
        }
    }
}

class Tanker extends AbstractShip {
    private float volume;
    public static final float DEFAULT_RENTAL = 250;

    public Tanker(String name, float length, float width, float displacement, float volume) {
        super(name, length, width, displacement);
        this.volume = volume;
    }

    @Override
    public float calculatePayment() {
        return volume * DEFAULT_RENTAL;
    }

    public float calculatePayment(float rentTax) {
        if (rentTax > 0) {
            return volume * rentTax;
        } else {
            return calculatePayment();
        }
    }
}

class Cargo extends AbstractShip {
    private float tonnage;
    public static final float DEFAULT_RENTAL=550;

    public Cargo(String name, float length, float width, float displacement, float tonnage) {
        super(name, length, width, displacement);
        this.tonnage = tonnage;
    }

    @Override
    public float calculatePayment() {
        return tonnage * DEFAULT_RENTAL;
    }

    public float calculatePayment(float rentTax) {
        if (rentTax > 0) {
            return tonnage * rentTax;
        } else {
            return calculatePayment();
        }
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

    static class ShipRent implements Comparable {
        AbstractShip ship;
        float shipPayment;
        public ShipRent (AbstractShip ship){
            this.ship = ship;
            this.shipPayment = ship.calculatePayment();
        }

        public int compareTo(Object o ) {
            ShipRent shipRent = (ShipRent) o;
            return (int) (shipPayment - shipRent.shipPayment);
        }
        public String toPrint(){
            return  ship.getName() +"="+ shipPayment;
        }
    }
}

class OdessaSeaPort {

    public static String sortSumPaymentAsc(AbstractShip[] arrayShips) {
        String result = "";
        if(arrayShips == null) return result;
        AbstractShip.ShipRent[] shipRents = new AbstractShip.ShipRent[arrayShips.length];



        for (int index = 0; index < arrayShips.length; index++) {
            shipRents[index] = new AbstractShip.ShipRent(arrayShips[index]);
        }
        Arrays.sort(shipRents);

        for (int index = 0; index < shipRents.length; index++) {
            result += shipRents[index].toPrint();
        }
    return result;
    }
}
