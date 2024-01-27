import java.util.ArrayList;

public class ModelSpieler {
    private final ArrayList<ModelKarten> spielHand = new ArrayList<>();
    private final SpielerOptionen spielerOptionen;
    private int gewSpiele = 0;
    private int restKarten = 0;


    public ModelSpieler(SpielerOptionen spielerOptionen) {
        this.spielerOptionen = spielerOptionen;
    }

    public SpielerOptionen getSpielerOptionen() {
        return spielerOptionen;
    }

    public ArrayList<ModelKarten> getSpielHand() {
        return spielHand;
    }

    public int getRestKarten() {
        return restKarten;
    }

    public int getGewSpiele() {
        return gewSpiele;
    }

    public void setRestKarten(int restKarten) {
        this.restKarten = restKarten;
    }

    public void setGewSpiele(int gewSpiele) {
        this.gewSpiele = gewSpiele;
    }

    public void fuegeKarteAufSpielHandHinzu(ModelKarten karte) {
        spielHand.add(karte);
    }

    public void loescheKarteAufSpielHand(ModelKarten karte) {
        spielHand.remove(karte);
    }

    @Override
    public String toString() {
        return "" + getSpielerOptionen();
    }
}