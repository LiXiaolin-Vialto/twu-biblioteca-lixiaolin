package com.twu.biblioteca.Controller;

import com.twu.biblioteca.Repository.BookRepository;

public class BookListController extends BaseController{
    private String message;
    private String[] options;
    private BookRepository bookRepository;

    public BookListController() {
        message = "BookList:";
        options = new String[12];
        bookRepository = new BookRepository();
        generateBookListOptions();
    }

    public String getMessage() {
        return message;
    }

    public String[] getOptions() {
        return options;
    }

    private void generateBookListOptions() {
        String[] bookNames = bookRepository.getAllBookName();
        this.options[0] = "exit";
        this.options[1] = "go back";
        System.arraycopy(bookNames, 0, this.options, 2, bookNames.length + 2 - 2);
    }

}
