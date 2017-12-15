package Instruments;


public class Guitar extends Instrument{

    private int stringNumber;

    public Guitar(InstrumentType type, String colour, double buyingPrice, double sellingPrice, int stringNumber) {
        super(type, colour, buyingPrice, sellingPrice);
        this.stringNumber = stringNumber;
    }

    public int getStringNumber() {
        return stringNumber;
    }
}
