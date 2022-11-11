package cz.oauh.modelari;

import java.time.LocalDate;

public class Model {
    private Modelar vlastnik;
    private LocalDate datumVyroby;
    private boolean jeVSoutezi;
    private int meritko;
    private String popis;

    public Model(Modelar vlastnik, LocalDate datumVyroby, boolean jeVSoutezi, int meritko, String popis) {
        this.vlastnik = vlastnik;
        this.datumVyroby = datumVyroby;
        this.jeVSoutezi = jeVSoutezi;
        setMeritko(meritko);
        this.popis = popis;
    }

    public Modelar getVlastnik() {
        return vlastnik;
    }

    public void setVlastnik(Modelar vlastnik) {
        this.vlastnik = vlastnik;
    }

    public LocalDate getDatumVyroby() {
        return datumVyroby;
    }

    public void setDatumVyroby(LocalDate datumVyroby) {
        this.datumVyroby = datumVyroby;
    }

    public boolean isJeVSoutezi() {
        return jeVSoutezi;
    }

    public void setJeVSoutezi(boolean jeVSoutezi) {
        this.jeVSoutezi = jeVSoutezi;
    }

    public int getMeritko() {
        return meritko;
    }

    public String getMeritkoCitelne() {
        return "1:"+getMeritko();
    }

    public void setMeritko(int meritko) {
        if (meritko <=0) {
            // System.err.println("Měřítko nesmí být záporné ("+meritko+")!");
            throw new RuntimeException("Měřítko nesmí být záporné ("+meritko+")!");
        }
        this.meritko = meritko;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }
}
