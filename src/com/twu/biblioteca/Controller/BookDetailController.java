package com.twu.biblioteca.Controller;

import com.twu.biblioteca.Module.Book;
import com.twu.biblioteca.Repository.BookRepository;

public class BookDetailController extends BaseController{
    private String message;
    private String[] options;
    private int bookId;
    private BookRepository bookRepository;

    public BookDetailController(int bookId) {
        bookRepository = new BookRepository();
        options = new String[]{"exit", "go back", "check out this book"};
        this.bookId = bookId;
        message = generateMessage();
    }

    private String generateMessage() {
        Book book = this.bookRepository.getBookById(this.bookId);
        String result = "Book name: "+ book.getName()+"; Book author: "+book.getAuthor() +"; Publish Company: "+ book.getPublishCompany();
        return result;
    }

    public String getMessage() {
        return message;
    }

    public String[] getOptions() {
        return options;
    }

}
