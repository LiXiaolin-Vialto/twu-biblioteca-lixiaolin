package com.twu.biblioteca;

import com.twu.biblioteca.Repository.BookRepository;

public class BooklistHandler {
    BookRepository bookRepository;

    BooklistHandler() {
        bookRepository = new BookRepository();
    }
    public void handle(int i) {
        String[] allBooks = bookRepository.getAllBookName();
        if (i == 1) {
            CurrentState.setCurrentState(RouteState.MainMenu);
        }
        else if( i < allBooks.length +2 && i > 0){
            CurrentState.setCurrentState(RouteState.BookDetail);
        }
    }
}
