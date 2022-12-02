import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zakaznik zakaznik = new Zakaznik(
                "   Karel Dvořák    ",
                LocalDate.of(1997,
                        12,
                        8));
        System.out.println(zakaznik);

        List<Zakaznik> zakaznici = new ArrayList<>();

        zakaznici.add(zakaznik);
        zakaznici.add(
                new Zakaznik("Milada Dvořáková",
                        LocalDate.of(
                                1999, 10, 30)));
        zakaznici.add(
                new Zakaznik("Jana Velká",
                        LocalDate.of(
                                1988, 1, 3)));

        writeToFile(zakaznici, "vystup.txt", ":");
    }

    private static void writeToFile(List<Zakaznik> zakaznici,
                                    String soubor, String oddelovac
    ) {
        try (PrintWriter writer = new PrintWriter(
                new BufferedWriter(new FileWriter(soubor)))
        ) {

            for (Zakaznik zakaznik : zakaznici) {
                writer.println(
                       zakaznik.getJmeno()+oddelovac
                       + zakaznik.getDatumNarozeni()
                );
                // Můžu také požádat o vyprázdnění vyrovnávací paměti
                //  třídy BufferedWriter:
                // writer.flush();
            }

        } catch (IOException e) {
            // V reálné aplikaci bycho vyhodili vlastní hlídanou
            //  výjimku a poté ji zpracovali.
            // Tady nechávám aplikaci „spadnout“ s RuntimeException:
            throw new RuntimeException(
                    "Chyba při zápisu do souboru "
                           + soubor+": "+e.getLocalizedMessage());
        }
    }
}