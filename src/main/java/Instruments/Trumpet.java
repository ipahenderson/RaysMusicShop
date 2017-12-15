package Instruments;

public class Trumpet extends Instrument {

    int valveNumber;

    public Trumpet(InstrumentType type, String colour, double buyingPrice, double sellingPrice, int valveNumber) {
        super(type, colour, buyingPrice, sellingPrice);
        this.valveNumber = valveNumber;
    }

    public int getValveNumber() {
        return valveNumber;
    }
}
