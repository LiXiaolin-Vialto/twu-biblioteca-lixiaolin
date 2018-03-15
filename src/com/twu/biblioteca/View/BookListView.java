package com.twu.biblioteca.View;

import com.twu.biblioteca.Controller.BookListController;

public class BookListView extends View{

    private BookListController controller;
    public BookListView() {
        controller = new BookListController();
    }
    @Override
    public void Show() {
        System.out.println(controller.getMessage());
        PrintOptions(controller.getOptions());
    }
}
