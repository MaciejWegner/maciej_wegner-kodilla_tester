
package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> bookList = new ArrayList<>();

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);
        return book;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void addToList(Book book1) {

        if (!bookList.contains(book1)) {
            bookList.add(book1);
        } else {
            System.out.println("Książka już istnieje.");
        }
    }


}
//    Stwórz nowy pakiet com.kodilla.collections.adv.immutable.special.homework, a w nim:
//
//        Klasę Book, która będzie posiadała pola private String title oraz private String author. V
//        Klasę BookManager, która będzie posiadała metodę public static Book createBook(String title, String author) i będzie tworzyła nowy obiekt klasy Book o zadanych parametrach.V
//        Klasę BookApplication z metodą main.V
//        Mając powyższe, wykonaj następujące działania:
//
//        W metodzie main utwórz 2-3 obiekty klasy Book, używając do tego celu BookManager.
//        Sprawdź, czy adresy utworzonych obiektów są takie same.
//        Zmodyfikuj klasę BookManager tak, aby podczas tworzenia obiektów klasy Book klasa ta sprawdzała, czy dany obiekt klasy Book już istnieje (o takim samym tytule i autorze).
//        W tym celu musisz wyposażyć klasę BookManager w kolekcję utworzonych dotychczas obiektów klasy Book.
//        Pole to powinno być statyczne, aby metoda createBook również mogła być statyczna (wywoływana bez potrzeby tworzenia obiektu klasy BookManager).
//        Sprawdź, czy po tej modyfikacji adresy tworzonych obiektów Book się różnią, jeżeli tytuł i autor jest taki sam.