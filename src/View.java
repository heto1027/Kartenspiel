import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class View extends JFrame {
    private final Container cp = getContentPane();
    private final Model model;
    private final JLabel lbAktKarte = new JLabel();
    private final JLabel lbRestKarteCom = new JLabel();
    private final JLabel lbUebrigeKarte = new JLabel();
    private final JLabel lbGewSp = new JLabel();
    private final JLabel lbAusgabe = new JLabel();
    private final JTextField tfRestKartCom = new JTextField();
    private final JTextField tfUebrigeKarten = new JTextField();
    private final JTextField tfGewSp = new JTextField();
    private final JTextField tfAusgabe = new JTextField();
    private final JButton btnNeueKarte = new JButton();
    private final JButton btnStart = new JButton();
    private final JButton btnEnde = new JButton();
    private final JButton btnAktKarte = new JButton();
    private final JButton btnKartenSlot1 = new JButton();
    private final JButton btnKartenSlot2 = new JButton();
    private final JButton btnKartenSlot3 = new JButton();
    private final JButton btnKartenSlot4 = new JButton();
    private final JButton btnKartenSlot5 = new JButton();
    private final JButton btnKartenSlot6 = new JButton();
    private final JButton btnKartenSlot7 = new JButton();
    private final JButton btnKartenSlot8 = new JButton();
    private final JButton btnKartenSlot9 = new JButton();
    private final JButton btnWeiter = new JButton();
    private final JButton btnNeuesSpiel = new JButton();

    public View(Model model) {
        this.model = model;
        initialisierenMetaDaten();
        initialisierenJLabels();
        initialisierenJTextFields();
        initialisierenJButtons();
        setVisible(true);
    }

    private void initialisierenMetaDaten() {
        setTitle("Virtuelles Kartenspiel 2023");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        int frameWidth = 745;
        int frameHeight = 360;
        setSize(frameWidth, frameHeight);
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - getSize().width) / 2;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2;
        setLocation(x, y);
        setResizable(false);
        cp.setLayout(null);
    }

    private void initialisierenJLabels() {
        lbAktKarte.setBounds(304, 16, 102, 20);
        lbAktKarte.setText("Aktuelle Karte:");
        cp.add(lbAktKarte);

        lbRestKarteCom.setBounds(32, 32, 168, 28);
        lbRestKarteCom.setText("Restliche Karten Computer:");
        cp.add(lbRestKarteCom);

        lbUebrigeKarte.setBounds(424, 40, 94, 28);
        lbUebrigeKarte.setText("Übrige Karten:");
        cp.add(lbUebrigeKarte);

        lbGewSp.setBounds(424, 96, 94, 28);
        lbGewSp.setText("Gew. Spiele:");
        cp.add(lbGewSp);

        lbAusgabe.setBounds(8, 280, 70, 36);
        lbAusgabe.setText("Ausgabe:");
        cp.add(lbAusgabe);
    }

    private void initialisierenJTextFields() {
        tfRestKartCom.setBounds(216, 32, 38, 28);
        tfRestKartCom.setEditable(false);
        tfRestKartCom.setHorizontalAlignment(SwingConstants.RIGHT);
        cp.add(tfRestKartCom);

        tfUebrigeKarten.setBounds(536, 40, 38, 28);
        tfUebrigeKarten.setEditable(false);
        tfUebrigeKarten.setHorizontalAlignment(SwingConstants.RIGHT);
        cp.add(tfUebrigeKarten);

        tfGewSp.setBounds(528, 96, 46, 28);
        tfGewSp.setEditable(false);
        tfGewSp.setHorizontalAlignment(SwingConstants.RIGHT);
        cp.add(tfGewSp);

        tfAusgabe.setBounds(72, 285, 652, 28);
        tfAusgabe.setText("Drücken Sie zum Spielstart die START Taste.");
        tfAusgabe.setEditable(false);
        cp.add(tfAusgabe);
    }

    private void initialisierenJButtons() {
        btnStart.setBounds(616, 16, 83, 33);
        btnStart.setText("START");
        btnStart.setMargin(new Insets(2, 2, 2, 2));
        btnStart.addActionListener(this::btnStart_ActionPerformed);
        btnStart.setBackground(new Color(0xc0c0c0));
        cp.add(btnStart);

        btnNeueKarte.setBounds(32, 88, 147, 41);
        btnNeueKarte.setText("Neue Karte nehmen");
        btnNeueKarte.setMargin(new Insets(2, 2, 2, 2));
        btnNeueKarte.addActionListener(this::btnNeueKarte_ActionPerformed);
        btnNeueKarte.setBackground(new Color(0xc0c0c0));
        btnNeueKarte.setEnabled(false);
        cp.add(btnNeueKarte);

        btnWeiter.setBounds(200, 88, 83, 41);
        btnWeiter.setText("WEITER");
        btnWeiter.setMargin(new Insets(2, 2, 2, 2));
        btnWeiter.addActionListener(this::btnWeiter_ActionPerformed);
        btnWeiter.setBackground(new Color(0xc0c0c0));
        btnWeiter.setEnabled(false);
        cp.add(btnWeiter);

        btnNeuesSpiel.setBounds(608, 64, 99, 33);
        btnNeuesSpiel.setText("Neues Spiel");
        btnNeuesSpiel.setMargin(new Insets(2, 2, 2, 2));
        btnNeuesSpiel.addActionListener(this::btnNeuesSpiel_ActionPerformed);
        btnNeuesSpiel.setBackground(new Color(0xc0c0c0));
        btnNeuesSpiel.setEnabled(false);
        cp.add(btnNeuesSpiel);

        btnAktKarte.setBounds(312, 40, 75, 105);
        btnAktKarte.setText("");
        btnAktKarte.setMargin(new Insets(2, 2, 2, 2));
        btnAktKarte.setBorderPainted(false);
        btnAktKarte.setContentAreaFilled(false);
        btnAktKarte.setHorizontalAlignment(SwingConstants.LEFT);
        cp.add(btnAktKarte);

        btnKartenSlot1.setBounds(8, 168, 75, 105);
        btnKartenSlot1.setText("");
        btnKartenSlot1.setMargin(new Insets(2, 2, 2, 2));
        btnKartenSlot1.addActionListener(this::btnKartenSlot1_ActionPerformed);
        btnKartenSlot1.setBorderPainted(false);
        btnKartenSlot1.setContentAreaFilled(false);
        btnKartenSlot1.setHorizontalAlignment(SwingConstants.LEFT);
        cp.add(btnKartenSlot1);

        btnKartenSlot2.setBounds(88, 168, 75, 105);
        btnKartenSlot2.setText("");
        btnKartenSlot2.setMargin(new Insets(2, 2, 2, 2));
        btnKartenSlot2.addActionListener(this::btnKartenSlot2_ActionPerformed);
        btnKartenSlot2.setBorderPainted(false);
        btnKartenSlot2.setContentAreaFilled(false);
        btnKartenSlot2.setHorizontalAlignment(SwingConstants.LEFT);
        cp.add(btnKartenSlot2);

        btnKartenSlot3.setBounds(168, 168, 75, 105);
        btnKartenSlot3.setText("");
        btnKartenSlot3.setMargin(new Insets(2, 2, 2, 2));
        btnKartenSlot3.addActionListener(this::btnKartenSlot3_ActionPerformed);
        btnKartenSlot3.setBorderPainted(false);
        btnKartenSlot3.setContentAreaFilled(false);
        btnKartenSlot3.setHorizontalAlignment(SwingConstants.LEFT);
        cp.add(btnKartenSlot3);

        btnKartenSlot4.setBounds(248, 168, 75, 105);
        btnKartenSlot4.setText("");
        btnKartenSlot4.setMargin(new Insets(2, 2, 2, 2));
        btnKartenSlot4.addActionListener(this::btnKartenSlot4_ActionPerformed);
        btnKartenSlot4.setBorderPainted(false);
        btnKartenSlot4.setContentAreaFilled(false);
        btnKartenSlot4.setHorizontalAlignment(SwingConstants.LEFT);
        cp.add(btnKartenSlot4);

        btnKartenSlot5.setBounds(328, 168, 75, 105);
        btnKartenSlot5.setText("");
        btnKartenSlot5.setMargin(new Insets(2, 2, 2, 2));
        btnKartenSlot5.addActionListener(this::btnKartenSlot5_ActionPerformed);
        btnKartenSlot5.setBorderPainted(false);
        btnKartenSlot5.setContentAreaFilled(false);
        btnKartenSlot5.setHorizontalAlignment(SwingConstants.LEFT);
        cp.add(btnKartenSlot5);

        btnKartenSlot6.setBounds(408, 168, 75, 105);
        btnKartenSlot6.setText("");
        btnKartenSlot6.setMargin(new Insets(2, 2, 2, 2));
        btnKartenSlot6.addActionListener(this::btnKartenSlot6_ActionPerformed);
        btnKartenSlot6.setBorderPainted(false);
        btnKartenSlot6.setContentAreaFilled(false);
        btnKartenSlot6.setHorizontalAlignment(SwingConstants.LEFT);
        cp.add(btnKartenSlot6);

        btnKartenSlot7.setBounds(488, 168, 75, 105);
        btnKartenSlot7.setText("");
        btnKartenSlot7.setMargin(new Insets(2, 2, 2, 2));
        btnKartenSlot7.addActionListener(this::btnKartenSlot7_ActionPerformed);
        btnKartenSlot7.setBorderPainted(false);
        btnKartenSlot7.setContentAreaFilled(false);
        btnKartenSlot7.setHorizontalAlignment(SwingConstants.LEFT);
        cp.add(btnKartenSlot7);

        btnKartenSlot8.setBounds(568, 168, 75, 105);
        btnKartenSlot8.setText("");
        btnKartenSlot8.setMargin(new Insets(2, 2, 2, 2));
        btnKartenSlot8.addActionListener(this::btnKartenSlot8_ActionPerformed);
        btnKartenSlot8.setBorderPainted(false);
        btnKartenSlot8.setContentAreaFilled(false);
        btnKartenSlot8.setHorizontalAlignment(SwingConstants.LEFT);
        cp.add(btnKartenSlot8);

        btnKartenSlot9.setBounds(648, 168, 75, 105);
        btnKartenSlot9.setText("");
        btnKartenSlot9.setMargin(new Insets(2, 2, 2, 2));
        btnKartenSlot9.addActionListener(this::btnKartenSlot9_ActionPerformed);
        btnKartenSlot9.setBorderPainted(false);
        btnKartenSlot9.setContentAreaFilled(false);
        btnKartenSlot9.setHorizontalAlignment(SwingConstants.LEFT);
        cp.add(btnKartenSlot9);

        btnEnde.setBounds(616, 112, 83, 33);
        btnEnde.setText("ENDE");
        btnEnde.setMargin(new Insets(2, 2, 2, 2));
        btnEnde.addActionListener(this::btnEnde_ActionPerformed);
        btnEnde.setBackground(new Color(0xc0c0c0));
        cp.add(btnEnde);

        for (int i = 0; i <= 10; i++) {
            setzeLeereKarteAufSlot(i);
        }
        btnKartenSlot1.setEnabled(false);
        btnKartenSlot2.setEnabled(false);
        btnKartenSlot3.setEnabled(false);
        btnKartenSlot4.setEnabled(false);
        btnKartenSlot5.setEnabled(false);
        btnKartenSlot6.setEnabled(false);
        btnKartenSlot7.setEnabled(false);
        btnKartenSlot8.setEnabled(false);
        btnKartenSlot9.setEnabled(false);
        btnAktKarte.setEnabled(false);
    }

    private void clickStart() {
        model.initialisierenStartWerte();
        model.generiereStartKarten();
        for (int i = 0; i < 7; i++) {
            austeilenStartKarten(i, model.getSpielHand(SpielerOptionen.Spieler).get(i));
        }
        for (int i = 7; i < 9; i++) {
            austeilenStartKarten(i, model.getKartenListe().getLast());
        }
        model.setRestKarten(SpielerOptionen.Spieler, model.getSpielHand(SpielerOptionen.Spieler).size());
        model.setRestKarten(SpielerOptionen.Com, model.getSpielHand(SpielerOptionen.Com).size());
        ModelKarten aktKarte = model.generiereAktuelleKarte();
        btnAktKarte.setText(String.valueOf(aktKarte));
        model.setAktuelleKarte(aktKarte);
        btnAktKarte.setIcon(aktKarte.getBildDateiPfad());
        tfRestKartCom.setText(String.valueOf(model.getRestKarten(SpielerOptionen.Com)));
        tfUebrigeKarten.setText(String.valueOf(model.getRestKartenDeck()));
        tfGewSp.setText(String.valueOf(model.getGewSpiele(SpielerOptionen.Spieler)));
        tfAusgabe.setText("Das Spiel beginnt. Legen Sie oder ziehen Sie eine neue Karte.");

        btnKartenSlot1.setEnabled(true);
        btnKartenSlot2.setEnabled(true);
        btnKartenSlot3.setEnabled(true);
        btnKartenSlot4.setEnabled(true);
        btnKartenSlot5.setEnabled(true);
        btnKartenSlot6.setEnabled(true);
        btnKartenSlot7.setEnabled(true);
        btnKartenSlot8.setEnabled(true);
        btnKartenSlot9.setEnabled(true);
        btnAktKarte.setEnabled(true);

        btnNeueKarte.setEnabled(true);
        btnStart.setEnabled(false);
        btnNeueKarte.setEnabled(true);
        btnNeuesSpiel.setEnabled(false);
    }

    private void clickNeueKarte() {
        int restKartenSp = model.getRestKarten(SpielerOptionen.Spieler);
        if (restKartenSp < 9) {
            if (restKartenSp != 0) {
                ModelKarten karte = model.bestimmeNeueKarte();
                model.aendereSpielHand(SpielerOptionen.Spieler, karte, true);
                model.setRestKarten(SpielerOptionen.Spieler, model.getRestKarten(SpielerOptionen.Spieler) + 1);
                pruefeKartenSlots(karte);
                model.setRestKartenDeck(model.getRestKartenDeck() - 1);
                tfUebrigeKarten.setText(String.valueOf(model.getRestKartenDeck()));
                tfAusgabe.setText("Com ist dran");
            }
            if (model.getRestKartenDeck() == 0) {
                model.mischeKarten();
                tfUebrigeKarten.setText(String.valueOf(model.getRestKartenDeck()));
            }
        } else {
            tfAusgabe.setText("Sie können keine weiteren Karten aufnehmen. Beenden Sie ihren Zug");
        }
        btnNeueKarte.setEnabled(false);
        btnKartenSlot1.setEnabled(false);
        btnKartenSlot2.setEnabled(false);
        btnKartenSlot3.setEnabled(false);
        btnKartenSlot4.setEnabled(false);
        btnKartenSlot5.setEnabled(false);
        btnKartenSlot6.setEnabled(false);
        btnKartenSlot7.setEnabled(false);
        btnKartenSlot8.setEnabled(false);
        btnKartenSlot9.setEnabled(false);
        btnAktKarte.setEnabled(false);
        btnWeiter.setEnabled(true);
        int restKartenCom = model.getRestKarten(SpielerOptionen.Com);
        if (restKartenSp == 9 && restKartenCom == 9) {
            spielStillstand();
        }
    }

    private void clickWeiter() {
        btnKartenSlot1.setEnabled(true);
        btnKartenSlot2.setEnabled(true);
        btnKartenSlot3.setEnabled(true);
        btnKartenSlot4.setEnabled(true);
        btnKartenSlot5.setEnabled(true);
        btnKartenSlot6.setEnabled(true);
        btnKartenSlot7.setEnabled(true);
        btnKartenSlot8.setEnabled(true);
        btnKartenSlot9.setEnabled(true);
        btnAktKarte.setEnabled(true);
        btnNeueKarte.setEnabled(true);
        btnWeiter.setEnabled(false);
        if (!ueberpruefeLetzteKarte()) {
            comAmZug();
        }
    }

    private void clickNeuesSpiel() {
        clickStart();
    }

    private void clickAufKartenSlot(int slot, String kartenString) {
        ModelKarten karte = model.konvertiereStringZuKarte(kartenString);
        if (karte == null) {
            tfAusgabe.setText("Falsche Eingabe. Bitte klicken Sie eine andere Karte an oder nehmen Sie eine Neue Karte auf");
            return;
        }
        ModelKarten aktKarte = model.getAktuelleKarte();
        if (karte.getWert().equals(aktKarte.getWert()) || karte.getSymbol().equals(aktKarte.getSymbol())) {
            model.aendereSpielHand(SpielerOptionen.Spieler, karte, false);
            model.setRestKarten(SpielerOptionen.Spieler, model.getRestKarten(SpielerOptionen.Spieler) - 1);
            entferneKarteAufKartenSlot(slot);
            setzeLeereKarteAufSlot(slot);
            model.setAktuelleKarte(karte);
            btnAktKarte.setText(String.valueOf(karte));
            btnAktKarte.setIcon(karte.getBildDateiPfad());
            tfAusgabe.setText("Com ist dran");
            btnKartenSlot1.setEnabled(false);
            btnKartenSlot2.setEnabled(false);
            btnKartenSlot3.setEnabled(false);
            btnKartenSlot4.setEnabled(false);
            btnKartenSlot5.setEnabled(false);
            btnKartenSlot6.setEnabled(false);
            btnKartenSlot7.setEnabled(false);
            btnKartenSlot8.setEnabled(false);
            btnKartenSlot9.setEnabled(false);
            btnAktKarte.setEnabled(false);
            btnNeueKarte.setEnabled(false);
            btnWeiter.setEnabled(true);
        } else {
            tfAusgabe.setText("Falsche Eingabe. Bitte klicken Sie eine andere Karte an oder nehmen Sie eine Neue Karte auf");
            btnKartenSlot1.setEnabled(true);
            btnKartenSlot2.setEnabled(true);
            btnKartenSlot3.setEnabled(true);
            btnKartenSlot4.setEnabled(true);
            btnKartenSlot5.setEnabled(true);
            btnKartenSlot6.setEnabled(true);
            btnKartenSlot7.setEnabled(true);
            btnKartenSlot8.setEnabled(true);
            btnKartenSlot9.setEnabled(true);
            btnAktKarte.setEnabled(true);
            btnNeueKarte.setEnabled(true);
            btnWeiter.setEnabled(false);
        }
        ueberpruefeLetzteKarte();
    }

    private void clickEnde() {
        System.exit(0);
    }

    public void austeilenStartKarten(int slot, ModelKarten karte) {
        switch (slot) {
            case 0:
                btnKartenSlot1.setText(String.valueOf(karte));
                btnKartenSlot1.setIcon(karte.getBildDateiPfad());
                break;
            case 1:
                btnKartenSlot2.setText(String.valueOf(karte));
                btnKartenSlot2.setIcon(karte.getBildDateiPfad());
                break;
            case 2:
                btnKartenSlot3.setText(String.valueOf(karte));
                btnKartenSlot3.setIcon(karte.getBildDateiPfad());
                break;
            case 3:
                btnKartenSlot4.setText(String.valueOf(karte));
                btnKartenSlot4.setIcon(karte.getBildDateiPfad());
                break;
            case 4:
                btnKartenSlot5.setText(String.valueOf(karte));
                btnKartenSlot5.setIcon(karte.getBildDateiPfad());
                break;
            case 5:
                btnKartenSlot6.setText(String.valueOf(karte));
                btnKartenSlot6.setIcon(karte.getBildDateiPfad());
                break;
            case 6:
                btnKartenSlot7.setText(String.valueOf(karte));
                btnKartenSlot7.setIcon(karte.getBildDateiPfad());
                break;
            case 7:
                btnKartenSlot8.setText(String.valueOf(karte));
                btnKartenSlot8.setIcon(karte.getBildDateiPfad());
                break;
            case 8:
                btnKartenSlot9.setText(String.valueOf(karte));
                btnKartenSlot9.setIcon(karte.getBildDateiPfad());
                break;
            default:
                System.out.println("Fehler beim Austeilen");
                break;
        }
    }

    private void pruefeKartenSlots(ModelKarten karte) {
        if (btnKartenSlot1.getText().isEmpty()) {
            btnKartenSlot1.setText(String.valueOf(karte));
            btnKartenSlot1.setIcon(karte.getBildDateiPfad());
        } else if (btnKartenSlot2.getText().isEmpty()) {
            btnKartenSlot2.setText(String.valueOf(karte));
            btnKartenSlot2.setIcon(karte.getBildDateiPfad());
        } else if (btnKartenSlot3.getText().isEmpty()) {
            btnKartenSlot3.setText(String.valueOf(karte));
            btnKartenSlot3.setIcon(karte.getBildDateiPfad());
        } else if (btnKartenSlot4.getText().isEmpty()) {
            btnKartenSlot4.setText(String.valueOf(karte));
            btnKartenSlot4.setIcon(karte.getBildDateiPfad());
        } else if (btnKartenSlot5.getText().isEmpty()) {
            btnKartenSlot5.setText(String.valueOf(karte));
            btnKartenSlot5.setIcon(karte.getBildDateiPfad());
        } else if (btnKartenSlot6.getText().isEmpty()) {
            btnKartenSlot6.setText(String.valueOf(karte));
            btnKartenSlot6.setIcon(karte.getBildDateiPfad());
        } else if (btnKartenSlot7.getText().isEmpty()) {
            btnKartenSlot7.setText(String.valueOf(karte));
            btnKartenSlot7.setIcon(karte.getBildDateiPfad());
        } else if (btnKartenSlot8.getText().isEmpty()) {
            btnKartenSlot8.setText(String.valueOf(karte));
            btnKartenSlot8.setIcon(karte.getBildDateiPfad());
        } else if (btnKartenSlot9.getText().isEmpty()) {
            btnKartenSlot9.setText(String.valueOf(karte));
            btnKartenSlot9.setIcon(karte.getBildDateiPfad());
        } else {
            System.out.println("Fehler beim Prüfen der Kartenslots");
        }
    }

    private void setzeLeereKarteAufSlot(int slot) {
        switch (slot) {
            case 1 -> btnKartenSlot1.setIcon(model.getKartenListe().getLast().getBildDateiPfad());
            case 2 -> btnKartenSlot2.setIcon(model.getKartenListe().getLast().getBildDateiPfad());
            case 3 -> btnKartenSlot3.setIcon(model.getKartenListe().getLast().getBildDateiPfad());
            case 4 -> btnKartenSlot4.setIcon(model.getKartenListe().getLast().getBildDateiPfad());
            case 5 -> btnKartenSlot5.setIcon(model.getKartenListe().getLast().getBildDateiPfad());
            case 6 -> btnKartenSlot6.setIcon(model.getKartenListe().getLast().getBildDateiPfad());
            case 7 -> btnKartenSlot7.setIcon(model.getKartenListe().getLast().getBildDateiPfad());
            case 8 -> btnKartenSlot8.setIcon(model.getKartenListe().getLast().getBildDateiPfad());
            case 9 -> btnKartenSlot9.setIcon(model.getKartenListe().getLast().getBildDateiPfad());
            case 10 -> btnAktKarte.setIcon(model.getKartenListe().getLast().getBildDateiPfad());
        }
    }

    private void entferneKarteAufKartenSlot(int slot) {
        switch (slot) {
            case 1:
                btnKartenSlot1.setText("");
                btnKartenSlot1.setIcon(model.getKartenListe().getLast().getBildDateiPfad());
                break;
            case 2:
                btnKartenSlot2.setText("");
                btnKartenSlot2.setIcon(model.getKartenListe().getLast().getBildDateiPfad());
                break;
            case 3:
                btnKartenSlot3.setText("");
                btnKartenSlot3.setIcon(model.getKartenListe().getLast().getBildDateiPfad());
                break;
            case 4:
                btnKartenSlot4.setText("");
                btnKartenSlot4.setIcon(model.getKartenListe().getLast().getBildDateiPfad());
                break;
            case 5:
                btnKartenSlot5.setText("");
                btnKartenSlot5.setIcon(model.getKartenListe().getLast().getBildDateiPfad());
                break;
            case 6:
                btnKartenSlot6.setText("");
                btnKartenSlot6.setIcon(model.getKartenListe().getLast().getBildDateiPfad());
                break;
            case 7:
                btnKartenSlot7.setText("");
                btnKartenSlot7.setIcon(model.getKartenListe().getLast().getBildDateiPfad());
                break;
            case 8:
                btnKartenSlot8.setText("");
                btnKartenSlot8.setIcon(model.getKartenListe().getLast().getBildDateiPfad());
                break;
            case 9:
                btnKartenSlot9.setText("");
                btnKartenSlot9.setIcon(model.getKartenListe().getLast().getBildDateiPfad());
                break;
            default:
                System.out.println("Fehler beim Entfernen");
                break;
        }
    }

    private boolean ueberpruefeLetzteKarte() {
        int kartenSp = model.getRestKarten(SpielerOptionen.Spieler);
        int kartenCom = model.getRestKarten(SpielerOptionen.Com);
        if (kartenSp == 0) {
            model.erhoeheGewSpiele(SpielerOptionen.Spieler);
            tfAusgabe.setText("Gewonnen");
            btnKartenSlot1.setEnabled(false);
            btnKartenSlot2.setEnabled(false);
            btnKartenSlot3.setEnabled(false);
            btnKartenSlot4.setEnabled(false);
            btnKartenSlot5.setEnabled(false);
            btnKartenSlot6.setEnabled(false);
            btnKartenSlot7.setEnabled(false);
            btnKartenSlot8.setEnabled(false);
            btnKartenSlot9.setEnabled(false);
            btnAktKarte.setEnabled(false);
            btnNeueKarte.setEnabled(false);
            btnWeiter.setEnabled(false);
            btnStart.setEnabled(false);
            btnNeuesSpiel.setEnabled(true);
            return true;
        } else if (kartenCom == 0) {
            model.erhoeheGewSpiele(SpielerOptionen.Com);
            tfAusgabe.setText("Verloren");
            btnKartenSlot1.setEnabled(false);
            btnKartenSlot2.setEnabled(false);
            btnKartenSlot3.setEnabled(false);
            btnKartenSlot4.setEnabled(false);
            btnKartenSlot5.setEnabled(false);
            btnKartenSlot6.setEnabled(false);
            btnKartenSlot7.setEnabled(false);
            btnKartenSlot8.setEnabled(false);
            btnKartenSlot9.setEnabled(false);
            btnAktKarte.setEnabled(false);
            btnNeueKarte.setEnabled(false);
            btnWeiter.setEnabled(false);
            btnStart.setEnabled(false);
            btnNeuesSpiel.setEnabled(true);
            return true;
        }
        return false;
    }

    private void spielStillstand() {
        btnKartenSlot1.setEnabled(false);
        btnKartenSlot2.setEnabled(false);
        btnKartenSlot3.setEnabled(false);
        btnKartenSlot4.setEnabled(false);
        btnKartenSlot5.setEnabled(false);
        btnKartenSlot6.setEnabled(false);
        btnKartenSlot7.setEnabled(false);
        btnKartenSlot8.setEnabled(false);
        btnKartenSlot9.setEnabled(false);

        btnStart.setEnabled(false);
        btnWeiter.setEnabled(false);
        btnNeueKarte.setEnabled(false);
        btnNeuesSpiel.setEnabled(true);
        tfAusgabe.setText("Kein Zug mehr möglich. Starten Sie ein neues Spiel");
    }

    private void comAmZug() {
        ArrayList<ModelKarten> comBlatt = model.getSpielHand(SpielerOptionen.Com);
        System.out.println(comBlatt);
        if (!pruefeComKartenLegen(comBlatt) && comBlatt.size() != 9) {
            ModelKarten neueKarte = model.bestimmeNeueKarte();
            comBlatt.add(neueKarte);
            model.setRestKarten(SpielerOptionen.Com, model.getRestKarten(SpielerOptionen.Com) + 1);
            model.setRestKartenDeck(model.getRestKartenDeck() - 1);
            tfUebrigeKarten.setText(String.valueOf(model.getRestKartenDeck()));
            tfRestKartCom.setText(String.valueOf(model.getRestKarten(SpielerOptionen.Com)));
        } else if (comBlatt.size() == 9) {
            System.out.println("Volle Karten");
            return;
        }
        if (ueberpruefeLetzteKarte()) {
            return;
        }
        if (model.getRestKartenDeck() == 0) {
            model.mischeKarten();
            tfUebrigeKarten.setText(String.valueOf(model.getRestKartenDeck()));
        }
        System.out.println(comBlatt);

    }

    private boolean pruefeComKartenLegen(ArrayList<ModelKarten> comBlatt) {
        ModelKarten aktKarte = model.getAktuelleKarte();
        for (ModelKarten naechsteKarte : comBlatt) {
            if (naechsteKarte.getSymbol().equals(aktKarte.getSymbol()) ||
                    naechsteKarte.getWert().equals(aktKarte.getWert())) {
                model.setAktuelleKarte(naechsteKarte);
                btnAktKarte.setText(String.valueOf(naechsteKarte));
                btnAktKarte.setIcon(naechsteKarte.getBildDateiPfad());
                model.aendereSpielHand(SpielerOptionen.Com, naechsteKarte, false);
                model.setRestKarten(SpielerOptionen.Com, model.getRestKarten(SpielerOptionen.Com) - 1);
                tfRestKartCom.setText(String.valueOf(model.getRestKarten(SpielerOptionen.Com)));
                tfUebrigeKarten.setText(String.valueOf(model.getRestKartenDeck()));
                tfAusgabe.setText("Spieler ist dran");
                return true;
            }
        }
        return false;
    }

    private void btnStart_ActionPerformed(ActionEvent evt) {
        clickStart();
    }

    private void btnNeueKarte_ActionPerformed(ActionEvent evt) {
        clickNeueKarte();
    }

    private void btnWeiter_ActionPerformed(ActionEvent evt) {
        clickWeiter();
    }

    private void btnNeuesSpiel_ActionPerformed(ActionEvent evt) {
        clickNeuesSpiel();
    }

    private void btnKartenSlot1_ActionPerformed(ActionEvent evt) {
        clickAufKartenSlot(1, btnKartenSlot1.getText());
    }

    private void btnKartenSlot2_ActionPerformed(ActionEvent evt) {
        clickAufKartenSlot(2, btnKartenSlot2.getText());
    }

    private void btnKartenSlot3_ActionPerformed(ActionEvent evt) {
        clickAufKartenSlot(3, btnKartenSlot3.getText());
    }

    private void btnKartenSlot4_ActionPerformed(ActionEvent evt) {
        clickAufKartenSlot(4, btnKartenSlot4.getText());
    }

    private void btnKartenSlot5_ActionPerformed(ActionEvent evt) {
        clickAufKartenSlot(5, btnKartenSlot5.getText());
    }

    private void btnKartenSlot6_ActionPerformed(ActionEvent evt) {
        clickAufKartenSlot(6, btnKartenSlot6.getText());
    }

    private void btnKartenSlot7_ActionPerformed(ActionEvent evt) {
        clickAufKartenSlot(7, btnKartenSlot7.getText());
    }

    private void btnKartenSlot8_ActionPerformed(ActionEvent evt) {
        clickAufKartenSlot(8, btnKartenSlot8.getText());
    }

    private void btnKartenSlot9_ActionPerformed(ActionEvent evt) {
        clickAufKartenSlot(9, btnKartenSlot9.getText());
    }

    private void btnEnde_ActionPerformed(ActionEvent evt) {
        clickEnde();
    }
}
