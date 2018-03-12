package com.twu.biblioteca;

import java.util.ArrayList;

public class LibraryService {

    private ArrayList<Book> allBooks = new ArrayList<Book>() {
        {
            add(new Book("Harry Potter", "JKR", "HS"));
            add(new Book("Double City", "Charles", "HS"));
            add(new Book("Thinking in Java", "Bruce", "JD"));
        }
    };
    public void WelcomMessage() {
        System.out.println("Welcome To Biblioteca Library");
    }

    public void BookList() {
        for (int i = 0; i< allBooks.size(); i++ ) {
            Book book = allBooks.get(i);
            System.out.println(book.getName() + " " + book.getAuthor() + " " + book.getPublishCompany());
        }
    }
}
