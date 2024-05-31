package chiarafais;

import chiarafais.entities.Books;
import chiarafais.entities.Magazines;

import java.util.List;

import static chiarafais.entities.Catalog.generateBooks;
import static chiarafais.entities.Catalog.generateMagazines;

public class Application {

    public static void main(String[] args) {

        List<Books> booksList =
                generateBooks();
        System.out.println(booksList);

    List<Magazines> magazinesList =
            generateMagazines();
        System.out.println(magazinesList);
}
}
