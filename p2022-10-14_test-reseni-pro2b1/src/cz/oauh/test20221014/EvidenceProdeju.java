package cz.oauh.test20221014;

import java.util.ArrayList;
import java.util.List;

public class EvidenceProdeju {
    private List<ProdejZmrzliny> prodeje
            = new ArrayList<>();

    public void pridejProdej(ProdejZmrzliny novyProdej) {
        prodeje.add(novyProdej);
    }

    public void smazProdej(ProdejZmrzliny prodej) {
        prodeje.remove(prodej);
    }
}
