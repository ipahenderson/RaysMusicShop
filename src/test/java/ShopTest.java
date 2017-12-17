import Behaviours.ISell;
import Instruments.*;
import Accessories.*;
import Shops.Shop;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {


    Shop shop;
    DrumSet drumSet;
    Flute flute;
    Guitar guitar;
    Piano piano;
    Trumpet trumpet;
    Accessory guitarStrings;
    ArrayList<ISell> stock;


    @Before
    public void before(){
        guitarStrings = new Accessory("Guitar Strings", 5.00, 8.00);
        drumSet = new DrumSet(InstrumentType.PERCUSSION,"Black", 400.00, 700.00, 5);
        flute = new Flute(InstrumentType.WOODWIND, "Silver", 240.00, 305.00,"C#");
        guitar = new Guitar(InstrumentType.STRING, "Red", 590.00, 720.00, 6);
        piano = new Piano(InstrumentType.KEYBOARD, "White", 2000.00, 2200.00, 88);
        trumpet = new Trumpet(InstrumentType.BRASS, "Gold", 345.00, 415.00, 3);
        stock = new ArrayList<>();
        stock.add(guitarStrings);
        stock.add(drumSet);
        stock.add(flute);
        stock.add(guitar);
        stock.add(piano );
        stock.add(trumpet);
        shop = new Shop(stock);
    }


    @Test
    public void shopHasStock(){
        assertEquals(6, shop.stockCount());
    }

    @Test
    public void canAddStock(){
        shop.addStock(trumpet);
        assertEquals(7, shop.stockCount());
    }

    @Test
    public void canRemoveStock(){
        shop.removeStock(trumpet);
        assertEquals(5, shop.stockCount());
    }

    @Test
    public void canGetTotalProfit(){
        assertEquals(768, shop.calculateTotalProfit(), 0.01);
    }


}



