package chiarafais.entities;

import chiarafais.enums.Periodicity;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static chiarafais.entities.Catalog.generateCatalog;

public class Archive {


    //esecrizio 1
    public static Books createUserBook(long ISBN , String titolo, int annoPubblicazione, long numeroPagine, String autore, String genere){
        Books libro = new Books(ISBN, titolo,annoPubblicazione,numeroPagine,autore , genere);

    return libro;
    }

    public static Magazines createUserMagazines(long ISBN, String titolo, int annoPubblicazione, long numeroPagine, Periodicity periodicity){
        Magazines rivista = new Magazines(ISBN, titolo, annoPubblicazione, numeroPagine, periodicity);

        return rivista;
    }

    //esercizio 2
    public static void remove(List<Catalog> catalogoList, int codiceId) {
        Catalog elementoDaRimuovere = catalogoList.stream().filter(elemento -> elemento.getIsbn() == codiceId).toList().getFirst();
        catalogoList.remove(elementoDaRimuovere);
        System.out.println("Hai rimosso l'elemento" + elementoDaRimuovere + "con successo");
    }
    //es 3
    public static void ricercaPerId(List<Catalog> catalogoList, int codiceId) {
        Catalog elementoDaCercare = catalogoList.stream().filter(elemento -> elemento.getIsbn() == codiceId).toList().getFirst();
        System.out.println("Hai trovato l'elemento" + elementoDaCercare);
    }

}
