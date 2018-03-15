package com.twu.biblioteca;

import com.twu.biblioteca.View.CheckedView;
import com.twu.biblioteca.View.BookDetailView;
import com.twu.biblioteca.View.BookListView;
import com.twu.biblioteca.View.MainMenuView;
import com.twu.biblioteca.View.WelcomeView;

import java.util.Scanner;

public class LibraryService {

//    private ArrayList<Book> allBooks = new ArrayList<Book>() {
//        {
//            add(new Book("Harry Potter", "JKR", "HS"));
//            add(new Book("Double City", "Charles", "HS"));
//            add(new Book("Thinking in Java", "Bruce", "JD"));
//        }
//    };
//    public void WelcomMessage() {
//        System.out.print("Welcome To Biblioteca Library");
//    }
//
//    public void BookList() {
//        for (Book book : allBooks) {
//            System.out.println(book.getName() + " " + book.getAuthor() + " " + book.getPublishCompany());
//        }
//    }


    public void start() {
        Scanner scanner = new Scanner(System.in);
        int i = -1;
        while ( i != 0 ) {
            switch (CurrentState.getCurrentState()){
                case Initialize: new WelcomeView().Show(); break;
                case MainMenu: new MainMenuView().Show(); break;
                case BookList: new BookListView().Show(); break;
                case BookDetail: new BookDetailView(i-2).Show(); break;
                case CheckedInfo: new CheckedView().Show(); break;

            }

            i = Integer.parseInt(scanner.next());
            new InputHanddler().handle(i);
        }
    }
}
