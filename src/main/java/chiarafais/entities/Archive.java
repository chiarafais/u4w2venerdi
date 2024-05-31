package chiarafais.entities;

import chiarafais.enums.Periodicity;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;


public class Archive {


    //esercizio 1
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
    //esercizio 3
    public static void ricercaPerId(List<Catalog> catalogoList, int codiceId) {
        Catalog elementoDaCercare = catalogoList.stream().filter(elemento -> elemento.getIsbn() == codiceId).toList().getFirst();
        System.out.println("Hai trovato l'elemento" + elementoDaCercare);
    }
    //esercizio 4
    public static void ricercaPerAnno(List<Catalog> catalogoList, int annoPubblicazione) {
        Catalog elementoDaCercare = (Catalog) catalogoList.stream().filter(elemento -> elemento.getAnnoPubblicazione() == annoPubblicazione).toList().getFirst();
        System.out.println("Hai trovato l'elemento" + elementoDaCercare);
    }
    //esercizio 5
    public static void ricercaAutore(List<Catalog> catalogoList, String autore) {
            Books elementoDaCercare = (Books) catalogoList.stream().filter(elemento -> elemento instanceof Books).filter(elemento -> Objects.equals(((Books) elemento).getAutore(), autore)).toList().getFirst();
            System.out.println("Hai trovato l'elemento" + elementoDaCercare);
    }
    //esercizio 6-7
    public static void addFile(List<Catalog> catalogoList) {
            File file = new File("src/listaCatalogo.txt");

        try {
            List<Catalog> catalogo = catalogoList;

            FileUtils.writeStringToFile(file, catalogo.toString() + System.lineSeparator(), StandardCharsets.UTF_8, true);

            System.out.println("File scritto correttamente!");

            String contenuto = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
            System.out.println(contenuto);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }



}
