package Shops;

import Behaviours.ISell;
import Instruments.Trumpet;

import java.util.ArrayList;

public class Shop {

    ArrayList<ISell> stock;
    double stockValue;
    double stockProfit;
    double stockCost;

    public Shop(ArrayList<ISell> stock) {
        this.stock = stock;
        this.stockValue = 0.0;
        this.stockProfit = 0.0;
        this.stockCost = 0.0;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public double getStockValue() {
        return stockValue;
    }

    public void setStockValue(double stockValue) {
        this.stockValue = stockValue;
    }

    public double getStockProfit() {
        return stockProfit;
    }

    public void setStockProfit(double stockProfit) {
        this.stockProfit = stockProfit;
    }

    public double getStockCost() {
        return stockCost;
    }

    public void setStockCost(double stockCost) {
        this.stockCost = stockCost;
    }

    public int stockCount() {
       return  this.stock.size();
    }

    public void addStock(ISell item) {
        this.stock.add(item);
    }


    public double calculateTotalProfit(){
        double totalProfit = 0;
        for (ISell item : stock){
            totalProfit += item.calculateMarkUp();
        }
        return totalProfit;
    }
}
