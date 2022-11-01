import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Panacek panacek = new Panacek();
        int cislo = 0;
        System.out.println(cislo);

        List<Nakup> seznamNakupu = new ArrayList<>();

        List<Integer> seznamCisel = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Integer nahodneCisclo = (int) Math.floor(Math.random()*10)+1;
            seznamCisel.add(nahodneCisclo);
        }

        System.out.println("Výpis listu vkuse:");
        System.out.println(seznamCisel);

        System.out.println("Každé na jeden řádek:");
        for (Integer i : seznamCisel) { // cyklus "for each"
            System.out.println(i);
        }
        System.out.println("Znovu:");
        seznamCisel.forEach(i -> System.out.println(i));
        System.out.println("A ještě kratší:");
        seznamCisel.forEach(System.out::println);
    }
}