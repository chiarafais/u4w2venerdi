package chiarafais.entities;

import chiarafais.enums.Periodicity;

public class Magazines extends Catalog {

    private Periodicity periodicity;

    public Magazines(long ISBN, String titolo, int annoPubblicazione, long numeroPagine, Periodicity periodicity) {
        super(ISBN, titolo, annoPubblicazione, numeroPagine);
        this.periodicity= periodicity;
    }

    public Periodicity getTipoRivista() {
        return periodicity;
    }

    @Override
    public String toString() {
        return "Magazines{" +
                "periodicity=" + periodicity +
                ", ISBN=" + ISBN +
                ", titolo='" + titolo + '\'' +
                ", numeroPagine=" + numeroPagine +
                ", annoPubblicazione=" + annoPubblicazione +
                '}';
    }
}
