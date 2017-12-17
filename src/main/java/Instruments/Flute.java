package Instruments;

import Behaviours.IPlay;

public class Flute extends Instrument implements IPlay{

    String key;

    public Flute(InstrumentType type, String colour, double buyingPrice, double sellingPrice, String key) {
        super(type, colour, buyingPrice, sellingPrice);
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    @Override
    public String play() {
        return "The " + this.getClass().getSimpleName() + " goes Doodie DoOOoo!";
        }

}

