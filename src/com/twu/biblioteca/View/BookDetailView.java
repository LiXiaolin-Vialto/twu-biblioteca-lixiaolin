package com.twu.biblioteca.View;

import com.twu.biblioteca.Controller.BookDetailController;

public class BookDetailView extends View{

    BookDetailController controller;
    private int bookId;
    public BookDetailView(int bookId) {
        this.bookId = bookId;
        controller = new BookDetailController(bookId);
    }
    @Override
    public void Show() {
        System.out.println(controller.getMessage());
        PrintOptions(controller.getOptions());
    }
}
