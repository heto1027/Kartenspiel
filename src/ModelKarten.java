import javax.swing.*;

public class ModelKarten {
    private final String wert;
    private final String symbol;
    private boolean freigabe;
    private final ImageIcon bildDateiPfad;

    public ModelKarten(String symbol, String wert, boolean freigabe, ImageIcon bildDateipfad) {
        this.symbol = symbol;
        this.wert = wert;
        this.freigabe = freigabe;
        this.bildDateiPfad=bildDateipfad;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getWert() {
        return wert;
    }

    public ImageIcon getBildDateiPfad() {
        return bildDateiPfad;
    }

    public boolean isFreigabe() {
        return freigabe;
    }

    public void setFreigabe(boolean freigabe) {
        this.freigabe = freigabe;
    }

    @Override
    public String toString() {
        return getSymbol() + " " + getWert();
    }
}