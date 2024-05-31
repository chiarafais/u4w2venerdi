package chiarafais.entities;

import chiarafais.enums.Periodicity;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

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

}
