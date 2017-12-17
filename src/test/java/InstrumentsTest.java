import Instruments.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.notification.RunListener;

import static org.junit.Assert.assertEquals;

public class InstrumentsTest {

DrumSet drumSet;
Flute flute;
Guitar guitar;
Piano piano;
Trumpet trumpet;


@Before
    public void before(){
    drumSet = new DrumSet(InstrumentType.PERCUSSION,"Black", 400.00, 700.00, 5);
    flute = new Flute(InstrumentType.WOODWIND, "Silver", 240.00, 305.00,"C#");
    guitar = new Guitar(InstrumentType.STRING, "Red", 590.00, 720.00, 6);
    piano = new Piano(InstrumentType.KEYBOARD, "White", 2000.00, 2200.00, 88);
    trumpet = new Trumpet(InstrumentType.BRASS, "Gold", 345.00, 415.00, 3);
}


    @Test
    public void getType() {
    assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void setType() {
    piano.setType(InstrumentType.STRING);
    assertEquals(InstrumentType.STRING, piano.getType());
    }

    @Test
    public void getColour() {
    assertEquals("Black", drumSet.getColour());
    }

    @Test
    public void setColour() {
    drumSet.setColour("Brown");
    assertEquals("Brown", drumSet.getColour());
    }

    @Test
    public void getBuyingPrice() {
    assertEquals(2000.00, piano.getBuyingPrice(), 0.01);
    }

    @Test
    public void setBuyingPrice() {
    piano.setBuyingPrice(2100.00);
    assertEquals(2100.00, piano.getBuyingPrice(), 0.01);
    }

    @Test
    public void getSellingPrice() {
    assertEquals(415.00, trumpet.getSellingPrice(), 0.01);
    }

    @Test
    public void setSellingPrice() {
    trumpet.setSellingPrice(420.00);
    assertEquals(420.00, trumpet.getSellingPrice(), 0.01);
    }

    @Test
    public void getTypeName() {
    assertEquals("Brass", trumpet.getTypeName());
    }

    @Test
    public void trumpetHasValves(){
    assertEquals(3, trumpet.getValveNumber());
    }

    @Test
    public void pianoHasKeys(){
    assertEquals(88, piano.getKeyNumber());
    }

    @Test
    public void guitarHasStrings(){
    assertEquals(6, guitar.getStringNumber());
    }

    @Test
    public void fluteHasKey(){
    assertEquals("C#", flute.getKey());
    }

    @Test
    public void drumHasNumber(){
    assertEquals(5, drumSet.getDrumNumber());
    }

    @Test
    public void instrumentCanPlay(){
    assertEquals("The Trumpet goes Parp!", trumpet.play());
    }


    @Test
    public void canCalculateMarkUp(){
    assertEquals(70.00, trumpet.calculateMarkUp(), 0.01);
    }





}
