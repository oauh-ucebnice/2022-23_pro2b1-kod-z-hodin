import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final String NAZEV_VSTUPNIHO_SOUBORU = "vstup.txt";

    public static void main(String[] args) {
        // Insert ... přepisovací režim

        List<String> seznamRadku = new ArrayList<>();

        try (Scanner scanner = new Scanner(
                new BufferedReader(
                        new FileReader(NAZEV_VSTUPNIHO_SOUBORU)))
        ) {
            while (scanner.hasNextLine()) {
                String prectenyRadek = scanner.nextLine();
                seznamRadku.add(prectenyRadek);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        seznamRadku.forEach(System.out::println);
    }
}