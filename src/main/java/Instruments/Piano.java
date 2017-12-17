package Instruments;

import Behaviours.IPlay;

public class Piano extends Instrument implements IPlay{
    int keyNumber;

    public Piano(InstrumentType type, String colour, double buyingPrice, double sellingPrice, int keyNumber) {
        super(type, colour, buyingPrice, sellingPrice);
        this.keyNumber = keyNumber;
    }

    public int getKeyNumber() {
        return keyNumber;
    }

    @Override
    public String play() {
        return "The " + this.getClass().getSimpleName() + " goes Tinkle Tinkle!";
    }
}
