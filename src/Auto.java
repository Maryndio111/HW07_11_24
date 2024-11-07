import java.util.Objects;

public class Auto {
    private String numer;
    private String brend;
    private int year;
    private double price;

    public Auto(String numer, String brend, int year, double price) {
        this.numer = numer;
        this.brend = brend;
        this.year = year;
        this.price = price;
    }

    public String getNumer() {
        return numer;
    }

    public String getBrend() {
        return brend;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto avto = (Auto) o;
        return year == avto.year && Double.compare(price, avto.price) == 0 && Objects.equals(numer, avto.numer) && Objects.equals(brend, avto.brend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numer, brend, year, price);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "numer='" + numer + '\'' +
                ", brend='" + brend + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
