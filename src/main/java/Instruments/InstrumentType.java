package Instruments;

public enum InstrumentType {
    STRING("String"),
    BRASS("Brass"),
    WOODWIND("Woodwind"),
    PERCUSSION("Percussion"),
    KEYBOARD("Keyboard");

  private final String type;


    InstrumentType(String type) {
        this.type = type;
    }

    public String getType(){
       return this.type;
    }
}
