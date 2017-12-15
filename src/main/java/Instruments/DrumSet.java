package Instruments;

public class DrumSet extends Instrument{

    int drumNumber;

    public DrumSet(InstrumentType type, String colour, double buyingPrice, double sellingPrice, int drumNumber) {
        super(type, colour, buyingPrice, sellingPrice);
        this.drumNumber = drumNumber;
    }

    public int getDrumNumber() {
        return drumNumber;
    }
}
