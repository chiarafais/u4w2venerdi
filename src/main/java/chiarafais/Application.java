package chiarafais;

import chiarafais.entities.Archive;
import chiarafais.entities.Books;
import chiarafais.entities.Catalog;
import chiarafais.entities.Magazines;
import chiarafais.enums.Periodicity;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;


import static chiarafais.entities.Archive.createUserBook;
import static chiarafais.entities.Archive.createUserMagazines;
import static chiarafais.entities.Catalog.*;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    List<Catalog> catalogo = generateCatalog();
        System.out.println(catalogo);



        System.out.println("Scegli un'operazione:");
        System.out.println("1. Aggiungi un elemento");
        System.out.println("2. Rimuovi un elemento dato un codice ISBN");
        System.out.println("3. Cerca per ISBN");
        System.out.println("4. Ricerca per anno di pubblicazione");
        System.out.println("5. Ricerca per autore");
        System.out.println("6. Salva su disco l'archivio");
        System.out.println("7. Carica dall'archivio su disco");
        System.out.println("8. Esci");

        String scelta = scanner.nextLine();


    //esecrizio 1

    switch(scelta){
    case "1":{
        System.out.println("vuoi inserire un libro o una rivista?");
        String tipoElemento = scanner.nextLine();
        if(Objects.equals(tipoElemento, "libro")){
            System.out.println("inserisci isbn (solitamente 9 cifre)");
            long ISBN;
            ISBN = Long.parseLong(scanner.nextLine());
            System.out.println("inserisci titolo libro");
            String title = scanner.nextLine();
            System.out.println("inserisci anno di pubblicazione");
            int annoPubblicazione = Integer.parseInt(scanner.nextLine());
            System.out.println("inserisci numero di pagine");
            int numeroPagine = Integer.parseInt(scanner.nextLine());
            System.out.println("inserisci autore");
            String autore = scanner.nextLine();
            System.out.println("inserisci genere");
            String genere = scanner.nextLine();
            catalogo.add(createUserBook(ISBN,title,annoPubblicazione,numeroPagine,autore,genere));
            System.out.println("libro "+ title + " aggiunto alla lista !");
            System.out.println("ecco la lista aggiornata : " + catalogo);

        }else{

            System.out.println("inserisci isbn (solitamente 9 cifre)");
            long ISBN;
            ISBN = Long.parseLong(scanner.nextLine());
            System.out.println("inserisci titolo rivista");
            String title = scanner.nextLine();
            System.out.println("inserisci anno di pubblicazione");
            int annoPubblicazione = Integer.parseInt(scanner.nextLine());
            System.out.println("inserisci numero di pagine");
            int numeroPagine = Integer.parseInt(scanner.nextLine());
            System.out.println("inserisci periodicità tra SETTIMANALE, MENSILE, SEMESTRALE");
            Periodicity periodicity = Periodicity.valueOf(scanner.nextLine());
            catalogo.add(createUserMagazines(ISBN,title,annoPubblicazione,numeroPagine, periodicity));
            System.out.println("Rivista "+ title + " aggiunta alla lista !");
            System.out.println("ecco la lista aggiornata : " + catalogo);

        }
    }
    //esercizio 2
        case "2" :{
            System.out.println("inserisci un codice ISBM corretto per rimuovere un elemento");
            int ISBN;
            ISBN = Integer.parseInt(scanner.nextLine());
            Archive.remove(catalogo, ISBN);
            System.out.println("ecco la lista aggiornata : " + catalogo);
        }
        //esercizio 3
        case "3" :{
            System.out.println("inserisci un codice ISBM corretto per cercare un elemento");
            int ISBN;
            ISBN = Integer.parseInt(scanner.nextLine());

            Archive.ricercaPerId(catalogo, ISBN);
        }

    }







}
}
