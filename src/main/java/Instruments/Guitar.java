package Instruments;


import Behaviours.IPlay;

public class Guitar extends Instrument implements IPlay{

    private int stringNumber;

    public Guitar(InstrumentType type, String colour, double buyingPrice, double sellingPrice, int stringNumber) {
        super(type, colour, buyingPrice, sellingPrice);
        this.stringNumber = stringNumber;
    }

    public int getStringNumber() {
        return stringNumber;
    }

    @Override
    public String play() {
        return "The " + this.getClass().getSimpleName() + " goes Twang!";

    }
}
