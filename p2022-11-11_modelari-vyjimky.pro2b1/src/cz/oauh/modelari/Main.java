package cz.oauh.modelari;

import java.time.LocalDate;

public class Main {

    public static final String NAZEV_SOUBORU = "modelari.txt";

    public static void main(String[] args) {
//        try {
//            Model model = new Model(
//                    new Modelar("Karel", 1990, "karel@seznam.cz"),
//                    LocalDate.of(2021, 12, 8),
//                    true,
//                    -10,
//                    "Letadlo velké"
//                    );
//        } catch (ModelariException e) {
//            System.err.println("Nastala chyba při vytváření modelu: "+e.getLocalizedMessage());
//        }

        EvidenceModelaru evidence = new EvidenceModelaru();
        evidence.nactiZeSouboru(NAZEV_SOUBORU);
        System.out.println(evidence.getSeznamModelaru());
    }
}