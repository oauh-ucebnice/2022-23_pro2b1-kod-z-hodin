import java.time.LocalDate;

public class Zakaznik {

    private String jmeno;
    private LocalDate datumNarozeni;

    public Zakaznik(String jmeno, LocalDate datumNarozeni) {
        this.jmeno = jmeno;
        this.datumNarozeni = datumNarozeni;
    }

    @Override
    public String toString() {
        return jmeno.trim() + " ("
                + datumNarozeni + ")";
    }
}
