import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Oprava> opravy = new ArrayList<>();
        opravy.add(new Oprava("3Z72211", BigDecimal.valueOf(3000)));
        opravy.add(new Oprava("3Z70011", BigDecimal.valueOf(5000)));
        opravy.add(new Oprava("3Z72211", BigDecimal.valueOf(7000)));

        String rz = "3Z72211";
        BigDecimal soucet = BigDecimal.ZERO;
        int pocetOprav = 0;
        for (Oprava oprava : opravy) {
            if (oprava.getRz().equals(rz)) {
                soucet = soucet.add(oprava.getCenaOpravy());
                pocetOprav++;
            }
        }
        System.out.println(
                "Opravy vozidla s RZ: "+rz+":\n"
                +" - pocet oprav: "+pocetOprav
                +" - celková cena: "+soucet
                +" - průměrná cena: "+(
                        soucet.divide(
                                BigDecimal.valueOf(pocetOprav),
                                RoundingMode.HALF_UP))
        );
    }
}