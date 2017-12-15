package Instruments;

public class Flute extends Instrument{

    String key;

    public Flute(InstrumentType type, String colour, double buyingPrice, double sellingPrice, String key) {
        super(type, colour, buyingPrice, sellingPrice);
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
