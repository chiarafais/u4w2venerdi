package chiarafais.entities;

public class Books extends Catalog {

    private String autore;
    private String genere;

    public String getAutore() {
        return autore;
    }

    public String getGenere() {
        return genere;
    }

    public Books (long ISBN, String titolo, int annoPubblicazione, long numeroPagine, String autore, String genere) {
        super(ISBN, titolo, annoPubblicazione, numeroPagine);
        this.autore=autore;
        this.genere=genere;


    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn=" + ISBN +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", numeroPagine=" + numeroPagine +
                ", autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                '}';
    }
}
