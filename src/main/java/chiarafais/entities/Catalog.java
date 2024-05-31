package chiarafais.entities;

import chiarafais.enums.Periodicity;
import com.github.javafaker.DateAndTime;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.function.Supplier;

public abstract class Catalog {
    protected long ISBN;
    protected String titolo;
    protected int annoPubblicazione;
    protected long numeroPagine;

    public Catalog(long ISBN, String titolo, int annoPubblicazione, long numeroPagine) {
        this.ISBN = ISBN;
        this.titolo=titolo;
        this.annoPubblicazione=annoPubblicazione;
        this.numeroPagine=numeroPagine;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public void setNumeroPagine(long numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public long getIsbn() {
        return ISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public long getNumeroPagine() {
        return numeroPagine;
    }

    @Override
    public String toString() {
        return "ElementoBibliografico{" +
                "isbn=" + ISBN +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }


    public static Periodicity randomPeriodicity(){
        Random random = new Random();
        int num = random.nextInt(1,4);
        Periodicity defaultPeriodicity = Periodicity.SETTIMANALE;
        if(num == 1){
            defaultPeriodicity = Periodicity.MENSILE;
        }if(num == 2){
            defaultPeriodicity = Periodicity.SEMESTRALE;
        }
        return defaultPeriodicity;
    }


    public static List<Books> generateBooks() {
        List<Books> libri = new ArrayList<Books>();
        Faker faker = new Faker(Locale.ITALY);

        Supplier<Books> randomBooks = () -> new Books(faker.number().numberBetween(111111111,999999999), faker.book().title(), faker.number().numberBetween(1950,2024), faker.number().numberBetween(50,2000), faker.book().author(), faker.book().genre());
        for (int i = 0; i < 20; i++) {
            Books generateBooks = randomBooks.get();
            libri.add(generateBooks);

        }
        return libri;
    }

    public static List<Magazines> generateMagazines() {
        List<Magazines> riviste = new ArrayList<Magazines>();
        Faker faker = new Faker(Locale.ITALY);

        Supplier<Magazines> randomMagazine = () -> new Magazines(faker.number().numberBetween(111111111,999999999), faker.book().title(), faker.number().numberBetween(1950,2024), faker.number().numberBetween(50,2000),randomPeriodicity());
        for (int i = 0; i < 20; i++) {
            Magazines generateMagazines = randomMagazine.get();
            riviste.add(generateMagazines);

        }
        return riviste;
    }

}
