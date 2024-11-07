import java.util.Comparator;

public class AutoSorter {
    public static AutoComparator byYear = (autos) -> {
        autos.sort(Comparator.comparingInt(Auto::getYear));
        return autos;
    };
    public static AutoComparator byPrice = (autos) -> {
        autos.sort(Comparator.comparingDouble(Auto::getPrice));
        return autos;
    };
    public static AutoComparator byNumer = (autos) -> {
        autos.sort(Comparator.comparing(Auto::getNumer));
        return autos;
    };

    public static AutoComparator byBrend = (autos) -> {
        autos.sort(Comparator.comparing(Auto::getBrend));
        return autos;
    };
}
