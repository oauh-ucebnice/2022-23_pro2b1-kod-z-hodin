import java.math.BigDecimal;

public class Dodavka extends OsobniVozidlo implements EvidovatelneJakoMajetek {

    private BigDecimal cena;
    private int hmotnostNakladu;
    private int uzitecnaHmotnost;

    public Dodavka(int pocetSedadel, int uzitecnaHmotnost) {
        super(pocetSedadel);
        this.hmotnostNakladu = 0;
        this.uzitecnaHmotnost = uzitecnaHmotnost;
        this.cena = BigDecimal.ZERO;
    }

    public BigDecimal getCena() { return cena; }


    public int getHmotnostNakladu() {
        return hmotnostNakladu;
    }

    public void nalozNaklad(int hmotnostNakladaneho) throws VozidlaException {
        int celkem = hmotnostNakladaneho + hmotnostNakladu;
        if (celkem > uzitecnaHmotnost || celkem < 0) {
            throw new VozidlaException(
                    "Neplatná hmotnost nákladu: aktuálně: "+hmotnostNakladu+" osob, " +
                            "nakládáme: "+hmotnostNakladaneho+", " +
                            "užitečná hmotnost: "+uzitecnaHmotnost+"!");
        }
        hmotnostNakladu += hmotnostNakladaneho;
    }


}
