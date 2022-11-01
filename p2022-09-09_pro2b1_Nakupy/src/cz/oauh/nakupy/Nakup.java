package cz.oauh.nakupy;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Nakup {
    // private...
    // zapouzdření - hodnoty atributů jsou
    //  "zvenčí" přístupné jen pomocí metod.
    private LocalDate datumNakupu;
    private String popis;
    private BigDecimal castka;
    private boolean jeMimoradny;

    // Alt+insert ... generování automatického kódu:
    //  ... gettery a settery
    //  ... konstruktory

    public Nakup(
            LocalDate datumNakupu, String popis,
            BigDecimal castka, boolean jeMimoradny) {
        this.datumNakupu = datumNakupu;
        this.popis = popis;
        this.castka = castka;
        this.jeMimoradny = jeMimoradny;
    }

    public LocalDate getDatumNakupu() {
        return datumNakupu;
    }

    public void setDatumNakupu(LocalDate datumNakupu) {
        this.datumNakupu = datumNakupu;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public BigDecimal getCastka() {
        return castka;
    }

    public void setCastka(BigDecimal castka) {
        this.castka = castka;
    }

    public boolean jeMimoradny() {
        return jeMimoradny;
    }

    public void setJeMimoradny(boolean jeMimoradny) {
        this.jeMimoradny = jeMimoradny;
    }
}
