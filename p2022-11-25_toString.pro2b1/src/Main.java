import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Zakaznik zakaznik = new Zakaznik(
                "   Karel Dvořák    ",
                LocalDate.of(1997,
                        12,
                        8));
        System.out.println(zakaznik);
    }
}