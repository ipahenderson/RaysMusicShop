package Instruments;

import Behaviours.IPlay;

public class Trumpet extends Instrument implements IPlay {

    int valveNumber;

    public Trumpet(InstrumentType type, String colour, double buyingPrice, double sellingPrice, int valveNumber) {
        super(type, colour, buyingPrice, sellingPrice);
        this.valveNumber = valveNumber;
    }

    public int getValveNumber() {
        return valveNumber;
    }

    @Override
    public String play() {
        return "The " + this.getClass().getSimpleName() + " goes Parp!";

    }
}
