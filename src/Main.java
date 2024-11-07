import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Auto> autos = Arrays.asList(
                new Auto("KK1234", "BMW", 2015, 20000),
                new Auto("MW890", "Mersedes", 2018, 7000),
                new Auto("ST7899", "Fiat", 2005, 1300),
                new Auto("WA8765", "Audi", 2010, 2500)

        );
        System.out.println("Sorted by Brend");
        AutoSorter.byNumer.sort(autos).forEach(System.out::println);


        System.out.println("Sorted by Numer ");
        AutoSorter.byNumer.sort(autos).forEach(System.out::println);

        System.out.println("Sorted by Year");
        AutoSorter.byNumer.sort(autos).forEach(System.out::println);

        System.out.println("Sorted by Price");
        AutoSorter.byNumer.sort(autos).forEach(System.out::println);

    }
}
