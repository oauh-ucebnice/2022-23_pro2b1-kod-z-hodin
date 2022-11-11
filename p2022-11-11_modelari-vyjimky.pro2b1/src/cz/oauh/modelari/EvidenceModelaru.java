package cz.oauh.modelari;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvidenceModelaru {
    public static final String ODDELOVAC = ";";
    List<Modelar> seznamModelaru = new ArrayList<>();

    public void nactiZeSouboru(String nazevSouboru) {
        String nextLine = "";
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(nazevSouboru)))) {
            while (scanner.hasNextLine()) {
                nextLine = scanner.nextLine();
                String[] polozky = nextLine.split(ODDELOVAC);
                int rok = Integer.parseInt(polozky[1]);
                seznamModelaru.add(
                        new Modelar(
                              polozky[0], rok, polozky[2]
                        ));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Modelar> getSeznamModelaru() {
        return new ArrayList<>(seznamModelaru);
    }
}
