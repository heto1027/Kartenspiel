import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Model {
    private final ArrayList<ModelKarten> kartenListe = new ArrayList<>();
    private final ArrayList<ModelSpieler> spielerListe = new ArrayList<>();
    private ModelKarten aktuelleKarte;
    private int anzahlKartenDeck;

    public Model() {
        initialisierenKarten();
        initialisierenSpieler();
        spielerListe.get(0).setGewSpiele(0);
    }

    public void initialisierenStartWerte() {
        setRestKartenDeck(52);
        setAktuelleKarte(null);
        for (ModelKarten naechsteKarte : kartenListe) {
            naechsteKarte.setFreigabe(true);
        }
        for (ModelSpieler naechsterSpieler : spielerListe) {
            naechsterSpieler.getSpielHand().clear();
        }
    }

    public void initialisierenKarten() {
        kartenListe.add(new ModelKarten("Herz", "Ass", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Herz Ass.png")));
        kartenListe.add(new ModelKarten("Herz", "2", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Herz 2.png")));
        kartenListe.add(new ModelKarten("Herz", "3", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Herz 3.png")));
        kartenListe.add(new ModelKarten("Herz", "4", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Herz 4.png")));
        kartenListe.add(new ModelKarten("Herz", "5", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Herz 5.png")));
        kartenListe.add(new ModelKarten("Herz", "6", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Herz 6.png")));
        kartenListe.add(new ModelKarten("Herz", "7", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Herz 7.png")));
        kartenListe.add(new ModelKarten("Herz", "8", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Herz 8.png")));
        kartenListe.add(new ModelKarten("Herz", "9", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Herz 9.png")));
        kartenListe.add(new ModelKarten("Herz", "10", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Herz 10.png")));
        kartenListe.add(new ModelKarten("Herz", "Bube", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Herz Bu.png")));
        kartenListe.add(new ModelKarten("Herz", "Dame", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Herz Da.png")));
        kartenListe.add(new ModelKarten("Herz", "König", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Herz Kö.png")));
        kartenListe.add(new ModelKarten("Karo", "Ass", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Karo Ass.png")));
        kartenListe.add(new ModelKarten("Karo", "2", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Karo 2.png")));
        kartenListe.add(new ModelKarten("Karo", "3", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Karo 3.png")));
        kartenListe.add(new ModelKarten("Karo", "4", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Karo 4.png")));
        kartenListe.add(new ModelKarten("Karo", "5", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Karo 5.png")));
        kartenListe.add(new ModelKarten("Karo", "6", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Karo 6.png")));
        kartenListe.add(new ModelKarten("Karo", "7", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Karo 7.png")));
        kartenListe.add(new ModelKarten("Karo", "8", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Karo 8.png")));
        kartenListe.add(new ModelKarten("Karo", "9", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Karo 9.png")));
        kartenListe.add(new ModelKarten("Karo", "10", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Karo 10.png")));
        kartenListe.add(new ModelKarten("Karo", "Bube", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Karo Bu.png")));
        kartenListe.add(new ModelKarten("Karo", "Dame", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Karo Da.png")));
        kartenListe.add(new ModelKarten("Karo", "König", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Karo Kö.png")));
        kartenListe.add(new ModelKarten("Pik", "Ass", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Pik Ass.png")));
        kartenListe.add(new ModelKarten("Pik", "2", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Pik 2.png")));
        kartenListe.add(new ModelKarten("Pik", "3", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Pik 3.png")));
        kartenListe.add(new ModelKarten("Pik", "4", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Pik 4.png")));
        kartenListe.add(new ModelKarten("Pik", "5", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Pik 5.png")));
        kartenListe.add(new ModelKarten("Pik", "6", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Pik 6.png")));
        kartenListe.add(new ModelKarten("Pik", "7", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Pik 7.png")));
        kartenListe.add(new ModelKarten("Pik", "8", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Pik 8.png")));
        kartenListe.add(new ModelKarten("Pik", "9", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Pik 9.png")));
        kartenListe.add(new ModelKarten("Pik", "10", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Pik 10.png")));
        kartenListe.add(new ModelKarten("Pik", "Bube", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Pik Bu.png")));
        kartenListe.add(new ModelKarten("Pik", "Dame", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Pik Da.png")));
        kartenListe.add(new ModelKarten("Pik", "König", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Pik Kö.png")));
        kartenListe.add(new ModelKarten("Kreuz", "Ass", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Kreuz Ass.png")));
        kartenListe.add(new ModelKarten("Kreuz", "2", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Kreuz 2.png")));
        kartenListe.add(new ModelKarten("Kreuz", "3", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Kreuz 3.png")));
        kartenListe.add(new ModelKarten("Kreuz", "4", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Kreuz 4.png")));
        kartenListe.add(new ModelKarten("Kreuz", "5", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Kreuz 5.png")));
        kartenListe.add(new ModelKarten("Kreuz", "6", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Kreuz 6.png")));
        kartenListe.add(new ModelKarten("Kreuz", "7", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Kreuz 7.png")));
        kartenListe.add(new ModelKarten("Kreuz", "8", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Kreuz 8.png")));
        kartenListe.add(new ModelKarten("Kreuz", "9", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Kreuz 9.png")));
        kartenListe.add(new ModelKarten("Kreuz", "10", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Kreuz 10.png")));
        kartenListe.add(new ModelKarten("Kreuz", "Bube", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Kreuz Bu.png")));
        kartenListe.add(new ModelKarten("Kreuz", "Dame", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Kreuz Da.png")));
        kartenListe.add(new ModelKarten("Kreuz", "König", true, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images\\Kreuz Kö.png")));
        kartenListe.add(new ModelKarten("Leer", "Leer", false, new ImageIcon("C:\\Users\\Tobias Heinz\\IdeaProjects\\Kartenspiel\\src\\images/Leer.png")));
    }

    public void initialisierenSpieler() {
        spielerListe.add(new ModelSpieler(SpielerOptionen.Spieler));
        spielerListe.add(new ModelSpieler(SpielerOptionen.Com));
    }

    public void setRestKartenDeck(int restKartenDeck) {
        anzahlKartenDeck = restKartenDeck;
    }

    public void setAktuelleKarte(ModelKarten aktuelleKarte) {
        this.aktuelleKarte = aktuelleKarte;
    }

    public void setRestKarten(SpielerOptionen spielerOptionen, int anzahl) {
        for (ModelSpieler naechsterSpieler : spielerListe) {
            if (spielerOptionen.equals(naechsterSpieler.getSpielerOptionen())) {
                naechsterSpieler.setRestKarten(anzahl);
                break;
            }
        }
    }

    public int getRestKartenDeck() {
        return anzahlKartenDeck;
    }

    public ModelKarten getAktuelleKarte() {
        return aktuelleKarte;
    }

    public ArrayList<ModelKarten> getKartenListe() {
        return kartenListe;
    }

    public ArrayList<ModelKarten> getSpielHand(SpielerOptionen spieler) {
        for (ModelSpieler naechsterSpieler : spielerListe) {
            if (naechsterSpieler.getSpielerOptionen().equals(spieler)) {
                return naechsterSpieler.getSpielHand();
            }
        }
        return null;
    }

    public int getRestKarten(SpielerOptionen spielerOptionen) {
        for (ModelSpieler naechsterSpieler : spielerListe) {
            if (naechsterSpieler.getSpielerOptionen().equals(spielerOptionen)) {
                return naechsterSpieler.getRestKarten();
            }
        }
        return -1;
    }

    public int getGewSpiele(SpielerOptionen spieler) {
        for (ModelSpieler naechsterSpieler : spielerListe) {
            if (naechsterSpieler.getSpielerOptionen().equals(spieler)) {
                return naechsterSpieler.getGewSpiele();
            }
        }
        return -1;
    }

    public void generiereStartKarten() {
        for (ModelSpieler naechsterSpieler : spielerListe) {
            for (int i = 0; i < 7; i++) {
                ModelKarten karte = bestimmeNeueKarte();
                naechsterSpieler.fuegeKarteAufSpielHandHinzu(karte);
                verringereAnzahlKartenDeckUmEins();
            }
        }
    }

    public ModelKarten generiereAktuelleKarte() {
        aktuelleKarte = bestimmeNeueKarte();
        verringereAnzahlKartenDeckUmEins();
        return aktuelleKarte;
    }

    public ModelKarten bestimmeNeueKarte() {
        ModelKarten karte;
        do {
            Random generator = new Random();
            karte = kartenListe.get(generator.nextInt(52));
            if (karte.isFreigabe()) {
                karte.setFreigabe(false);
                return karte;
            }
        } while (true);
    }

    public void aendereSpielHand(SpielerOptionen spielerOptionen, ModelKarten karte, boolean karteHinzufuegenOderEntfernen) {
        for (ModelSpieler naechsterSpieler : spielerListe) {
            if (naechsterSpieler.getSpielerOptionen().equals(spielerOptionen)) {
                if (karteHinzufuegenOderEntfernen) {
                    naechsterSpieler.fuegeKarteAufSpielHandHinzu(karte);
                } else {
                    naechsterSpieler.loescheKarteAufSpielHand(karte);
                }
            }
        }
    }

    public ModelKarten konvertiereStringZuKarte(String karte) {
        for (ModelKarten naechsteKarte : kartenListe) {
            if (String.valueOf(naechsteKarte).equals(karte)) {
                return naechsteKarte;
            }
        }
        return null;
    }

    public void verringereAnzahlKartenDeckUmEins() {
        anzahlKartenDeck -= 1;
    }

    public void erhoeheGewSpiele(SpielerOptionen spielerOptionen) {
        for (ModelSpieler naechsterSpieler : spielerListe) {
            if (naechsterSpieler.getSpielerOptionen().equals(spielerOptionen)) {
                naechsterSpieler.setGewSpiele(naechsterSpieler.getGewSpiele() + 1);
            }
        }
    }

    public void mischeKarten() {
        int anzahlFreigegebeneKarten = 0;
        for (ModelKarten naechsteKarte : kartenListe) {
            if (!getSpielHand(SpielerOptionen.Spieler).contains(naechsteKarte) && !getSpielHand(SpielerOptionen.Com).contains(naechsteKarte)
                    && !getAktuelleKarte().equals(naechsteKarte) && !naechsteKarte.equals(getKartenListe().get(52))) {
                naechsteKarte.setFreigabe(true);
                anzahlFreigegebeneKarten += 1;
            }
        }
        anzahlKartenDeck = anzahlFreigegebeneKarten;
    }
}