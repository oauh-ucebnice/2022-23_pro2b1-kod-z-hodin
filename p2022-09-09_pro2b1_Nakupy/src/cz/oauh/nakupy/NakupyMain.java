package cz.oauh.nakupy;

import java.math.BigDecimal;
import java.time.LocalDate;

public class NakupyMain {

    public static void main(String[] args) {
        Nakup nakup1 = new Nakup(
                LocalDate.now(),
                "Rohlíky",
                BigDecimal.valueOf(7.2),
                false
        );
        Nakup nakup2 = new Nakup(
                LocalDate.of(2022, 9, 15),
                "Zmrzlina čokoládová",
                BigDecimal.valueOf(28),
                false
        );
    }

}
