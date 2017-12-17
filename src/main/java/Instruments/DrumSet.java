package Instruments;

import Behaviours.IPlay;

public class DrumSet extends Instrument implements IPlay{

    int drumNumber;

    public DrumSet(InstrumentType type, String colour, double buyingPrice, double sellingPrice, int drumNumber) {
        super(type, colour, buyingPrice, sellingPrice);
        this.drumNumber = drumNumber;
    }

    public int getDrumNumber() {
        return drumNumber;
    }

    @Override
    public String play() {
        return "The " + this.getClass().getSimpleName() + " goes Boom Boom Tsss!";
    }
}
