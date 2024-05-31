package chiarafais.entities;

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
}
