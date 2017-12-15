package Instruments;

public abstract class Instrument {

    private InstrumentType type;
    private String colour;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(InstrumentType type, String colour, double buyingPrice, double sellingPrice) {
        this.type = type;
        this.colour = colour;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getTypeName(){
        return this.type.getType();
    }
}
