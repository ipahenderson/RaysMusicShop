package Instruments;

public class Piano extends Instrument{
    int keyNumber;

    public Piano(InstrumentType type, String colour, double buyingPrice, double sellingPrice, int keyNumber) {
        super(type, colour, buyingPrice, sellingPrice);
        this.keyNumber = keyNumber;
    }

    public int getKeyNumber() {
        return keyNumber;
    }
}
