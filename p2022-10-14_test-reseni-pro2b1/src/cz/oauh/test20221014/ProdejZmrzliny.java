package cz.oauh.test20221014;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProdejZmrzliny {
    private int pocetProdeju;
    private double mnozstviVLitrech;
    private LocalDate datumProdeje;
    private BigDecimal utrzenaCastka;
    private boolean jeTropickyDen;
    private String poznamka;

    public ProdejZmrzliny(
            int pocetProdeju, double mnozstviVLitrech,
            LocalDate datumProdeje,
            BigDecimal utrzenaCastka,
            boolean jeTropickyDen, String poznamka) {
        this.pocetProdeju = pocetProdeju;
        this.mnozstviVLitrech = mnozstviVLitrech;
        this.datumProdeje = datumProdeje;
        this.utrzenaCastka = utrzenaCastka;
        this.jeTropickyDen = jeTropickyDen;
        this.poznamka = poznamka;
    }

//    public ProdejZmrzliny(
//            LocalDate datumProdeje,
//            BigDecimal utrzenaCastka) {
//        this.pocetProdeju = 0;
//        this.datumProdeje = datumProdeje;
//        this.utrzenaCastka = utrzenaCastka;
//        this.jeTropickyDen = false;
//        this.poznamka = "";
//    }

    public ProdejZmrzliny(
            LocalDate datumProdeje,
            BigDecimal utrzenaCastka) {
        // Volám jiný konstruktor:
        this(0, 0.0,
                datumProdeje, utrzenaCastka,
                false,"");
    }

    public int getPocetProdeju() {
        return pocetProdeju;
    }

    public void setPocetProdeju(int pocetProdeju) {
        this.pocetProdeju = pocetProdeju;
    }

    public double getMnozstviVLitrech() {
        return mnozstviVLitrech;
    }

    public void setMnozstviVLitrech(double mnozstviVLitrech) {
        this.mnozstviVLitrech = mnozstviVLitrech;
    }

    public LocalDate getDatumProdeje() {
        return datumProdeje;
    }

    public void setDatumProdeje(LocalDate datumProdeje) {
        this.datumProdeje = datumProdeje;
    }

    public BigDecimal getUtrzenaCastka() {
        return utrzenaCastka;
    }

    public void setUtrzenaCastka(BigDecimal utrzenaCastka) {
        this.utrzenaCastka = utrzenaCastka;
    }

    public boolean isJeTropickyDen() {
        return jeTropickyDen;
    }

    public void setJeTropickyDen(boolean jeTropickyDen) {
        this.jeTropickyDen = jeTropickyDen;
    }

    public String getPoznamka() {
        return poznamka;
    }

    public void setPoznamka(String poznamka) {
        this.poznamka = poznamka;
    }

    @Override
    public String toString() {
        return "ProdejZmrzliny{" +
                "pocetProdeju=" + pocetProdeju +
                ", mnozstviVLitrech=" + mnozstviVLitrech +
                ", datumProdeje=" + datumProdeje +
                ", utrzenaCastka=" + utrzenaCastka +
                ", jeTropickyDen=" + jeTropickyDen +
                ", poznamka='" + poznamka + '\'' +
                '}';
    }
}
