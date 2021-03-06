package Accessories;

import Behaviours.ISell;

public class Accessory implements ISell{

    String name;
    double buyingPrice;
    double sellingPrice;

    public Accessory(String name, double buyingPrice, double sellingPrice) {
        this.name = name;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double calculateMarkUp(){
        double markUp = (this.sellingPrice - this.buyingPrice);
        return markUp;
    }
}
